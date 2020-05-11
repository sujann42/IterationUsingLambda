import java.util.ArrayList;
import java.util.List;

public class IteringList {

    public static void main(String[] args) {
        List<String> list = createList();
        System.out.println("\n________________________");
        iterateThroughList(list);
    }

    public static void iterateThroughList(List<String> list1) {
        list1.forEach(name -> System.out.print(name + " "));
    }

    private static List<String> createList() {
        List<String> list = new ArrayList<>();
        list.add("Sam");
        list.add("Ram");
        list.add("Hari");
        list.add("Bill");
        list.add("Gilly");
        for (String cc : list) {
            System.out.print(cc + " ");
        }
        return list;
    }

}
