//Mapインターフェース
//2つの情報をキー(key)と値(value)のペアとして格納するデータ構造のこと
//java.util.HashMapクラスが特に利用される
//Map<キーの型, 値の型> マップ変数 = new HashMap<キーの型, 値の型>();
//値の重複は許されるが、キーの重複は許されないので、後から格納した場合に値が上書きされる

import java.util.*;

public class Code16Main3 {
	public static void main(String[] args) {
		Map<String, Integer> prefs = new HashMap<String, Integer>();
		
		//put(キー, 値)でペアを格納する
		prefs.put("京都府", 255);
		prefs.put("東京都", 1261);
		prefs.put("熊本県", 181);
		
		//get(キー)で、値を取得
		int tokyo = prefs.get("東京都");
		
		System.out.println("東京都の人口は" + tokyo);
		
		//remove(キー)で、指定した内容の要素を削除
		prefs.remove("京都府");
		
		//再度putしているので、上書きされる
		prefs.put("熊本県", 182);
		
		//get(キー)で、値を取得
		int kumamoto = prefs.get("熊本県");
		
		System.out.println("熊本県の人口は" + kumamoto);
		
		
		//マップに格納された情報を1つずつ取り出す方法
		/*for (キーの型 key : マップ変数.keySet()) {
		 * 値の型 value = マップ変数.get(key);
		 * }
		 */
		for (String key : prefs.keySet()) { //都道府県名を一覧を取得し繰り返す
			int vaule = prefs.get(key); //都道府県名(キー)を指定し、人口(値)を取得
			System.out.println(key + "人口は" + vaule);
		}
	}
}
