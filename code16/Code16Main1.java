import java.util.ArrayList;
import java.util.*;

public class Code16Main1 {
	public static void main(String[] args) {
		ArrayList<Integer> points = new ArrayList<Integer>();
		points.add(10);
		points.add(80);
		points.add(75);
		for (int i : points) {
			System.out.println(i);
		}
		
		//イテレータを使ったArrayListの繰り返し処理
		ArrayList<String> names = new ArrayList<String>();
		names.add("ryuto");
		names.add("moe");
		names.add("choko");
		Iterator<String> it = names.iterator();
		while (it.hasNext()) {
			String e = it.next();
			System.out.println(e);
		}
	}
}