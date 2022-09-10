package sep10Pratice;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class IterateThroughHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> trial=new LinkedHashMap<Integer,String>();
		trial.put(1, "Deekshith");
		trial.put(2, "Pragya");
		trial.put(3, "Nakshatra");
		
		//Using iterator & while loop
		System.out.println("---Using iterator & while loop--");
		Iterator<Map.Entry<Integer, String>> itr=trial.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer,String> map=itr.next();
			System.out.println(map.getKey() +"  "+ map.getValue());
		}
		//Using foreach loop
		System.out.println("---Using foreach loop----");
		for(Map.Entry<Integer,String> map1 : trial.entrySet()) {
			System.out.println(map1.getKey() +"  "+ map1.getValue());
		}
		
		//Using Keyset & Values
		System.out.println("---Using keySet----");
		for(Integer i:trial.keySet()) {
			System.out.println(i);
		}
		System.out.println("---Using values----");
		for(String s:trial.values()) {
			System.out.println(s);
		}

	}

}
