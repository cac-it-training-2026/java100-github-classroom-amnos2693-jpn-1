/**
 * 第7章 武士のお仕事
 *
 * 問題8  equals()メソッドの利用
 *
 * equals()メソッドを適切にオーバーライドする。
 *
 * 問題7で作成した藩士クラスにequals()メソッドをオーバーライドする
 * 記述を追加し、同じ藩の所属かどうか確認する処理に変更してください。
 * （※藩士クラスにフィールドprotected String domainを追記）
 * （名前と一緒に藩名もコンストラクタで設定する）
 *
 * <実行例>
 * ○△□藩の藩士を二つ作ります。
 *
 * 拙者は○△□藩士、テスト太郎ともうす。
 * 拙者は○△□藩士、テスト次郎ともうす。
 *
 * 同じ藩に所属しているか確認します。
 *
 * 【同じ藩に所属しています】
 *
 * ○△×藩の藩士を一つ作ります。
 *
 * 拙者は○△×藩士、テスト三郎ともうす。
 *
 * 同じ藩に所属しているか確認します。
 *
 * 【同じ藩に所属していません】
 *
 */

package jp.co.sss.java100_questions_cac.lesson07.challenge08;

class Samurai {
	void fight() {
		System.out.println("戦うよ～。");
	}

	void work() {
		System.out.println("何かして働くよ～");
	}

}

class Retainer extends Samurai {
	/**
	 * @param domain
	 * @param name
	 */
	public Retainer(String domain, String name) {
		this.domain = domain;
		this.name = name;
	}

	protected String domain;
	protected String name;

	@Override
	void work() {
		System.out.println("年貢を取り立てるよ～。");
	}

	public String toString() {
		return "拙者は" + domain + "藩士、" + name + "ともうす。";
	}

	public boolean equals(Object object) {
		boolean isMatch;
		Retainer retainer = (Retainer) object;
		if (this.domain.equals(retainer.domain)) {
			isMatch = true;
		} else {
			isMatch = false;
		}
		return isMatch;
	}

}

//ここにRetainerクラスを記述

public class CastleTown {

	public static void main(String[] args) {
		System.out.println("○△□藩の藩士を二つ作ります。\n");

		Retainer retainer1 = new Retainer("〇△□", "テスト太郎");
		Retainer retainer2 = new Retainer("〇△□", "テスト次郎");

		//ここに適切な処理を記述

		System.out.println("\n同じ藩に所属しているか確認します。\n");

		if (retainer1.equals(retainer2)) {
			System.out.println("【同じ藩に所属しています】");
		}
		//ここに適切な処理を記述

		System.out.println("\n○△×藩の藩士を一つ作ります。\n");

		//ここに適切な処理を記述
		Retainer retainer3 = new Retainer("〇△×", "テスト三郎");
		System.out.println(retainer3);

		System.out.println("\n同じ藩に所属しているか確認します。\n");

		//ここに適切な処理を記述
		if (retainer3.equals(retainer1)) {
			System.out.println("【同じ藩に所属しています】");
		} else {
			System.out.println("【同じ藩に所属していません】");
		}

	}
}
