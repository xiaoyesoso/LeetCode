package Insert.Delete.GetRandom.O1.Duplicates.allowed;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class RandomizedCollection {

	int id;
	HashMap<Integer, HashSet<Integer>> KeyIds;
	HashMap<Integer, Integer> IdKey;
	Random rd;

	/** Initialize your data structure here. */
	public RandomizedCollection() {
		id = -1;
		KeyIds = new HashMap<Integer, HashSet<Integer>>();
		IdKey = new HashMap<Integer, Integer>();
		rd = new Random();
	}

	/**
	 * Inserts a value to the collection. Returns true if the collection did not
	 * already contain the specified element.
	 */
	public boolean insert(int val) {
		++id;
		IdKey.put(id, val);
		if (KeyIds.containsKey(val)) {
			KeyIds.get(val).add(id);
			return false;
		} else {
			HashSet<Integer> Ids = new HashSet<Integer>();
			Ids.add(id);
			KeyIds.put(val, Ids);
			return true;
		}
	}

	/**
	 * Removes a value from the collection. Returns true if the collection
	 * contained the specified element.
	 */
	public boolean remove(int val) {
		if (KeyIds.containsKey(val)) {
			Integer index = KeyIds.get(val).iterator().next();
			IdKey.remove(index);
			KeyIds.get(val).remove(index);
			if (KeyIds.get(val).size() == 0)
				KeyIds.remove(val);
			return true;
		} else
			return false;
	}

	/** Get a random element from the collection. */
	public int getRandom() {
		while (!IdKey.containsKey(id))
			--id;
		while (true) {
			int x = rd.nextInt(id + 1);
			if (IdKey.containsKey(x))
				return IdKey.get(x);
		}
	}
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection(); boolean param_1 =
 * obj.insert(val); boolean param_2 = obj.remove(val); int param_3 =
 * obj.getRandom();
 */
