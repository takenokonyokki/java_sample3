import java.time.*;
import java.time.format.DateTimeFormatter;

public class Practice15Main3 {
	public static void main(String[] args) {
		//1.現在の日時を取得
		LocalDate now = LocalDate.now();
		
		//2.取得した値に100を足す
		LocalDate future = now.plusDays(100);
		
		//3.指定された形式で表示
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
		System.out.println(future.format(fmt));
	}
}