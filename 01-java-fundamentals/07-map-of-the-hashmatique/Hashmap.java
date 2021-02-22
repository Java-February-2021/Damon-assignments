import java.util.HashMap;

public class Hashmap {

    public static void Testmap() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Damon" ,  "loves to program");
        map.put("Coding Dojo", "is great");
        map.put("Hash", "map");

        String val = map.get("Damon");

        for (String key : map.keySet()){
            System.out.println(String.format("Track: %s: Lyrics: %s", key, map.get(key)));
        }
        
    }

}

