package StringOperations;

public class SearchOperations {
    public static void main(String[] args) {
        //1. Find a character :

        //method 1. using charAt() method - use when u already know the position/index of char.
        //String text = "I Love Java";
//        System.out.println(text.charAt(0));//J
//        System.out.println(text.charAt(5));//L

        //Method 2. using indexOf() - to find where a character exist.
        //suppose u want to know where is 'L'
//        System.out.println(text.indexOf('L'));//5
//        System.out.println(text.indexOf('a'));//8 - when duplicate letter are there it always return the index of first occurrence.
//        System.out.println(text.indexOf('Y'));//Y doesnt exist so it will return -1


        //2. Find a Substring : a substring is nothing but a part of the string

        //using indexOf() method
        //System.out.println(text.indexOf("Java")); //return 7 cuz 'J' of java start from index 7, if string doesnt exist it will return -1.

        //you can start searching from a particular index for a character.
//        String text = "banana";
//        System.out.println(text.indexOf('a')); //1
//        System.out.println(text.indexOf('a', 2)); //3, same can be done for searching a substring.

        //Count occurrences of character :
//        char target = 'a';
//        int count = 0;
//
//        for(int i = 0; i < text.length(); i++)
//        {
//            if(text.charAt(i) == target) //if true count+1
//            {
//                count++;
//            }
//        }
//        System.out.println(count);//3

        //Count occurrences of a substring
        String s = "Java Java Java";
        String target = "Java";

        int count = 0;
        int index = 0;

        while((index = s.indexOf(target, index)) != -1)
        {
            count++;
            index = index + target.length();
        }
        System.out.println(count);//3



    }
}
