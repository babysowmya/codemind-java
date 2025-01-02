import java.util.Scanner;
public class VowelConsonantCounter {
 public static void main(String[] args) {
 Scanner read = new Scanner(System.in);
 String input = read.nextLine();
 int vowelCount = 0;
 int consonantCount = 0;
 input = input.toLowerCase();
 for (int i = 0; i < input.length(); i++) {
     char ch = input.charAt(i);
     if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
          vowelCount++;
     }
     else if (ch >= 'a' && ch <= 'z') {
        consonantCount++;
     }
 }
 System.out.println("vowels: " + vowelCount);
 System.out.println("consonants: " + consonantCount);
 }
}

