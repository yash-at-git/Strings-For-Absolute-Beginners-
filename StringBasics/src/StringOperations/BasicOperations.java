package StringOperations;
import java.util.*;

//this module is going to cover the foundational/basic operations that we can perform on a string and later they are
// going to assist us in DSA problems. So make sure u understand the basics nicely.


public class BasicOperations {
    public static void main(String[] args) {
        String s = "name"; //small things to notice the 'S' in String is always capital and the value must be inside ("")
        //int i = 0; //index value
        //operation one : access character at a particular index. (just like we do with arrays)
        //System.out.println(s.charAt(i)); //here whatever value u pass to i it will pont to that index. here it is 0 so output will be n.

        //using a loop to print all the character.
//        for(int i=0;i<s.length();i++){
//            System.out.print(s.charAt(i) + " "); //output will be - n a m e
//        }

        //OPERATION 2 : find the length of string - using inbuilt method.
        //System.out.println(s.length()); // 4

        //Operation 3 - traverse the string - usign for loop
        //for(int i=0;i<s.length();i++){
//            System.out.print(s.charAt(i) + " "); //output will be - n a m e
//        }

        //OPERATION 3 : String comparison - this is an extremely imp. topic of string this teaches many things.
        //1. String is an Object in java so that why the 's' is capital in it.
        //2. A string can be compared by 2 things first is reference and second is by value. will discuss both DW.


        //comparing strings using '==' is equal operator. (== operator is always used to compare reference which is memory address of the String Object
        //I highly suggest u to stop here and learn about how memory allocation works(specially for Strings) in java not in very depth but at least know the basics,
        //and if u are already aware of how String Objects are stored then u will understand what does reference comparison mean.
        //its nothing but just checking if the memory address of the String Object are same or different.
        //very easy to spot if we use "new keyword" it will create a new String object, and the reference wont be same.

        String s2 = "name";
        //System.out.println(s == s2); //true bcuz we didnt use the new keyword both the are pointing to the same reference that is stored in the string pool
        String s3 = new String("name");
        //System.out.println(s2 == s3); //false, cuz new keyword creates a new object which is out of the string pool.


        //using the .equals() method - its easy and very basic it just compares the actual value of the String object.

        System.out.println(s2.equals(s3)); //true cuz both have value as name. if u change value of one it will give false.

    }
}
