/**
 * 第6章 宇宙飛行士のお仕事
 *
 * 問題12 StringBufferクラス（replace）
 *
 * 宇宙船が次の目的地Ω星に到着しました。
 * Ω星は不思議な星です。Ω星では名前の
 * 末尾が数字が入っているものは英語表記に置き換える
 * というルールがあります。
 * 例えば、「apple2」は「appletwo」に
 * 「windows98」は「windows9eight」に変更されます。
 *
 * Ω星人クラスOmegalianを新たに作成してください。
 * OmegalianはString型フィールドitemを持ち、メソッドsetItem()で登録します。
 * また、setItem()内で呼び出されるメソッドとして、
 * 受け取った数字を英語表記に変換して戻す
 * private String changeLastChar(char ch)を持ちます。
 *
 * <実行例>
 *
 * Ω星人にアイテムを渡してください＞iPhone6
 *
 * Ω星人：
 * えっ！iPhonesixをくれるオメガか！
 * ありがとうオメガ。
 *
 */

package jp.co.sss.java100_questions_cac.lesson06.challenge12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Omegalian {
	private String item;

	/**
	 * @return item
	 */
	public String getItem() {
		return item;
	}

	/**
	 * @param item セットする item
	 */
	public void setItem(String item) {
		int lastindex = item.length() - 1;
		char lastch = item.charAt(lastindex);
		String changestr = changelastchar(lastch);

		if (changestr != null) {
			//StringBufferは置き換え可能
			StringBuffer sb = new StringBuffer(item);
			//置き換えたい文字の開始位置と終了位置、置き換えたい文字
			sb.replace(lastindex, lastindex + 1, changestr);
			this.item = new String(sb);
		} else {
			this.item = item;
		}
	}

	private String changelastchar(char ch) {
		String changestr = null;
		switch (ch) {
		case '0':
			changestr = "zero";
			break;
		case '1':
			changestr = "one";
			break;
		case '2':
			changestr = "two";
			break;
		case '3':
			changestr = "three";
			break;
		case '4':
			changestr = "four";
			break;
		case '5':
			changestr = "five";
			break;
		case '6':
			changestr = "six";
			break;
		case '7':
			changestr = "seven";
			break;
		case '8':
			changestr = "eight";
			break;
		case '9':
			changestr = "nine";
			break;
		}
		return changestr;
	}

}
//ここにOmegalianクラスを記述する

public class Astronaut {

	public static void main(String[] args) throws IOException {

		System.out.print("Ω星人にアイテムを渡してください＞");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String present = br.readLine();

		//ここに適切な処理を記述する

		Omegalian omegalian = new Omegalian();
		omegalian.setItem(present);

		String item = null;
		omegalian.getItem();

		//ここに適切な処理を記述する

		System.out.println("\nΩ星人：");
		System.out.println("えっ！" + item + "をくれるオメガか！");
		System.out.println("ありがとうオメガ。");
	}
}
