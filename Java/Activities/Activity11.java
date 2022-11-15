import java.util.HashMap;
import java.util.Map;
public class Activity11 {
    {
        Map<Integer, String>  colors = new HashMap<Integer, String>();
        colors.put(1, "Red");
        colors.put(2, "Green");
        colors.put(3, "Blue");
        colors.put(4, "White");
        colors.put(5, "black");
        System.out.println(colors);
        System.out.println(colors.size());
        System.out.println("is green present in the map ?"+ colors.containsValue("Green"));
        colors.remove(3);
        System.out.println(colors);
    }
}
