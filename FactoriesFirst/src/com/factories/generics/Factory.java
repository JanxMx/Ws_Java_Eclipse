package com.factories.generics;

public class Factory<T> {
	
	// T type MUST have a default constructor
	private final Class<T> type;
	
	public Factory(Class<T> type) {
		this.type = type;
	}
	
	/**
	 * Use the factory to get the next instance
	 */
	public T getInstance() {
		try {
			// assume type is a public class
			return type.newInstance();
		}catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * Create the factory. Note that V can be, but to demostrate that
	 * generic method are not generic classes, I've called it V and not T.
	 * In using this methods V becomes T.
	 * @param type
	 * @return
	 */
	public static <V> Factory<V> getInstance(Class<V> type) {
		return new Factory<V>(type);
	}

	public static void main(String[] args) {
		
		Factory<String> factory = Factory.getInstance(String.class);
		
		String sample = factory.getInstance();
		System.out.println("Sample is (String): " + sample);
		
		Factory<TestOne> factory2 = Factory.getInstance(TestOne.class);
		
		TestOne sample2 = factory2.getInstance();
		System.out.println("Sample is (TestOne): " + sample2);
	}
	
	public static class TestOne {
		
		@Override
		public String toString() {
			return "This is TestOne";
		}
	}
}
