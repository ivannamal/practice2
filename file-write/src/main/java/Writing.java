import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;
import java.io.IOException;

public class Writing {
    public static void main(String[] args) {
        // String to write to the file
        String content = "hello";

        // Path to the output file
        String filePath = "C:\\pr2\\file-write\\src\\main\\resources\\written.txt";

        try {
            // Write the string to the file
            Files.write(Paths.get(filePath), content.getBytes(StandardCharsets.UTF_8));
            System.out.println("Successfully wrote to the file: " + filePath);
        } catch (IOException e) {
            // Handle the exception if there is an error writing to the file
            System.err.println("An IOException was caught: " + e.getMessage());
        }
    }
}
