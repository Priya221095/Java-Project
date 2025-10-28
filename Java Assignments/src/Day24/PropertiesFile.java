package Day24;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {
    // Generic method to read any key from properties file
    public static String getPropertyValue(String filePath, String key) {
        Properties prop = new Properties();
        try (FileInputStream fis = new FileInputStream("C:\\STAD Solutions\\Practice\\Java Assignments\\src\\Day24\\config.properties")) {
            prop.load(fis); // Load properties file
            return prop.getProperty(key);// Return value of specified key
        } catch (IOException e) {
            System.out.println("Error reading properties file: " + e.getMessage());
            return null;
        }
    }
    public static void main(String[] args) {
        String filePath = "C:\\STAD Solutions\\Practice\\Java Assignments\\src\\Day24\\config.properties"; // path to the properties file

        // Example usage
        String url = getPropertyValue(filePath, "url");
        String username = getPropertyValue(filePath, "username");
        String password = getPropertyValue(filePath, "password");

        System.out.println("URL: " + url);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}
