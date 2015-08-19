package com.lam.coder.topCoder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class EelAndRabbit {

	public int getmax(int[] lenghts, int[] times) {
		List<Integer> values = new ArrayList<Integer>();
		List<Integer> indexes;
		Map<Integer, Integer> map;

		values = findValues(lenghts, times);

		map = fillMap(values);
		int modaKey = findModaIndex(map);
		int modaValue = map.get(modaKey);

		indexes = findIndexes(lenghts, times, modaKey);
		
		// Do not copy indexes into values.
		values.clear();
		for (int i = 0; i < lenghts.length; i++) {
			if (indexes.contains(i)) {
				continue;
			}
			for (int j = 0; j <= lenghts[i]; j++) {
				values.add(times[i] + j);
			}
		}

		map = fillMap(values);
		modaKey = findModaIndex(map);
		modaValue += map.get(modaKey);

		return modaValue;
	}

	private int findModaIndex(Map<Integer, Integer> map) {
		Set<Integer> keys = map.keySet();
		Integer[] keys_int = keys.toArray(new Integer[keys.size()]);

		int max = 0;
		int index = -1;

		for (int i = 0; i < keys_int.length; i++) {
			if (map.get(keys_int[i]) > max) {
				index = i;
				max = map.get(keys_int[i]);
			} else {
			}
		}

		return index;
	}

	private Map<Integer, Integer> fillMap(List<Integer> values) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < values.size(); i++) {
			if (map.containsKey(values.get(i))) {
				int aux = map.get(values.get(i)) + 1;
				map.put(values.get(i), aux);
			} else {
				map.put(values.get(i), 1);
			}
		}

		return map;
	}

	private List<Integer> findIndexes(int[] lenghts, int[] times, int moda) {
		List<Integer> indexes = new ArrayList<Integer>();

		for (int i = 0; i < lenghts.length; i++) {
			for (int j = 0; j <= lenghts[i]; j++) {
				if ((times[i] + j) == moda) {
					indexes.add(i);
				}

			}
		}

		return indexes;

	}

	private List<Integer> findValues(int[] lenghts, int[] times) {
		List<Integer> values = new ArrayList<Integer>();
		for (int i = 0; i < lenghts.length; i++) {
			for (int j = 0; j <= lenghts[i]; j++) {
				values.add(times[i] + j);
			}
		}

		return values;
	}
}
