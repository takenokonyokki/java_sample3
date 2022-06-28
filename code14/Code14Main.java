public class Code14Main {
	public static void main(String[] args) {
		Code14Empty e = new Code14Empty();
		String s = e.toString();
		System.out.println(s);
		
		//Objectクラスはすべての先祖になるため、Object型はどんなインスタンスでも代入できる
		Object o1 = new Code14Empty();
		Object o2 = "anything";
		
		e.printAnything(o2);
		
		//静的フィールドはインスタンスを生成(new)しなくても利用できる
		Code14Hero.money = 1000;
		System.out.println(Code14Hero.money);
		
		
		//静的フィールドmoneyへのアクセス
		Code14Hero h1 = new Code14Hero();
		Code14Hero h2 = new Code14Hero();

		Code14Hero.money = 100;
		System.out.println(Code14Hero.money); //100が表示
		System.out.println(h1.money); //100が表示
		
		h1.money = 200;
		System.out.println(h2.money); //100が表示
		
		System.out.println(h1.hp); //インスタンスh1の箱のhpを表示
		
		
		//静的メソッド呼出し
		Code14Hero.setRandomMoney();
		System.out.println(Code14Hero.money);
		System.out.println(h1.money);
		
	}
}