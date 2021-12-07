package HashSets;

import java.util.HashSet;

public class Set {

	public static void main(String[] args) {
    HashSet<Integer> ages= new HashSet<>();
    ages.add(10);
    ages.add(20);
    ages.add(30);
    ages.add(40);
    ages.add(50);
    ages.add(60);
    ages.remove(30);
    System.out.println(ages.contains(50));
    System.out.println(ages.size());
    System.out.println(ages);
    for(int i=50; i<=55; i++) {
    	if(ages.contains(i)) {
    		System.out.println("age found in the above set");
    	}
        else {
        	System.out.println("age does not found in the above set");
        	
    	}
    }

	}

}
