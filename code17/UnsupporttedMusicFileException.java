//オリジナルの例外を定義する
public class UnsupporttedMusicFileException extends Exception {
	//エラーメッセージを受け取るコンストラクタ
	public UnsupporttedMusicFileException(String msg) {
		super(msg);
	}
}