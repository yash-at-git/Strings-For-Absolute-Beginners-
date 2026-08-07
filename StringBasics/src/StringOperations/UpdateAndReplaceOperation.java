package StringOperations;

public class UpdateAndReplaceOperation {
    public static void main(String[] args) {
        /*Strings in Java are immutable.
        This means once a String is created, it cannot be changed.
        Whenever you "replace" something, Java actually creates a new String and leaves the original unchanged.*/

//        String s = "hye";
//        s.replace('h','b');
//        System.out.println(s); // prints hye. but why ? bcuz i replaced the letter but didnt store the ew string anywhere.
//
//        //here is the right way to ddo this :
//        s = s.replace('h','b'); //updating s with replaced string.
//        System.out.println(s);//bye.


        //1.Replace a Character at an Index
//        String s = "java";
//        //method 1. using substring.
//        s = 'L' + s.substring(1); // L + every character from index 1 til end
//        System.out.println(s); //Lava
//
//        //method 2. StringBuilder
//        StringBuilder sb = new StringBuilder("Java");
//        sb.setCharAt(0, 'L'); //replace J with L - SB is mutable
//        System.out.println(sb);//Lava

        //2. Replace All Occurrences of a Character
        //simply use the replace().
//        String s = "banana";
//        s = s.replace('a', 'o');
//        System.out.println(s); //bonono - replaces all occurrences of a with o.
//
//        //Replace All Occurrences of a Substring
//        String str = "I like Java. Java is fun.";
//        str = str.replace("Java", "Python");
//        System.out.println(str); //I like Python. Python is fun. - ez !!

        //3. Replace the First Occurrence - we can use the replaceFIrst() method.
        String sent = "Java Java Java";
        sent = sent.replaceFirst("Java", "Python");
        System.out.println(sent); //Python Java Java

        //NOTE : replaceFirst() treats the first argument as a regular expression (regex), not plain text.
        //Example: String str = "1.2.3";
        //System.out.println(str.replaceFirst(".", "X"));
        //Output: X.2.3
        //Why? Because . in regex means any single character, so the first character (1) is replaced.
        //If you want to replace a literal dot (.), escape it:
        //String str = "1.2.3";
        //System.out.println(str.replaceFirst("\\.", "X"));
        //Output:1X2.3
    }
}
