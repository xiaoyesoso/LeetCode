package Fizz.Buzz;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<String> fizzBuzz(int n) {

		List<String> arr = new ArrayList<String>();
		for (int i = 0; i < n; ++i)
			arr.add("" + (i + 1));
		int loc1 = 2;
		int loc2 = 4;
		while (loc2 < n) {

			if (arr.get(loc1).equals("Buzz"))
				arr.set(loc1, "FizzBuzz");
			else
				arr.set(loc1, "Fizz");

			arr.set(loc2, "Buzz");
			loc1 += 3;
			loc2 += 5;
		}

		while (loc1 < n) {
			if (arr.get(loc1).equals("Buzz"))
				arr.set(loc1, "FizzBuzz");
			else
				arr.set(loc1, "Fizz");
			loc1 += 3;
		}

		return arr;

	}
}
