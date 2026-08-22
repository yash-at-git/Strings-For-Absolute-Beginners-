package StringOperations.StringHandlingQuestions;

public class Q4 {
    //Q. Count how many characters excluding spaces are in the string.
    public static void main(String[] args) {

        //approach 1 :
        String s = "java is easy";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                count++;
            }
        }
        System.out.println(count);

        //approach 2 : shorter
        System.out.println(s.replace(" ","").length()); //you see how inbuilt functions make things easier.
    }
}
