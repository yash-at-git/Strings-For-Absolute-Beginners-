package StringOperations;

public class CaseAndTrimOperations {
    public static void main(String[] args) {
//        String s = "hello world";
//        String str = "HELLO WORLD";
//
//        //convert to upper case : using the inbuilt .toUpperCase() method.
//        System.out.println(s.toUpperCase()); //HELLO WORLD
//
//        //convert to lower case : using the inbuilt .toLowerCase() method.
//        System.out.println(str.toLowerCase()); //hello world

        //trim leading and trailing spaces : i.e space before string or after string.

        String s = "  Java  "; //there are extra spaces before and after the string so we will use the .trim() method.

        System.out.println(s.trim()); //java : trim method doesnt remove the middle spaces.


        //Remove all spaces : leading/trailing/middle all spaces will be removed.

        String str = " i a m java ";
        System.out.println(str.replace(" ","")); //iamjava : all spaces replaced. EZ

    }
}
