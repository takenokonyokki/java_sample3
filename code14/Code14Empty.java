public class Code14Empty {
	//暗黙の継承によりextendsで親クラスを指定しなければ、java.lang.Objectを親クラスとして継承したとみなされる。
	//よって、実質的に、public class Code14Empty extends Objectとなっている。
	//java.lang.Objectとは、全クラスの祖先である。
	//toString()とequals()メソッドを持っている。
	
	//Object型はどんなインスタンスでも受け取れるメソッドになる
	public void printAnything(Object o) {
		System.out.println(o.toString());
	}
	
}