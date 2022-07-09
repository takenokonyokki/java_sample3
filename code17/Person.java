public class Person {
	int age;
	
	public void setAge(int age) {
		if (age < 0) { //ここで引数をチェック
			throw new IllegalArgumentException("年齢は0以上の数字を指定するべきです。指定値＝" + age); //スロー宣言のthrowsとは、違うものになるので注意
		}
		this.age = age; //問題なければフィールドに値をセット
	}
}