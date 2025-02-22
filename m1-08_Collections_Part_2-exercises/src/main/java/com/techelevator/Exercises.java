package com.techelevator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Exercises {

	/*
	 * Map Exercises
	 */

	/*
	1.  * Given the name of an animal, return the name of a group of that animal
	 * (e.g. "Elephant" -> "Herd", "Rhino" - "Crash").
	 *
	 * The animal name should be case insensitive so "elephant", "Elephant", and
	 * "ELEPHANT" should all return "herd".
	 *
	 * If the name of the animal is not found, null, or empty, return "unknown".
	 *
	 * Rhino -> Crash
	 * Giraffe -> Tower
	 * Elephant -> Herd
	 * Lion -> Pride
	 * Crow -> Murder
	 * Pigeon -> Kit
	 * Flamingo -> Pat
	 * Deer -> Herd
	 * Dog -> Pack
	 * Crocodile -> Float
	 *
	 * animalGroupName("giraffe") → "Tower"
	 * animalGroupName("") -> "unknown"
	 * animalGroupName("walrus") -> "unknown"
	 *
	 */
	public String animalGroupName(String animalName) {
		Map<String, String> groupAnimal = new HashMap<String, String>();
		groupAnimal.put("rhino", "Crash");
		groupAnimal.put("giraffe", "Tower");
		groupAnimal.put("elephant", "Herd");
		groupAnimal.put("lion", "Pride");
		groupAnimal.put("crow", "Murder");
		groupAnimal.put("pigeon", "Kit");
		groupAnimal.put("flamingo", "Pat");
		groupAnimal.put("deer", "Herd");
		groupAnimal.put("dog", "Pack");
		groupAnimal.put("crocodile", "Float");
		
		String group = groupAnimal.get(animalName.toLowerCase());
		if(group == null || group.length() == 0) {
			return "unknown";
		}
		
		return group;
	}

	/*
	 2. * Given an String item number (a.k.a. SKU), return the discount percentage if the item is on sale.
	 * If the item is not on sale, return 0.00.
	 *
	 * If the item number is empty or null, return 0.00.
	 *
	 * "KITCHEN4001" -> 0.20
	 * "GARAGE1070" -> 0.15
	 * "LIVINGROOM"	-> 0.10
	 * "KITCHEN6073" -> 0.40
	 * "BEDROOM3434" -> 0.60
	 * "BATH0073" -> 0.15
	 *
	 * The item number should be case insensitive so "kitchen4001", "Kitchen4001", and "KITCHEN4001"
	 * should all return 0.20.
	 *
	 * isItOnSale("kitchen4001") → 0.20
	 * isItOnSale("") → 0.00
	 * isItOnSale("GARAGE1070") → 0.15
	 * isItOnSale("dungeon9999") → 0.00
	 *
	 */
	public Double isItOnSale(String itemNumber) {
		Map<String, Double> onSale = new HashMap<String, Double>();
		onSale.put("kitchen4001",0.20);
		onSale.put("garage1070",0.15);
		onSale.put("livingroom",0.10);
		onSale.put("kitchen6073",0.40);
		onSale.put("bedroom3434",0.60);
		onSale.put("bath0073",0.15);
		
		Double saleItem = onSale.get(itemNumber.toLowerCase());
		
		if(saleItem==null || saleItem.equals("")) {
			return 0.00;
		}
		
		return saleItem;
	}

	/*
	 3. * Modify and return the given map as follows: //if "Peter" has more than 0 money, transfer half of it to "Paul"//,
	 * but only //if Paul has less than $10s//.
	 *
	 * Note, monetary amounts are specified in cents: penny=1, nickel=5, ... $1=100, ... $10=1000, ...
	 *
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 99}) → {"Peter": 1000, "Paul": 1099}
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 30000}) → {"Peter": 2000, "Paul": 30000}
	 *
	 */
	public Map<String, Integer> robPeterToPayPaul(Map<String, Integer> peterPaul) {
		
		/*if(peterMOney>$10)
		*transfer peter half money to paul
		else if (paul <$10)
		*/
		if (peterPaul.get("Peter") > 0) {
			Integer halfOfPetersMoney = peterPaul.get("Peter") / 2;
			if (peterPaul.get("Paul") < 1000) {
			peterPaul.put("Paul", peterPaul.get("Paul") + halfOfPetersMoney);
			peterPaul.put("Peter", peterPaul.get("Peter") - halfOfPetersMoney);
			}
			else {
			return peterPaul;
			}

			    }
			    return peterPaul;   
			}

    /*
	4.  * Modify and return the given map as follows: if "Peter" has $50 or more, AND "Paul" has $100 or more,
	 * then create a new "PeterPaulPartnership" worth a combined contribution of a quarter of each partner's
	 * current worth.
	 *
	 * peterPaulPartnership({"Peter": 5000, "Paul": 10000}) → {"Peter": 3750, "Paul": 7500, "PeterPaulPartnership": 3750}
	 * peterPaulPartnership({"Peter": 3333, "Paul": 1234567890}) → {"Peter": 3333, "Paul": 1234567890}
	 *
	 */
	public Map<String, Integer> peterPaulPartnership(Map<String, Integer> peterPaul) {
		//Map<String, Integer> contribute = new HashMap<String, Integer>();
			Integer peterPartnership= peterPaul.get("Peter")/4;
			Integer paulPatnership=peterPaul.get("Paul")/4;
			Integer togetherContribution;
		if(peterPaul.get("Peter")>=5000 && peterPaul.get("Paul")>=10000) {
			togetherContribution = peterPartnership +paulPatnership;
			peterPaul.put("PeterPaulPartnership",togetherContribution);
			peterPaul.put("Peter",peterPaul.get("Peter")-peterPartnership);
			peterPaul.put("Paul", peterPaul.get("Paul")-paulPatnership);
			
			
		}
			
		return peterPaul;
	}

	/*
	5.  * Given an array of non-empty strings, return a Map<String, String> where for every different string in the array,
	 * there is a key of its first character with the value of its last character.
	 *
	 * beginningAndEnding(["code", "bug"]) → {"b": "g", "c": "e"}
	 * beginningAndEnding(["man", "moon", "main"]) → {"m": "n"}
	 * beginningAndEnding(["muddy", "good", "moat", "good", "night"]) → {"g": "d", "m": "t", "n": "t"}
	 */
	public Map<String, String> beginningAndEnding(String[] words) {
		Map<String, String> beginingEnding = new HashMap<String,String>();
		
		for(int i = 0; i<words.length; i++) {
			beginingEnding.put(words[i].substring(0,1), words[i].substring(words[i].length()-1));
		}
		
		return beginingEnding;
	}

	/*
	 6. * Given an array of strings, return a Map<String, Integer> with a key for each different string, with the value the
	 * number of times that string appears in the array.
	 *
	 * ** A CLASSIC **
	 *
	 * wordCount(["a", "b", "a", "c", "b"]) → {"b": 2, "c": 1, "a": 2}
	 * wordCount([]) → {}
	 * wordCount(["c", "b", "a"]) → {"b": 1, "c": 1, "a": 1}
	 *
	 */
	public Map<String, Integer> wordCount(String[] words) {
		Map<String, Integer> countWord = new HashMap<String, Integer>();
		
		for(int i = 0; i<words.length; i++) {
			Integer count = 1;
			countWord.put(words[i], count);
			for (int j = 0; j<words.length;j++) {
				if(i==j) {
					continue;
				}
				else if(words[i].equals(words[j])) {
					count +=1;
					countWord.put(words[i], count);
				}
			}
		}
		return countWord;
		}

	/*
	7.  * Given an array of int values, return a Map<Integer, Integer> with a key for each int, with the value the
	 * number of times that int appears in the array.
	 *
	 * ** The lesser known cousin of the the classic wordCount **
	 *
	 * integerCount([1, 99, 63, 1, 55, 77, 63, 99, 63, 44]) → {1: 1, 44: 1, 55: 1, 63: 3, 77: 1, 99:2}
	 * integerCount([107, 33, 107, 33, 33, 33, 106, 107]) → {33: 4, 106: 1, 107: 3}
	 * integerCount([]) → {}
	 *
	 */
	public Map<Integer, Integer> integerCount(int[] ints) {
		Map<Integer, Integer> countInt = new HashMap<Integer, Integer>();
		
		for(int i = 0; i<ints.length;i++) {
			Integer count = 1;
			countInt.put(ints[i], count);
			for( int j = 0; j<ints.length; j++) {
				if (i==j) {
					continue;
				}
				else if(ints[i]==ints[j]) {
					count +=1;
					countInt.put(ints[i], count);
				}
			}
		}
		
		return countInt;
	}

	/*
	 8. * Given an array of strings, return a Map<String, Boolean> where each different 
	 string is a key and value is true only if that string appears 2 or more times 
	 in the array.
	 *
	 * wordMultiple(["a", "b", "a", "c", "b"]) → {"b": true, "c": false, "a": true}
	 * wordMultiple(["c", "b", "a"]) → {"b": false, "c": false, "a": false}
	 * wordMultiple(["c", "c", "c", "c"]) → {"c": true}
	 *
	 */
	public Map<String, Boolean> wordMultiple(String[] words) { 
		// if word.i is appear more then twice
		// return true, else false
		Map<String, Boolean> multipleWord = new HashMap<String, Boolean>();
		
		for(String newWord : words) {
			if(!multipleWord.containsKey(newWord)) {
				multipleWord.put(newWord, false);
			}
			else {
				multipleWord.put(newWord, true);
			}
		}
			
			
		
		return multipleWord;
	}

	/*
	 9. * Given two maps, Map<String, Integer>, merge the two into a new map, Map<String, Integer> where keys in Map2,
	 * and their Integer values, are added to the Integer values of matching keys in Map1. Return the new map.
	 *
	 * Unmatched keys and their Integer values in Map2 are simply added to Map1.
	 *
	 * consolidateInventory({"SKU1": 100, "SKU2": 53, "SKU3": 44} {"SKU2":11, "SKU4": 5})
	 * 	 → {"SKU1": 100, "SKU2": 64, "SKU3": 44, "SKU4": 5}
	 *
	 */
	public Map<String, Integer> consolidateInventory(Map<String, Integer> mainWarehouse, Map<String, Integer> remoteWarehouse) {
		Map<String, Integer> newInventory = new HashMap<String, Integer>();
		
		for(String newWareHouse :mainWarehouse.keySet()) {
			for(String newRemoteWarehouse: remoteWarehouse.keySet()) {
				if(newWareHouse.equals(newRemoteWarehouse)) {
					Integer newValues = mainWarehouse.get(newWareHouse) + remoteWarehouse.get(newRemoteWarehouse);
					newInventory.put(newWareHouse, newValues);
				}
				else {
					newInventory.put(newWareHouse, mainWarehouse.get(newWareHouse));
					newInventory.put(newRemoteWarehouse, remoteWarehouse.get(newRemoteWarehouse));
				}
			}
		
		
		
	}
		return newInventory;
	}

	/*
	10.  * Just when you thought it was safe to get back in the water --- last2Revisited!!!!
	 *
	 * Given an array of strings, for each string, the count of the number of times that a substring length 2 appears
	 * in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1.
	 *
	 * We don't count the end substring, but the substring may overlap a prior position by one.  For instance, "xxxx"
	 * has a count of 2, one pair at position 0, and the second at position 1. The third pair at position 2 is the
	 * end substring, which we don't count.
	 *
	 * Return Map<String, Integer>, where the key is string from the array, and its last2 count.
	 *
	 * last2Revisited(["hixxhi", "xaxxaxaxx", "axxxaaxx"]) → {"hixxhi": 1, "xaxxaxaxx": 1, "axxxaaxx": 2}
	 *
	 */
	public Map<String, Integer> last2Revisited(String[] words) {
		Map<String, Integer> lastTwo  = new HashMap<String, Integer>();
		
		//int countXX(String str) 
			int count = 0;
			for(int i = 0; i < words.length-2; i++) {
				//System.out.println(words[i]);
			if(words[i].substring(0).equals("xx")) 
				{
			count +=1;
			lastTwo.put(words[i], count);
			//System.out.println(lastTwo);
			}
			}
			//System.out.println(lastTwo);
			return lastTwo;
			}
	/*
	 11. Given a list of Strings, return a list that contains the distinct values. In other words, no value is to be
	 included more than once in the returned list. (Hint: Think Set)
	 distinctValues( ["red", "yellow", "green", "yellow", "blue", "green", "purple"] ) -> ["red", "yellow", "green", "blue", "purple"]
	 distinctValues( ["jingle", "bells", "jingle", "bells", "jingle", "all", "the", "way"] ) -> ["jingle", "bells", "all", "the", "way"]
	 */
	public List<String> distinctValues(List<String> stringList) {
		List<String> stringDistinct = new ArrayList<String>();
		Set<String> newValue = new LinkedHashSet<String>();
		
		for(String distinctVal: stringList) {
			newValue.add(distinctVal);	
		}
		for (String value : newValue) {
			stringDistinct.add(value);
			}
		
		return stringDistinct;
	}

}
