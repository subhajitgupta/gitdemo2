import java.util.HashMap;
import java.util.HashSet;

public class trial {

	public static void main(String[] args) {
		HashSet<Integer> h= new HashSet<Integer>();
		h.add(2);
		h.add(24);
		h.add(290);
		h.add(16);
		h.add(32);
		
		for(int i : h) {
			System.out.println(i);
		}
		
		String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		HashSet<String> h2= new HashSet<String>();
		for(String str: days) {
			h2.add(str);
		}
		for (String string : h2) {
			System.out.println(string);
		}
		HashMap<String,String> h3= new HashMap<String,String>();
		
		h3.put("mon", "Monday");
		h3.put("tue", "Tuesday");
		h3.put("wed", "Wednesday");
		
		for (String string : h3.keySet()) {
			System.out.println(string + " : "+ h3.get(string));
		}

	}
	
	
	
}
