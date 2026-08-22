package StringOperations.StringHandlingQuestions;

public class Q5 {
    // Count how many words are in a sentence.
    public static void main(String[] args) {
        String str = "java is easy and fun";

        String[] words = str.trim().split("\\s+"); //here as we know trim removes the leading and trailing spaces and
        // .split cuts the sentence from the pattern we provide it currently we have //s+ which means one or more spaces(go and read about regex in java)
        //so over all what we have done is made a word array that stores words of the str which are splited based on the regex conditon (one or more space)
        System.out.println("Number of words: " + words.length); //then we just simply print the length of the array - which is nothing but number of words.
    }
}
