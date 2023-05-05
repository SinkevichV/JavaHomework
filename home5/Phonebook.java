package homework.home5;




import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

public class Phonebook {
    

    private HashMap<String, HashSet<String>> map = new HashMap<>();

    void add(String name, String phoneNumber) {
        if (!map.containsKey(name)) {
            map.put(name, new HashSet<>());
        }
        map.get(name).add(phoneNumber);
    }

    String get(String name) {
        return name + ":" + map.get(name);
    }
    String getAll() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Entry<String, HashSet<String>> entry : map.entrySet()) {
            stringBuilder.append(entry.getKey());
            stringBuilder.append(": ");
            stringBuilder.append(entry.getValue());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    String print() {
        return map.toString();
    }
}


