import java.util.HashMap;
class MapTester
{

  public static void main(String[] args) {

    Set<String> contact = new Set<>();
    contact.add("a","1");


    System.out.println(contact.size());
    System.out.println(contact.get("a"));
    contact.add("a","5");
    System.out.println(contact.get("c"));
    contact.put("b","5");
    System.out.println(contact.size());
  }


}
