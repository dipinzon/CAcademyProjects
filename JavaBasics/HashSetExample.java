import java.util.HashSet;
public class HashSetExample {
    public static void main (String[] args)
    {

        HashSet<String> hset = new HashSet<String>();
        
        //Addition of elements to the Hashset (The order of the elements stored within a HashSet is random.)
        //LinkedHashSet is sorted
        hset.add("Apple");
        hset.add("Mango");
        hset.add("Grapes");
        hset.add("Orange");
        hset.add("Fig");

        //Addition of duplicate elements
        hset.add("Apple");
        hset.add("Mango");
       
        hset.add(null);

        //Print Hset
        System.out.println(hset);


    }
    
}
