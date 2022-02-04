
// import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 * Collections in Java, 
 * V.Jata Feb 04, 2022. 
 */

public class Collections {
    public static void main(String[] args) {

        // Map(Key/value pair). List (indexed collection). Set (dublicate-free-collection)

        // ArrayList - Fast indexing, insert/remove in a very large list can be slower. 
        // LinkedList - Slow indexing, insert/remove in a very large list can be faster. 
        // HashMap - To map a key to value fast - ordering does not matter. 
        // LinkedHashMap - it maintains insertion order. 
        // TreeMap - it maintains sorted order, to map a key to a value.
        // HashSet - when ordering does not matter and when is needed Doublicate-free fast set. 
        // LinkedHashSet - when ordering matter, without doublicates. 
        // TreeMap - without doublicates and sorted order. 

        // 1. Lists don't have key/value pairs
        // 2. Maps have key/value pairs. 
        // 3. Sets don't have doublicates, dont have key/value pair,  


        // 1. Creating an ArrayList
        ArrayList<String> city = new ArrayList<String>();
        // Adding an item 
        city.add("Helsinki");
        city.add( "Stockholm");
        // Get a single item from the list
        System.out.println(city.get(0));
        //Removing an element from the city list. 
        city.remove("Stockholm");
        // Replacing an element in the list. 
        city.set(0, "Vanta");

        //Creating a LinkedList
        LinkedList<String> cityList = new LinkedList<String>();
        cityList.add("Espoo");
        // Iterating the list
        for (String c : cityList) { 
            System.out.println(c);
        }

        // 2. Creating a HashMap 
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        // Putting an item to the map.
        capitalCities.put("Finland", "Helsinki");
        // Testing if the map contains a certain item. An example: if (capitalCities.containsKey("Finland"))
        // Removing a value (item) from the map: capitalCities.remove("Finland")
        // Replacing a value/item in the map: capitalCities.replace("Finland", "Suomi")

        // Getting Finland. 
        System.out.println(capitalCities.get("Finland"));
        // Print keys and values
        for (String i : capitalCities.keySet()) {
            System.out.println("The key is: " + i + ", and the value is: " + capitalCities.get(i));
        }
        // Creatin a TreeMap object.
        TreeMap<Integer, String> mapCity = new TreeMap<>();
        //Puting an item to the TreeMap
        mapCity.put(3, "Oulu");
         
        // Creating a LinkedHashMap of even numbers
        LinkedHashMap<String, Integer> cityCode = new LinkedHashMap<>();
        //Puting an item to the LinkedHashMap
        cityCode.put("Vanta", 0050);
        

        // 3. Creating a HashSet
        HashSet<String> otherCities = new HashSet<String>();
        otherCities.add("Rovaniemi");

        // Creating an empty LinkedHashSet of string type
        LinkedHashSet<String> linkedset = new LinkedHashSet<String>();
        // Adding element to LinkedHashSet
        linkedset.add("A");

        // Creating a TreeSet
        TreeSet<String> citySet = new TreeSet<>();
        // Adding an item to the TreeSet
        citySet.add("Tampere");
        // Duplicates will not get insert.
        citySet.add("Tampere");

        // Iterate the set
        for (String cityS : citySet) { 
            System.out.println(cityS);
        }

    }
}