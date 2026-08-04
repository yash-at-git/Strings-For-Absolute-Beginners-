package StringOperations;

import java.sql.SQLOutput;

public class DeleteOperations {
    public static void main(String[] args) {
        //String s = "name";

        //Q. Remove at a given index.
        //Method 1. using substring
//        int index = 1;
//        s = s.substring(0,index)  //print the characters till the index. -> n (index is exclusive)
//                + s.substring(index+1);//print the characters from index till end of String.
//        System.out.println(s); //nme

        //Method 2. using Stringbuilder
//        StringBuilder sb = new StringBuilder("name");
//        sb.deleteCharAt(1);//inbuilt metthod of sb to delete a character at a particular index
//        System.out.println(sb); //nme

        //Q. REMOVE A SUBSTRING :

        //Method 1. using replace()
        //String str = "I LOVE JAVA";
//        String result = str.replace("LOVE ", "");
//        System.out.println(result); //I JAVA

        //METHOD 2. using substring()

//        String st = "ILOVEJAVA";
//        int start = 1;
//        int end = 5;
//        String result = st.substring(0, start) + str.substring(end+1); //just use change the value of start/end to remove something
//        System.out.println(result); //I JAVA

        //Q. Remove All Occurrences of a Character

        //using replace()

//        String str = "WOW";
//        String result = str.replace("W", "");
//        System.out.println(result);//O

        //using loop

//        String str = "hahahhahha";
//        char remove = 'a'; //target character that we have to remove
//        String result = ""; //new empty string
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) != remove) { //if char is not equal to the character we assigned to remove, add it to the result string
//                result += str.charAt(i);
//            }
//        }
//        System.out.println(result); //hhhhhh

        //using Stringbuilder (optimized/better option)

        String str = "hahhahaha";
        char remove = 'a';
        StringBuilder sb = new StringBuilder(); //everything same just use SB. instead of new string object
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != remove) {
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}
