package day65_MapInterface;

import java.util.*;

public class MapInterface {
	
	 public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        Map<String, Double>  employees = new HashMap<>();
	        
	        // put(): adds keys and value
	        employees.put("Nurullah" , 200000.99 );
	        employees.put("Alla", 120000.89);
	        employees.put("Erhan", 500000.9876);
	        
	        System.out.println(employees);
	        
	        double salary1 = employees.get("Nurullah");
	        System.out.println(salary1);
	        
	        System.out.println( employees.get("Erhan") );
	        System.out.println(employees.get("Muhtar"));
	        
	        employees.remove("Nurullah");
	        System.out.println( employees );
	        
	        System.out.println(employees.size());
	        
	        
	        boolean a = employees.containsKey("Mahribana");
	        System.out.println(a); // the key "Mahribana" is not exist in the map
	        
	        
	        boolean b = employees.containsValue(100000.99);
	        System.out.println(b);
	        
	        Set<String>  set =  employees.keySet();
	        System.out.println(set);
	        
	        
	        Map<String, Integer> map1 = new LinkedHashMap<String, Integer>();
	            map1.put("A", 100);
	            map1.put("A", 10);
	            map1.put("A", 9);
	            map1.put("A", 8);
	            
	            System.out.println(map1);
	            
	            map1.put("B",8);
	            map1.put(null, null);
	            System.out.println(map1);
	            
	            
	    Hashtable<String, Integer> map2 = new Hashtable<>();
	    //map2.put("A", null);
	    System.out.println(map2);
	    
	    
	    TreeMap<String, Integer> map3 = new TreeMap<>();
	    map3.put("Z", 1000);
	    map3.put("Y", 9000000);
	    map3.put("X", 1000000);
	    
	    System.out.println(map3);
	            
	        
	        
	        
	    }
	}
