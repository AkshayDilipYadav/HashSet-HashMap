import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
HashMap<String, Integer> empIds = new HashMap<>();
empIds.put("John", 12345);
        empIds.put("Carl", 54321);

        empIds.put("Jerry", 8675309);
System.out.println(empIds);
System.out.println(empIds.get("Carl"));
        System.out.println(empIds.get("Jerry"));
        System.out.println(empIds.get("John"));
        System.out.println(empIds.containsKey("Jerry"));
        System.out.println(empIds.containsKey("George"));
        System.out.println(empIds.containsValue(6));
        System.out.println(empIds.containsValue(8675309));
        System.out.println();
        empIds.put("John", 98765);
        empIds.put("john", 98765);
        System.out.println(empIds);

    }
}