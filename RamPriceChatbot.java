import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RamPriceChatbot {
    public static void main(String[] args) {
        // Initialize RAM data (size -> price)
        Map<String, Integer> ramData = new HashMap<>();
        ramData.put("4GB", 50);
        ramData.put("8GB", 80);
        ramData.put("16GB", 120);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("You: ");
            String userQuery = scanner.nextLine();

            if (userQuery.equalsIgnoreCase("exit")) {
                System.out.println("Chatbot: Goodbye!");
                break;
            }

            String ramSize = extractRamSize(userQuery);
            int price = findPrice(ramData, ramSize);

            if (price != -1) {
            } else {
                System.out.println("Chatbot: RAM size not found.");
            }
        }

        scanner.close();
    }

    private static String extractRamSize(String query) {
        // Extract RAM size from user query (you can enhance this logic)
        String[] words = query.split("\\s+");
        for (String word : words) {
            if (word.matches("\\d+GB")) {
                return word;
            }
        }
        return "unknown";
    }

    private static int findPrice(Map<String, Integer> ramData, String ramSize) {
        return ramData.getOrDefault(ramSize, -1);
    }
}
