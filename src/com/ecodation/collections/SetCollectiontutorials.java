package com.ecodation.collections;

import java.util.Set;
import java.util.TreeSet;

public class SetCollectiontutorials {

	// H L T H=HashSet L=LinkedHashSet T=TreeSet
	public static void main(String[] args) {
		// Set<Integer> setListem = new LinkedHashSet<Integer>();
		// Set<Integer> setListem = new LinkedHashSet<Integer>();
		Set<Integer> setListem = new TreeSet<Integer>();
		setListem.add(15);
		setListem.add(16);
		setListem.add(17);
		setListem.add(21);
		setListem.add(44);
		setListem.add(99);
		setListem.add(17);
		setListem.add(17);
		setListem.add(12);
		setListem.add(13);
		setListem.add(17);
		setListem.add(14);

		for (Object temp : setListem) {
			System.out.print(temp + " ");
		}
	}

}
