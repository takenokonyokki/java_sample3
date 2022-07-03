public class Practice15Main {
	public static void main(String[] args) {
		//15-1
		StringBuilder sb = new StringBuilder(); //StringBuilderインスタンスを生成
		for (int i = 0; i < 100; i++) { //int型の変数iは初期値0、iが100以下であれば繰り返す
			sb.append(i + 1).append(","); //appendメソッドで文字列を追加していく　iに+1した数字と,を追加
		}
		String s = sb.toString(); //完成した連結済みの文字列を取り出す
		String[] num = s.split(","); //splitメソッドで,の場所で文字列を分割している。それを配列aに代入
		System.out.println(s); //1,2,・・・100,が出力される
		for (String a : num) { //拡張for文　配列の要素を1つずつ取り出す
			System.out.print(a + ":"); //splitメソッドにより、,のところを:に変えている
		}
		
		//15-3
		//正規表現パターン
		//(1)すべての文字列　：　.*
		//(2)最初の1文字はA、2文字目は数字、3文字目は数字か無し　：　A\d{1,2}
		//(3)最初の1文字はU、2～4文字目は英大文字　：　U[A-Z]{3}
	}
}