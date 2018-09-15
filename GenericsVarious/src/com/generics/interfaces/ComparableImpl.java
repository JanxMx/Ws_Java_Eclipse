package com.generics.interfaces;

public class ComparableImpl implements Comparable {

	@Override
	public boolean compareTo(Object o1, Object o2) {
		
		if(o1 == o2){
			return true;
		}
		
		return false;
	}

}
