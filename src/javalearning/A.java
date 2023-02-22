package javalearning;

import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class A {

	public static void main(String[] args) {
		System.out.println("Hello Worlds");
		
		String[] abc = {"Mouli", "Vikas", "Yamuna", "Anand", "Surya"};
		List<String> bcd = Arrays.asList(abc);
		System.out.println(bcd.get(0));
		System.out.println(bcd.get(1));
		System.out.println(bcd.get(2));
		System.out.println(bcd.get(3));
		System.out.println(bcd.get(4));
		System.out.println("====================Sort=====");
		Collections.sort(bcd);
		System.out.println("====================for loop====");
		for(String def: bcd) {
			System.out.println(def);
		}
		System.out.println("====================Iterator========");
		Iterator<String> fgh = bcd.iterator();
		while(fgh.hasNext()) {	
			System.out.println(fgh.next());
			//bcd.add("King");
		}
		System.out.println("====================Enumeration=====");
	
		Enumeration<String> jkl = Collections.enumeration(bcd);
		while(jkl.hasMoreElements()) {
			System.out.println(jkl.nextElement());
		}
		
		System.out.println("====Sorting Algorithms===");
		
		B obj = new B();
		obj.function();
		
		System.out.println("====Maps Concept===");
		C obj1 = new C();
		obj1.hashMap1();
		

	}

}
