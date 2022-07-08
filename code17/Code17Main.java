import java.io.*;

public class Code17Main {
	public static void main(String[] args) {
		//下記状態だと、処理されない例外の型 IOExceptionとエラーが発生する。try-catch文を記述すればエラーは無くなる。
		//FileWriter fw = new FileWriter("data.txt");
		
		//上記エラーに対応したものが以下になる
		try {
			FileWriter fw = new FileWriter("data.txt");
		} catch (IOException e) {
			System.out.println("エラーが発生しました");
		}
		
		
		//ざっくりと例外を捕捉する
		//どのような種類の例外が発生しても同じように処理するため、大雑把な例外処理になってしまう。
		try {
			FileWriter fw2 = new FileWriter("data.txt");
			fw2.write("hello");
			fw2.close();
		} catch (Exception e) { //Exceptionの子孫をどれでもキャッチする
			System.out.println("何らかのエラーが発生しました");
		}
		
		
		//try-with-resources文の利用
		//try-catch文を抜ける際に、自動的にcolse()メソッドが呼び出されるため、finallyブロックの記述は不要となる。
		try (FileWriter fw3 = new FileWriter("data.txt");) {
			fw3.write("hello");
		} catch (Exception e) {
			System.out.println("何らかのエラーが発生しました");
		}
	}
}