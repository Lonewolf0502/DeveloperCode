//Java program to count occurrence of
//characters in string using Hashmap

import java.util.*;
public class Occurrence {
	static void countCharacter(String inputString)
	{
		HashMap<Character, Integer> map
			= new HashMap<Character, Integer>();

		char[] strArray = inputString.toCharArray();

		for (char c : strArray) {
			if (map.containsKey(c)) {

				map.put(c, map.get(c) + 1);
			}
			else {

				map.put(c, 1);
			}
		}

		for (Map.Entry e : map.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}

	public static void main(String[] args)
	{
		String string = "Welcome";
		countCharacter(string);
	}
}
