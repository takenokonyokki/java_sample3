public class Code14Hero {
	String name;
	int hp;
	
	//静的フィールド(static field)　フィールド宣言の先頭にstaticを追加する
	static int money;
	//静的フィールドは3つの特殊効果がある
	//①静的フィールドの箱はインスタンスではなく、クラスに対して1つだけ用意される（説明がむずい・・・）
	// 静的フィールドを読み書きするには、
	// クラス名.静的フィールド名　（例：Code14Hero.money）
	// インスタンス変数名.静的フィールド名 （例：h1.money）
	// 静的フィールドを用いれば、インスタンス間でフィールドを共有できる
	
	
	//所持金ランダム生成
	//静的メソッド（クラスメソッド）
	//メソッド自体がクラスに属するようになり、クラス名を使って呼び出せるし、インスタンス変数名でも呼び出せる
	public static void setRandomMoney() {
		Code14Hero.money = (int)(Math.random() * 1000);
		//System.out.println(this.name + "静的メソッド内ではstaticのついてないフィールドやメソッドは利用できない");
	}
}