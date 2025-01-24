package cho.info.utli;

public class CustomTexture {

    public static String getTexture(String fileName) {
        return "http://localhost:2701/assets/textures" + fileName + ".png";
    }

    public static String getSound(String fileName) {
        return "http://localhost:2701/assets/music/" + fileName + ".waw";
    }

}
