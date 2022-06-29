public class Code15Main {
	public static void main(String[] args) {
		String s1 = "スッキリJava";
		String s2 = "Java";
		String s3 = "java";
		String s4 = "Java and JavaScript";
		String s5 = "Java programming";
		
		//文字列調査メソッド
		
		//内容が等しいか調べる
		if (s2.equals(s3)) {
			System.out.println("s2とs3は等しい");
		}
		
		//大文字、小文字を区別せず内容が等しいか調べる
		//大文字と小文字の区別のことを、文字のケース（case）という
		if (s2.equalsIgnoreCase(s3)) {
			System.out.println("s2とs3はケースを区別しなければ等しい");
		}
		
		//文字列長を調べる。全角文字も半角文字も1文字としてカウント
		System.out.println("s1の長さは" + s1.length() + "です");
		
		//空文字か（長さが0か）を調べる。length() == 0より直感的に意味を捉えやすい
		if (s1.isEmpty()) {
			System.out.println("s1は空文字です");
		}
		
		
		
		//文字列検索メソッド
		
		//文字列の一部に指定した引数が含まれているか
		if (s4.contains("Java")) {
			System.out.println("文字列s4は、Javaを含んでいます");
		}
		
		//文字列が指定した引数で始まるか調べる
		if (s4.startsWith("Java")) {
			System.out.println("文字列s4は、Javaが最初にあります");
		}
		
		//文字列が指定した引数で終わるか調べる
		if (s4.endsWith("Java")) {
			System.out.println("文字列s4は、Javaが末尾にあります");
		}
		
		//文字列が最初に登場する位置を調べる
		System.out.println("文字列s4で最初にJavaが登場する位置は" + s4.indexOf("Java"));
		
		//文字列を後ろから検索して、最初に登場する位置を調べる
		System.out.println("文字列s4で最後にJavaが登場する位置は" + s4.lastIndexOf("Java"));
		
		
		
		//文字列切り出しメソッド
		
		//文字列の何文字目を切り出すかを引数で指定する
		System.out.println("文字列s5の0文字目を切りだす" + s5.charAt(0));
		
		//文字列を指定した位置より後ろの文字列を返す
		System.out.println("文字列s5の5文字目以降は" + s5.substring(5));
		
		//文字列を指定した2つの位置の間にある文字列を返す
		System.out.println("文字列s5の0～4文字目は" + s5.substring(0,4));
	}	
}