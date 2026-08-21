package StringOperations.StringHandlingQuestions;
import java.util.*;

public class Q1 {
    //Take a string input and print its length.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type a sentence or word : ");
        String str = sc.nextLine();
        System.out.println(str.length());
        sc.close();
    }
}
