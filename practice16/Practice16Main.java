import java.util.*;
public class Practice16Main {
	public static void main(String[] args) {
		//16-2
		Practice16Hero h1 = new Practice16Hero("ryuto");
		Practice16Hero h2 = new Practice16Hero("moe");
		
		List<Practice16Hero> heroes = new ArrayList<Practice16Hero>();
		
		heroes.add(h1);
		heroes.add(h2);
		
		for (Practice16Hero h : heroes) {
			System.out.println(h.getName());
		}
		
		//16-3
		Map<Practice16Hero, Integer> heroes2 = new HashMap<Practice16Hero, Integer>();
		
		heroes2.put(h1, 3);
		heroes2.put(h2, 7);
		
		for (Practice16Hero key : heroes2.keySet()) {
			int value = heroes2.get(key);
			System.out.println(key.getName() + "が倒した敵" + value);
		}
	}
}