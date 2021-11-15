/**
 * 
 */
package com.study.springrestexample.util;

import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author 927941
 *
 */
public final class CollectorUtils {

	private CollectorUtils() {
		// To prevent instantiation
	}
	
	/**
	 * Custom collector to collect single element
	 * @param <T>
	 * @return
	 */
	public static <T> Collector<T, ?, T> toSingleton() {
		return Collectors.collectingAndThen(Collectors.toList(), list -> {
			if (list.size() != 1) {
			    // if more than one or no element is present then it should return null
			    return null;
			}
			return list.get(0);
		});
	}
}
