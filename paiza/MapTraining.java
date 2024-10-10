import java.util.HashMap;
import java.util.Map;

public class MapTraining {

    public static void main(String[] args) {
        

        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("東京", 100);
        map.put("京都", 200);
        map.put("大阪", 300);

        for(String key : map.keySet()){
            
            int value = map.get(key);
            System.out.println(key + "の人口は" + value + "人です。");
        }


    }

}
