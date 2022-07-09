//スロー宣言
//try-catch文がなくてもコンパイルエラーにならない
import java.io.*;

public class Code17Main2 {
	public static void subsub() throws IOException { //スロー宣言
		FileWriter fw = new FileWriter("data.txt");
	}
}