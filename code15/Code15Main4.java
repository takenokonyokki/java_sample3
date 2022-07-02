import java.time.*;

public class Code15Main4 {
	public static void main(String[] args) {
		//Instantの生成
		Instant i1 = Instant.now(); //現在の日時を取得
		
		//Instantとlong値との相互変換
		Instant i2 = Instant.ofEpochMilli(1600705425827L);
		long l = i2.toEpochMilli();
		
		//ZonedDateTImeの生成
		ZonedDateTime z1 = ZonedDateTime.now();
		ZonedDateTime z2 = ZonedDateTime.of(2022, 1, 2, 3, 4, 5, 6, ZoneId.of("Asia/Tokyo")); //東京時間2022年1月2日3時4分5秒6ナノ秒を指定して取得
		
		//InstantとZonedDateTimeの相互変換
		Instant i3 = z2.toInstant();
		ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));
		
		//ZonedDateTimeの利用方法
		System.out.println("Tokyo:" + z2.getYear() + z2.getMonth() + z2.getDayOfMonth());
		System.out.println("London:" + z3.getYear() + z3.getMonth() + z3.getDayOfMonth());
		if (z2.isEqual(z3)) { //同じ瞬間の判定には、equals()ではなくisEqualを使う
			System.out.println("同じ");
		}
	}
}