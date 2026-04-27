/**
 * 第7章 武士のお仕事
 *
 * 問題12 インターフェース①
 *
 * 勘定奉行インターフェースを作る。
 *
 * 抽象メソッドfigure()を持つ勘定奉行インターフェースIChiefTreasurerを
 * 作成し、問題3で作成した奉行クラスMagistrateに実装してください。
 *
 * <実行例>
 * 奉行に勘定奉行を兼ねてもらうことになりました。
 *
 * 奉行1：
 * 藩の資産を計算するよ～。
 *
 */

package jp.co.sss.java100_questions_cac.lesson07.challenge12;

//ここにIChiefTreasurerインターフェースを記述
interface IChiefTreasurer {
	void figure();
}

abstract class Samurai {

	protected String name;

	void fight() {
		System.out.println("戦うよ～。");
	}

	public abstract void work();
}

class Retainer extends Samurai {

	void getPaid() {
		System.out.println("給料をもらうよ～。");
	}

	public void work() {
		System.out.println("年貢を取り立てるよ～。");
	}

	public String toString() {
		return "拙者は○△□藩士、" + name + "ともうす。";
	}
}

class Magistrate extends Retainer implements IChiefTreasurer {
	void judge() {
		System.out.println("判決を下すよ～。");
	}

	@Override
	public void figure() {
		System.out.println("藩の資産を計算するよ～。");
		// TODO 自動生成されたメソッド・スタブ

	}
}

//ここにMagistrateクラスを記述

public class CastleTown {

	public static void main(String[] args) {
		System.out.println("奉行に勘定奉行を兼ねてもらうことになりました。\n");

		System.out.println("奉行1：");

		Magistrate magistrate = new Magistrate();
		magistrate.figure();
		//ここに適切な処理を記述

	}
}
