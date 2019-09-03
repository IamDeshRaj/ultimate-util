package org.open.java.util;

import java.util.Map;

public class MapArrayUtil<K, V> {

	public void getArrayIndexValuePair(Map<Integer, V> map, V array[]) {
		for (int i = 0; i < array.length; i++) {
			map.put(i, array[i]);
		}
	}

	public void getArrayValueIndexPair(Map<K, Integer> map, K array[]) {
		for (int i = 0; i < array.length; i++) {
			map.put(array[i], i);
		}
	}
}
