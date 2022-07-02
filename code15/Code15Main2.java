import java.util.Calendar;
import java.util.Date;
public class Code15Main2 {
	public static void main(String[] args) {
		//処理時間を計測
		long start = System.currentTimeMillis();
		//この行に何らかの時間がかかる処理を記述
		long end = System.currentTimeMillis();
		System.out.println("time is" + (end - start));
		
		
		//現在日時を持つDataインスタンスの生成
		//Date d = new Date();
		
		//指定時点の日時を持つDateインスタンスの生成
		//Date d = new Date(long 値);
		
		
		//現在日時を表示する
		//java.util.Dateをimportしておく
		Date now = new Date(); //現在の日時を取得
		System.out.println(now);
		System.out.println(now.getTime());
		Date past = new Date(1600705425827L);
		System.out.println(past);
		
		
		//Calendarクラス
		Calendar c = Calendar.getInstance();
		//6つのint値からDateインスタンスを生成
		c.set(2022, 7, 2, 23, 10, 10);
		c.set(Calendar.MONTH, 7); //「月」の取得・設定には0～11を使用。8月を設定するには左記となる。
		Date d = c.getTime();
		System.out.println(d);
		//Dateインスタンスからint値を生成
		Date now1 = new Date();
		c.setTime(now1);
		int y = c.get(Calendar.YEAR);
		System.out.println(y);
	}
}