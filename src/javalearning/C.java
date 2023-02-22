package javalearning;

import java.util.Map;
import static java.util.Map.entry;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

@FunctionalInterface
interface Abc{
	void print(Map<String, String> obj);
}


public class C {

	public void hashMap1() {
		Map<String, String> abc = Map.ofEntries(
				entry("1","A"),
				entry("2","B"), 
				entry("3","C"),
				entry("4","D"));
		
		

		System.out.println("======Functional Interaface======");
		
		Abc obj = def -> abc.forEach((k,v) -> System.out.println(k+"->"+v));
		
		obj.print(abc);
		System.out.println("======Functional Interaface======");
		
		for(Map.Entry<String, String> obj1: abc.entrySet()) {
			System.out.println(obj1.getKey()+" "+obj1.getValue());
		}
		System.out.println("======Iteration Map======");
		Iterator<Map.Entry<String, String>> itr = abc.entrySet().iterator();
		
		while(itr.hasNext()) {
			Map.Entry<String, String> ent = itr.next();
			System.out.println(ent.getKey()+" "+ent.getValue());
		}
		System.out.println("======For Each Map======");
		abc.forEach((k,v) -> System.out.println(k+"->"+v));
		System.out.println("======Enumeration Map======");
		Enumeration<Map.Entry<String, String>> strEnum = Collections.enumeration(abc.entrySet());
		while(strEnum.hasMoreElements()) {
			System.out.println(strEnum.nextElement().getKey());
		}
	}
	
}



