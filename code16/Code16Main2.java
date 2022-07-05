import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//Setの基本特性
//・それぞれの要素には、重複が許されない
//・それぞれの要素には、基本的に順序がない

public class Code16Main2 {
	public static void main(String[] args) {
		Set<String> colors = new HashSet<String>();
		colors.add("red");
		colors.add("blue");
		colors.add("green");
		colors.add("red"); //重複してredを格納しようとしても無視されるため、格納できない
		System.out.println(colors.size()); //size()メソッドは、格納されている要素数を返す。よって、3が出力される。
		
		
		//Setには、要素の順番の概念がないため、要素を拡張for文やイテレータで取り出した際は、順番は保証されない
		for (String s : colors) {
			System.out.println(s); //格納した順番とは異なった順番で出力される。また、実行のたびに結果が異なる可能性もある。
		}
		
		
		//TreeSetから文字列(String)を取り出す場合は、辞書順で取り出されるようになる
		Set<String> words = new TreeSet<String>();
		words.add("dog");
		words.add("cat");
		words.add("wolf");
		words.add("panda");
		for (String s : words) {
			System.out.println(s); //cat → dog → panda →　wolfの順番で取り出される
		}
	}
}