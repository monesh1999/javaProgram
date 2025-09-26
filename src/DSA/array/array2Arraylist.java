package DSA.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class array2Arraylist {

	public static void main(String[] args) {
		Integer[] arr1 = {1,2,3,5,6,7};
		Integer[] arr2 = {5,8,6,9,5,1};
		
		List<Integer> list1 = new ArrayList<>(Arrays.asList(arr1));
		List<Integer> list2 = new ArrayList<>(Arrays.asList(arr2));
		
		List<Integer> common = new ArrayList<>(list1);
		common.retainAll(list2);
		System.out.println("common element "+common);
		
		List<Integer> uncommon = new ArrayList<>(list1);
		for(Integer num:list1) {
			if(!list2.contains(num)) {
				uncommon.add(num);
			}
		}
		for(Integer num:list2) {
			if(!list1.contains(num)) {
				uncommon.add(num);
			}
		}
		System.out.println("uncommon element "+uncommon);
		
		

	}

}
