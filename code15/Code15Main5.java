import java.time.*;

public class Code15Main5 {
	public static void main(String[] args) {
		//LocalDateTimeの生成方法
		LocalDateTime l1 = LocalDateTime.now(); //現在日時を取得
		LocalDateTime l2 = LocalDateTime.of(2022, 1, 1, 9, 5, 0, 0); //2022年1月1日9時5分を指定して取得
		System.out.println(l1);
		System.out.println(l2);
		
		//LocalDateTimeとZonedDateTimeの相互変換
		ZonedDateTime z1 = l2.atZone(ZoneId.of("Europe/London"));
		LocalDateTime l3 = z1.toLocalDateTime();
		System.out.println(z1);
		System.out.println(l3);
		
		
		//Periodクラスの利用
		//サマータイムや閏年なども考慮して日数ベースで期間を管理する必要がある場合に使用する
		LocalDate d1 = LocalDate.of(2022, 1, 1);
		LocalDate d2 = LocalDate.of(2022, 1, 4);
		System.out.println(d1);
		System.out.println(d2);
		
		//3日間を表すPeriodを2通りの方法で生成
		Period p1 = Period.ofDays(3);
		Period p2 = Period.between(d1, d2);
		System.out.println(p1);
		System.out.println(p2);
		
		//d2のさらに3日後を計算する
		LocalDate d3 = d2.plus(p2);
		System.out.println(d3);
	}
}