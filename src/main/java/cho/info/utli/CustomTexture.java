package cho.info.utli;

public class CustomTexture {

    public static String getItemUrl(String fileName) {
        return "http://localhost:2701/assets/" + fileName + ".png";
    }

    public static String getSoundUrl(String fileName) {
        return "http://localhost:2701/assets/" + fileName + ".waw";
    }

}
