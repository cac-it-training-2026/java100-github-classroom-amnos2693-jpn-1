/**
 * 第7章 武士のお仕事
 *
 * 問題9  getClass()メソッドの利用
 *
 * 侍クラスのサブクラスをまとめて扱う。
 *
 * 要素数5の侍クラスの配列を用意し、
 * 藩士クラス、浪人クラスの何れかをランダムで代入します。
 * getClass()メソッドを使いそれぞれの要素に何のクラスの
 * オブジェクトが入ったか表示してください。
 * （藩士クラス、浪人クラスともに
 *   デフォルトコンストラクタを用意します）
 *
 * <実行例>
 * 5人の侍を配列に詰めます。
 *
 * 詰め終わりました。
 *
 * それぞれ表示してみます。
 *
 * class lesson11_12.challenge09.Ronin
 * class lesson11_12.challenge09.Ronin
 * class lesson11_12.challenge09.Retainer
 * class lesson11_12.challenge09.Ronin
 * class lesson11_12.challenge09.Retainer
 *
 */

package jp.co.sss.java100_questions_cac.lesson07.challenge09;

class Samurai {

	protected String name;

	void fight() {
		System.out.println("戦うよ～。");
	}

	void work() {
		System.out.println("何かして働くよ～");
	}

}

class Retainer extends Samurai {

	public Retainer(String name) {
		this.name = name;
	}

	public Retainer() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	void getPaid() {
		System.out.println("給料をもらうよ～。");
	}

	void work() {
		System.out.println("年貢を取り立てるよ～。");
	}

	public String toString() {
		return "拙者は○△□藩士、" + name + "ともうす。";
	}
}

class Ronin extends Samurai {

	public Ronin(String name) {
		this.name = name;
	}

	public Ronin() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	void covered() {
		System.out.println("傘張りするよ～。");
	}

	void work() {
		System.out.println("傘張るよ～。");
	}

	public String toString() {
		return "拙者は武州○△□村の浪人、" + name + "ともうす。";
	}
}

public class CastleTown {

	public static void main(String[] args) {
		System.out.println("5人の侍を配列に詰めます。\n");

		Samurai[] samuraiarray = new Samurai[5];
		for (int i = 0; i < 5; i++) {
			int num = (int) (Math.random() * 10) % 2;
			if (num == 0) {
				samuraiarray[i] = new Retainer();
			} else {
				samuraiarray[i] = new Ronin();
			}
		}
		//ここに適切な処理を記述

		System.out.println("詰め終わりました。\n");
		System.out.println("それぞれ表示してみます。\n");

		//ここに適切な処理を記述
		for (int i = 0; i < 5; i++) {
			System.out.println(samuraiarray[i].getClass());
		}
	}
}
