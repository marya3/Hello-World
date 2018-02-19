import java.util.*;

public class Testtt {

   public static void main(String[] args) {

       HashMap<String, Integer> Contacts = new HashMap<>();

       for (int k = 1; k < 5; k++){

           Contacts.put("Adam"+k , (k + 100));

       }

       System.out.println(Contacts);

   }
 }
