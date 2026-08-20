package StringOperations;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ValidationOperations {
    public static void main(String[] args) {
        //check/validation operations :

        //Q1. check palindrome : palindrome words are those words that are spelled the same from right to left and vice versa
        //e.g : madam, racecar, naman etc

        String s = "meow"; //the very basic thing we have to check is if the first and last letter are same or not if that false its ddefinitely not a palindrome
        //so we will use the two pointer method : one pointer at index 0 and one at last index.
//        int left = 0;
//        int right = s.length() - 1;
//
//        boolean isPalindrome = true; //initially will treat the string as palindrome but iff it fails our conditions its not.
//
//        while (left < right) {
//            if (s.charAt(left) != s.charAt(right)) { //comapre the character of each pointer
//                isPalindrome = false; //update the result
//                break; //stop the search further.
//            }
//            left++; //move the pointers anyway
//            right--;
//        }
//        System.out.println(isPalindrome); //print the result

        //Q. check anagrams : Two strings are anagrams if they contain the same characters with the same frequencies, but possibly in a different order.
//        String s2 = "meow";
//        //base condition to start the checking will be length if the length is not same simply return false.
//
//        if (s.length() != s2.length()) {
//            System.out.println("not a anagram");
//        }
//
//        //now the very imp. part : we will simply :
//        //1.Convert both strings into character arrays
//        char[] arr1 = s.toCharArray();//this looks something like this : ['m','e','o','w']
//        char[] arr2 = s2.toCharArray();
//        //2.Sort both arrays
//        Arrays.sort(arr1); //this looks something like this : ['e','m','o','w']
//        Arrays.sort(arr2);
//        //3.Compare them
//        if (Arrays.equals(arr1, arr2)) {
//            System.out.println("anagram");
//        } else //yes u can write the else statement like this without {}
//            System.out.println("not a anagram"); //ez

        //Q. check if a stirng starts with a specific character or not : using the startsWith method (u can check a seq. as well)

//        System.out.println(s.startsWith("me"));//true
//        System.out.println(s.startsWith("Me"));//false, why ? cuz java strings are case sensitive so make sure the case is correct.

        //similarly we have endsWith : to check if a string ends with a specific character or seq :

//        System.out.println(s.endsWith("ow"));//true
//        System.out.println(s.endsWith("Ow"));//false, again case sensitive.

        //Q. Check whether it contains a substring : using contains() method :

        String str = "java is fun";
        if(str.contains("fun")){
            System.out.println("true");
        }else System.out.println("false"); // ez and simple. u can check for char as well as word or seq whatevr



    }
}
