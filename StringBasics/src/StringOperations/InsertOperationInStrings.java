package StringOperations;
import java.util.*;

public class InsertOperationInStrings {
    public static void main(String[] args) {
        String s = "hello";

        //IMP. POINT TO NOTE - In Java, strings are immutable, which means once a String is created, it cannot be changed.
        // So when you "insert" something into a String, Java actually creates a new string.


        //insert/Append at the end. - means adding at the end of the string.
        //in Strings insertion can be done using two methods :

        //1. Strings
        //System.out.println(s+" world"); //prints Hello world
        //OR
        //s = s + " world"; -> this is better
        //System.out.println(s); //prints hello world. both ways a new String is created.


        //2.using the StringBuilder method, first import jav.util.*;
       // StringBuilder sb = new StringBuilder("Hello");
        //sb.append(" world"); //add at the end of the string, very common method and V. Imp. as well.
       // System.out.println(sb);

        //Q. NOW INSERT AT A GIVEN INDEX

        //e.g = hello -> insert world at index 2. => heworldllo.

        //method 1 - using Strings

        //int index = 2;

        //String result = s.substring(0,index) //prints from 0th index to whatever the value of index.
             //   + "world" //add world after index 2.
           //     + s.substring(index); //from index till end.

        //System.out.println(result); //heworldllo

        //method 2 - using StringBuilder.

//        StringBuilder sb = new StringBuilder("Hello");
//        sb.insert(2, "Java");
//        System.out.println(sb);

        //Q. PREPEND/INSERT AT THE BEGINNING
        //using String.

        String str = "World";
        str = "Hello " + str; //ez
        System.out.println(str);

        //using Stringbuilder :
        StringBuilder sb = new StringBuilder("World");
        sb.insert(0, "Hello ");
        System.out.println(sb);
    }
}
