package test;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapCalculator {

	public ArrayList<String> commonKeyValues(ArrayList<Integer> lst, HashMap<Integer, String> hm) {
		// TODO Auto-generated method stub
		ArrayList<String> st = new ArrayList<String>();
		
		
		for (Integer s : hm.keySet()) {
			for (int i = 0; i < lst.size(); i++) {
				
				if (s == lst.get(i)) {
					
					st.add(hm.get(s));
				}
			}
		}

		return st;
	}

}
