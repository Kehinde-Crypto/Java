import java.util.HashMap;
public class Values {
   public static void main(String[] args){
    HashMap<String, Integer> maps = new HashMap<String, Integer>();
     
    maps.put("Maths", 90);
    maps.put("CSC311",90);
    maps.put("GST311", 100);

    maps.putIfAbsent("Math", 70);

    //System.out.println(maps.toString());
    System.out.println(maps.toString());
   } 
}
