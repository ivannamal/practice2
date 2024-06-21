import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;
import java.io.IOException;
import java.util.List;

public class ReadFile {
    public static void main(String[] args) {
        String filePath = "C:\\pr2\\file-reading\\src\\main\\resources\\file.txt";
        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath), StandardCharsets.UTF_8);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("An IOException was caught: " + e.getMessage());
        }
    }
}
