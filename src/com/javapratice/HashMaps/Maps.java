package HashMaps;

import java.util.HashMap;

public class Maps {

	public static void main(String[] args) {
     HashMap<String, Integer> CapitialCities = new HashMap<>();
     CapitialCities.put("AndhraPradesh",5);
     CapitialCities.put("Mumbai", 6);
     CapitialCities.put("Kerala", 7);
     CapitialCities.put("Chennai", 9);
     CapitialCities.put("Gujarat", 10);
     CapitialCities.put("Jammu", 11);
     CapitialCities.put("Goa", 12);
     CapitialCities.remove("Kerla");
     System.out.println(CapitialCities.get("Chennai"));
     System.out.println(CapitialCities);
     System.out.println(CapitialCities.size());
     System.out.println(CapitialCities.values());
     for(String Cities:CapitialCities.keySet()) {
     System.out.println(Cities);
    

     }
     
	}

}
