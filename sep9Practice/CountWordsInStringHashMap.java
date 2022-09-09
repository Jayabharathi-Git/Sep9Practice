package sep9Practice;

import java.util.HashMap;
import java.util.Map;

public class CountWordsInStringHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="trying to count the number of words in this string using the hashmap";
		String[] splitStr=input.split(" ");
		
		Map<String,Integer> countMap=new HashMap<String,Integer>();
		
		for(int i=0;i<splitStr.length;i++) {
			if(countMap.containsKey(splitStr[i])) {
				int count=countMap.get(splitStr[i]);
				countMap.put(splitStr[i], count+1);
				
			}
			else
				countMap.put(splitStr[i], 1);
		}
		
		System.out.println(countMap);

	}

}
