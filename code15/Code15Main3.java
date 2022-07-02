import java.text.SimpleDateFormat;
import java.util.Date;

public class Code15Main3 {
	public static void main(String[] args) throws Exception {
		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		
		//文字列からDateインスタンスを生成
		Date d = f.parse("2022/07/03 07:45:20");
		System.out.println(d);
		
		//Dateインスタンスから文字列を生成
		Date now = new Date();
		String s = f.format(now);
		System.out.println(s);
		
	}
}