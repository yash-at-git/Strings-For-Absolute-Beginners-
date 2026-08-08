package StringOperations;

public class ReverseOperation {
    public static void main(String[] args) {
        //reversing a string is a very imp. thing to know .
//        String s = "i love java";
//
//        //1.Reverse the full string - "avaj evol i"
//        //Method 1. using for loop
//        String reverse = "";
//
//        for (int i = s.length() - 1; i >= 0; i--) {
//            reverse = reverse + s.charAt(i);
//        }
//        System.out.println(reverse);

        //method 2. using StringBuilder
//        String str = "Java";
//        StringBuilder sb = new StringBuilder(str);
//        sb.reverse();
//        System.out.println(sb);//avaJ

        //2. Reverse words in a sentence
//        String str = "i love java";
//
 //        String[] words = str.split(" "); //create a array of string type and store each word of the sentence using the split().
//        //words[0] = "i"
//        //words[1] = "love"
//        //words[2] = "java"
//
//        for (int i = words.length - 1; i >= 0; i--) {
//            System.out.print(words[i] + " ");//java love i
//        }

        //using stringBuilder :
//        String st = "my name is xyz";
//        String[] words = st.split(" ");
//        StringBuilder result = new StringBuilder();
//
//        for (int i = words.length - 1; i >= 0; i--) {
//            result.append(words[i]);
//            if (i != 0) {
//                result.append(" ");
//            }
//        }
//        System.out.println(result);

        //3. Reverse Each Word Individually

//        String s = "java is easy"; // -> avaj si ysae
//
//        String[] words = s.split(" ");
//        for (String word : words) {
//            String reverse = "";
//            for (int i = word.length() - 1; i >= 0; i--) {
//                reverse = reverse + word.charAt(i);
//            }
//            System.out.print(reverse + " ");
//        }


        //using stringbuilder :

//        String str = "Java is easy";
//        String[] words = str.split(" ");
//        for (String word : words) {
//            String reverse = new StringBuilder(word)
//                    .reverse()
//                    .toString();
//
//            System.out.print(reverse + " ");
//        }
    }

}
