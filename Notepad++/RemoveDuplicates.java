import java.util.LinkedHashSet;

public class RemoveDuplicates {
  public static void main(String[] args) {
    String input = "1223334444";

    // Use a LinkedHashSet to store unique numbers
    LinkedHashSet<Character> set = new LinkedHashSet<>();
    for (char c : input.toCharArray()) {
      set.add(c);
    }

    // Convert the LinkedHashSet back to a string
    StringBuilder output = new StringBuilder();
    for (char c : set) {
      output.append(c);
    }

    System.out.println("Input string: " + input);
    System.out.println("Output string: " + output);
  }
}
