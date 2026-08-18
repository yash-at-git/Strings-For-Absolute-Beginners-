package StringOperations;

public class SplitAndJoinOperation {
    public static void main(String[] args) {
        String s = "hello world";

        //Substring/slice Operations in Java : not something new we have already covered it previously just using the substring method only focus more on how index matters.
//        s.charAt(0);  // h
//        s.charAt(1);  // e
//        s.charAt(2);  // l
//        s.charAt(3);  // l
//        s.charAt(4);  // o

        //so, substring from i to j means index i to index j : 0 to 3,4,5 etc

//        System.out.println(s.substring(0,4)); //hell -> here i is inclusive and j is exclusive
//        System.out.println(s.substring(0));//if u only pass one index it will print from that index to the rest of string


        //Prefix Extraction : prefix is a part of the string starting from the beginning
        //just pass 0 in the substring mehtod and eneter the index to which u want the string as prefix

        String str = "Mr java";
        System.out.println(str.substring(0,2)); //we extracted Mr as prefix

        //treating prefix value as variable :
//        int k = 2;
//        String prefix = str.substring(0, k);
//        System.out.println(prefix);//Mr

        //suffix extraction -> same concept just pass the index from which u want the suffix (only one value)
        System.out.println(str.substring(3));//java
        //suffix questions can also be done using str.length()-k -> very useful formula


    }
}
