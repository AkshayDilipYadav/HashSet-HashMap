import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class Main {
    public static void main(String[] args) {
 Set<String> names = new HashSet<>();
  names.add("Walter");
        names.add("Jesse");
        names.add("Skylar");
        names.add("Mike");
        names.add("Saul");
        names.add("Walter");

        names.remove("Walter");


        System.out.println(names);
        System.out.println(names.size());
        System.out.println(names.contains("Saul"));
        System.out.println(names.contains("Gus"));
        System.out.println(names.isEmpty())  ;

        System.out.println();
        System.out.println("Hashset is always not in order");System.out.println();

        for(String name : names){
            System.out.println(name);
        }
List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(2);
        numberList.add(1);
        System.out.println(numberList);

        Set<Integer> numberSet = new HashSet<>(numberList);
        numberSet.addAll(numberList);
        System.out.println(numberSet);

    }
}