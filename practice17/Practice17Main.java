public class Practice17Main {
	public static void main(String[] args) {
		//17-1
//		String s = null;
//		System.out.println(s.length()); //nullのため、実行時にエラーが発生
		
		//17-2
		try {
			String s = null;
			System.out.println(s.length());
		} catch (NullPointerException e) {
			System.out.println("NullPointerException例外をcatchしました");
			System.out.println("--スタックトレース（ここから）--");
			e.printStackTrace();
			System.out.println("--スタックトレース（ここまで）--");
		}
		
		//17-3
		try {
			int i = Integer.parseInt("三");
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException例外をcathcしました");
		}
	}
}