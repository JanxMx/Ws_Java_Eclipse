package com.reflection.all;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class UsingReflection {

	// Get Class using reflection
	Class<?> concreteClass = ConcreteClass.class;
	
	// getClassObject
	public void getClassObject() throws ClassNotFoundException {
		
		concreteClass = new ConcreteClass(5).getClass();
		 
		try {
			// below method is used most of the times in frameworks like JUnit
			// Spring dependency injection, Tomcat web container
			// Eclipse auto completion of method names, hibernate, Struts2, etc.
			// because ConcreteClass is not available at compile time
			concreteClass = Class.forName("com.reflection.all.ConcreteClass");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println(concreteClass.getCanonicalName());	// prints com.reflection.two.ConcreteClass
		
		// for primitive types, wrapper classes and arrays
		Class<?> booleanClass = boolean.class;
		System.out.println(booleanClass.getCanonicalName());	// prints boolean
		
		Class<?> cDouble = Double.TYPE;
		System.out.println(cDouble.getCanonicalName());			// prints double
		
		Class<?> cDoubleArray = Class.forName("[D");
		System.out.println(cDoubleArray.getCanonicalName());	// prints double[]
		
		Class<?> twoDStringArray = String[][].class;
		System.out.println(twoDStringArray.getCanonicalName());	// prints java.lang.String[][]

	}
	
	
	public void getSuperclass() throws ClassNotFoundException {
		Class<?> superClass = Class.forName("com.reflection.all.ConcreteClass").getSuperclass();
		System.out.println(superClass);							// prints "class com.reflection.two.BaseClass"
		System.out.println(Object.class.getSuperclass());		// prints "null"
		System.out.println(String[][].class.getSuperclass());	// prints "class java.lang.Object"
	}
	
	// Get Public Member Classes
	public void getClasses() {
		Class<?> concreteClass = ConcreteClass.class;
		concreteClass = new ConcreteClass(5).getClass();

		Class<?>[] classes = concreteClass.getClasses();
		// [class com.reflection.two.ConcreteClass$ConcreteClassPublicClass,
		//  class com.reflection.two.ConcreteClass$ConcreteClassPublicEnum,
		//  interface com.reflection.two.ConcreteClass$ConcreteClassPublicInterface,
		//  class com.reflection.two.BaseClass$BaseClassInnerClass,
		//  class com.reflection.two.BaseClass$BaseClassMemberEnum]
		System.out.println(Arrays.toString(classes));
	}
	
	public void getDeclaredClasses() throws SecurityException, ClassNotFoundException {
		// getting all of the classes, interfaces, and enums that are explicitly declared in ConcreteClass
		Class<?>[] explicitClasses = Class.forName("com.reflection.all.ConcreteClass").getDeclaredClasses();
		// prints [class com.reflection.two.ConcreteClass$ConcreteClassDefaultClass,
		//		   class com.reflection.two.ConcreteClass$ConcreteClassDefaultEnum,
		//		   class com.reflection.two.ConcreteClass$ConcreteClassPrivateClass,
		//		   class com.reflection.two.ConcreteClass$ConcreteClassProtectedClass,
		//		   class com.reflection.two.ConcreteClass$ConcreteClassPublicClass,
		//		   class com.reflection.two.ConcreteClass$ConcreteClassPublicEnum,
		//		   inteface com.reflection.two.ConcreteClass$ConcreteClassPublicInterface]
		System.out.println(Arrays.toString(explicitClasses));
	}
	
	public void getDeclaringClass() throws ClassNotFoundException {
		Class<?> innerClass = Class.forName("com.reflection.all.ConcreteClass$ConcreteClassDefaultClass");
		// prints com.reflection.two.ConcreteClass
		System.out.println(innerClass.getDeclaringClass().getCanonicalName());
		System.out.println(innerClass.getEnclosingClass().getCanonicalName());
	}
	
	public void getPackage() throws ClassNotFoundException {
		// prints "Com.reflection.two"
		System.out.println(Class.forName("com.reflection.all.BaseInterface").getPackage());
	}
	
	public void getModifiers() throws ClassNotFoundException {
		System.out.println(Modifier.toString(concreteClass.getModifiers()));	// prints "public"
		// prints "public abstract interface"
		System.out.println(Modifier.toString(Class.forName("com.reflection.all.BaseInterface").getModifiers()));
	}
	
	public void getTypeParameters() throws ClassNotFoundException {
		// Get Type parameters (generic)
		TypeVariable<?>[] typeParameters = Class.forName("java.util.HashMap").getTypeParameters();
		for(TypeVariable<?> t:typeParameters) {
			System.out.println(t.getName() + ",");
		}
	}
	
	public void getImplementedInterfaces() throws ClassNotFoundException {
		Type[] interfaces = Class.forName("java.util.HashMap").getGenericInterfaces();
		// prints "[java.util.Map<K, V>, interface java.lang.Cloneable, interface java.io.Serializable]"
		System.out.println(Arrays.toString(interfaces));
		// prints "[interface java.util.Map, interface java.lang.Cloneable, interface java.io.Serializable]"
		System.out.println(Arrays.toString(Class.forName("java.util.HashMap").getInterfaces()));
	}
	
	
	public void getAllPublicMethods() throws SecurityException, ClassNotFoundException {
		Method[] publicMethods = Class.forName("com.reflection.all.ConcreteClass").getMethods();
		// prints public methods of ConcreteClass, BaseClass, Object
		System.out.println(Arrays.toString(publicMethods));
	}
	
	public void getAllPublicConstructors() throws SecurityException, ClassNotFoundException {
		Constructor<?>[] publicConstructors = Class.forName("com.reflection.all.ConcreteClass").getConstructors();
		// prints public constructors of ConcreteClass
		System.out.println(Arrays.toString(publicConstructors));
	}
	
	public void getAllPublicFields() throws SecurityException, ClassNotFoundException {
		// Get All public fields
		Field[] publicFields = Class.forName("com.reflection.all.ConcreteClass").getFields();
		// prints public fields of ConcreteClass, it's superclass and super interfaces
		System.out.println(Arrays.toString(publicFields));
	}
	
	public void getAllAnnotations() throws ClassNotFoundException {
		java.lang.annotation.Annotation[] annotations = Class.forName("com.reflection.all.ConcreteClass").getAnnotations();
		// prints [@java.lang.Deprecated()]
		System.out.println(Arrays.toString(annotations));
	}
	
	public void getPublicField() throws NoSuchFieldException, SecurityException, ClassNotFoundException {
		Field field = Class.forName("com.reflection.all.ConcreteClass").getField("interfaceInt");
		Class<?> fieldClass = field.getDeclaringClass();
		System.out.println(fieldClass.getCanonicalName());
	}
	
	public void getFieldDeclaringClass() throws ClassNotFoundException {
		try {
			Field field = Class.forName("com.reflection.all.ConcreteClass").getField("interfaceInt");
			Class<?> fieldClass = field.getDeclaringClass();
			System.out.println(fieldClass.getCanonicalName());	// prints com.reflection.two.BaseInterface
		}catch(NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		}
	}

	public void getFieldType() throws NoSuchFieldException, SecurityException, ClassNotFoundException {
		Field field = Class.forName("com.reflection.all.ConcreteClass").getField("publicInt");
		Class<?> fieldType = field.getType();
		System.out.println(fieldType.getCanonicalName());	// prints int
	}
	
	public void getSetPublicFieldValue() throws NoSuchFieldException, SecurityException, ClassNotFoundException, IllegalArgumentException, IllegalAccessException {
		Field field = Class.forName("com.reflection.all.ConcreteClass").getField("publicInt");
		ConcreteClass obj = new ConcreteClass(5);
		System.out.println(field.get(obj));		// prints 5
		field.setInt(obj, 10);		// setting field value to 10 in object
		System.out.println(field.get(obj));	// prints 10
	}
	
	public void getSetPrivateFieldValue() throws NoSuchFieldException, SecurityException, ClassNotFoundException, IllegalArgumentException, IllegalAccessException {
		Field privateField = Class.forName("com.reflection.all.ConcreteClass").getDeclaredField("privateString");
		
		// turning off access check with below method call
		privateField.setAccessible(true);
		ConcreteClass objTest = new ConcreteClass(1);
		System.out.println(privateField.get(objTest));			// prints "private string"
		privateField.set(objTest, "private string update");
		System.out.println(privateField.get(objTest));			// prints "private string updated"
	}
	
	public void getPublicMethod() throws NoSuchMethodException, SecurityException, ClassNotFoundException {
		Method method = Class.forName("java.util.HashMap").getMethod("put", Object.class, Object.class);
		// get method parameter types, prints "[class java.lang.Object, class java.lang.Object]"
		System.out.println(Arrays.toString(method.getParameterTypes()));
		// get method return type, return "class java.lang.Object", class reference for void
		System.out.println(method.getReturnType());
		// get method modifiers
		System.out.println(Modifier.toString(method.getModifiers()));		// prints "public"	
	}
	
	public void invokingPublicMethod() throws NoSuchMethodException, SecurityException, ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Method method = Class.forName("java.util.HashMap").getDeclaredMethod("put", Object.class, Object.class);
		Map<String, String> hm = new HashMap();
		method.invoke(hm, "key", "value");
		System.out.println(hm);		// prints {key=value}		
	}
	
	public void invokingPrivateMethods() throws NoSuchMethodException, SecurityException, ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// invoking private method
		Method method = Class.forName("com.reflection.all.BaseClass").getDeclaredMethod("method3", null);
		method.setAccessible(true);
		method.invoke(null, null);		// prints "Method3"
	}
	
	public void getPublicConstructor() throws NoSuchMethodException, SecurityException, ClassNotFoundException {
		Constructor<?> constructor = Class.forName("com.reflection.all.ConcreteClass").getConstructor(int.class);
		// getting constructor parameters
		System.out.println(Arrays.toString(constructor.getParameterTypes()));	// prints "[int]"
		
		Constructor<?> hashMapConstructor = Class.forName("java.util.HashMap").getConstructor(null);
		System.out.println(Arrays.toString(hashMapConstructor.getParameterTypes()));	// prints "[]"
	}

	public void instantiateObjectUsingConstructor() throws NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Constructor<?> constructor = Class.forName("com.reflection.all.ConcreteClass").getConstructor(int.class);
		// getting constructor parameters
		System.out.println(Arrays.toString(constructor.getParameterTypes()));	// prints "[int]"
		
		Object myObj = constructor.newInstance(10);
		Method myObjMethod = myObj.getClass().getMethod("method1", null);
		myObjMethod.invoke(myObj, null);	// prints "Method1 impl."
		
		Constructor<?> hashMapConstructor = Class.forName("java.util.HashMap").getConstructor(null);
		System.out.println(Arrays.toString(hashMapConstructor.getParameterTypes()));	// prints "[]"
		
		HashMap<String, String> myMap = (HashMap<String, String>) hashMapConstructor.newInstance(null);
	}
	
}
