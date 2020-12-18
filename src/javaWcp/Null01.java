package javaWcp;

public class Null01 {
	public static void main(String[] args) {
	  String string1;
	  string1 = "あいさつ";
	  System.out.println(string1 + "文字の数" + string1.length());
	  string1 = "";
      System.out.println(string1 + "の文字数：" + string1.length());
      // nullの変数を参照するとNullPointerExceptionのエラー
      string1 = null;
      System.out.println(string1 + "の文字数：" + string1.length());
	}
}
