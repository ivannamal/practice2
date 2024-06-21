import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;
import java.io.IOException;
import java.util.List;

public class IsWrittenCorrectly {

    public static void main(String[] args) {
        // Path to the file to check
        String filePath = "written.txt";

        // Expected content
        String expectedContent = "hello";

        // Check if the file content is correct
        boolean result = isFileContentCorrect(filePath, expectedContent);

        // Print the result
        if (result) {
            System.out.println("The content of the file is correct.");
        } else {
            System.out.println("The content of the file is incorrect.");
        }
    }

    public static boolean isFileContentCorrect(String filePath, String expectedContent) {
        try {
            // Read all lines from the file
            List<String> lines = Files.readAllLines(Paths.get(filePath), StandardCharsets.UTF_8);

            // Join the lines to form the file content as a single string
            String fileContent = String.join("\n", lines);

            // Compare the file content with the expected content
            return fileContent.equals(expectedContent);
        } catch (IOException e) {
            // Handle the exception if there is an error reading the file
            System.err.println("An IOException was caught: " + e.getMessage());
            return false;
        }
    }
}

