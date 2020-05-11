
import java.util.HashMap;
import java.util.Map;

public class IteratingMap {
    public static void main(String[] args) {
        Map<String, String> mapp = createMap();
        System.out.println("\n________________________");
        iterateThroughMap(mapp);
    }

    public static void iterateThroughMap(Map<?, ?> map) {
        map.forEach((k,v) -> System.out.println("Key: "+ k+"    |    Value: "+ v));
    }

    private static Map<String, String> createMap() {
        Map<String, String> countryCapitalMap = new HashMap<>();
        countryCapitalMap.put("US", "Wshington DC");
        countryCapitalMap.put("England", "London");
        countryCapitalMap.put("France", "Paris");
        for (Map.Entry<String, String> cc : countryCapitalMap.entrySet()) {
            System.out.println(cc.getKey() + " " + cc.getValue());
        }
        return countryCapitalMap;
    }
}
