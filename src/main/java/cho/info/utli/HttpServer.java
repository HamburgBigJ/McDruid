package cho.info.utli;

import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.logging.Logger;

public class HttpServer {

    private com.sun.net.httpserver.HttpServer server;
    private final Logger logger = Logger.getLogger(HttpServer.class.getName());

    public void startHttpServer() {
        try {
            server = com.sun.net.httpserver.HttpServer.create(new InetSocketAddress(2701), 0);
            logger.info("HTTP-Server started on port 2701");

            server.createContext("/assets", new AssetsHandler());

            server.start();
        } catch (IOException e) {
            logger.severe("Error starting HTTP server: " + e.getMessage());
        }
    }

    public void stopHttpServer() {
        if (server != null) {
            server.stop(0);
            logger.info("HTTP server stopped!");
        }
    }

    private class AssetsHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            String requestedPath = exchange.getRequestURI().getPath().replace("/assets", "");

            if (requestedPath.endsWith(".png") || requestedPath.endsWith(".odg")) {
                InputStream assetStream = getClass().getClassLoader().getResourceAsStream("assets" + requestedPath);

                if (assetStream != null) {
                    String contentType = "application/octet-stream";
                    if (requestedPath.endsWith(".png")) {
                        contentType = "image/png";
                    } else if (requestedPath.endsWith(".odg")) {
                        contentType = "audio";
                    }

                    exchange.getResponseHeaders().set("Content-Type", contentType);
                    exchange.sendResponseHeaders(200, assetStream.available());

                    try (OutputStream os = exchange.getResponseBody()) {
                        byte[] buffer = new byte[1024];
                        int bytesRead;
                        while ((bytesRead = assetStream.read(buffer)) != -1) {
                            os.write(buffer, 0, bytesRead);
                        }
                    } catch (IOException e) {
                        logger.severe("Error writing response: " + e.getMessage());
                    } finally {
                        assetStream.close();
                    }
                } else {
                    String errorMessage = "Asset not found!";
                    exchange.sendResponseHeaders(404, errorMessage.length());
                    try (OutputStream os = exchange.getResponseBody()) {
                        os.write(errorMessage.getBytes());
                    }
                }
            } else {
                String errorMessage = "Unsupported file type!";
                exchange.sendResponseHeaders(415, errorMessage.length());
                try (OutputStream os = exchange.getResponseBody()) {
                    os.write(errorMessage.getBytes());
                }
            }
        }
    }


    public static void main(String[] args) {
        HttpServer httpServer = new HttpServer();
        httpServer.startHttpServer();
    }
}
