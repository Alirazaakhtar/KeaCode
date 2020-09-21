import java.util.HashMap;
import java.util.Map;

public class AnvendMapDome {

    public static void main(String[] args) {

        MapDemo<String, Integer> mapDemo = new MapDemo<>();

        Map<String, Integer> movieMap = new HashMap<>();
        movieMap.put("Matrix", 5);
        movieMap.put("Braveheart", 5);
        movieMap.put("Big Lebo", 2);


        mapDemo.printMap(movieMap);

    }
}
