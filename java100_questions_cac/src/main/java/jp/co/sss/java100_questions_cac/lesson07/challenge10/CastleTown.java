/**
 * 第7章 武士のお仕事
 *
 * 問題10  抽象クラス
 *
 * 抽象クラス、抽象メソッドを作る。
 *
 * 侍クラスのwork()メソッドを抽象化してください。
 *
 * <実行例>
 * 侍は働きます。
 *
 * 具体的に言うと藩士は年貢を取り立てます。
 *
 * 藩士1：
 * 年貢を取り立てるよ～。
 *
 * 具体的に言うと浪人は傘張りをします。
 *
 * 浪人1：
 * 傘張るよ～。
 *
 */

package jp.co.sss.java100_questions_cac.lesson07.challenge10;

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

class Ronin extends Samurai {

	void covered() {
		System.out.println("傘張りするよ～。");
	}

	public void work() {
		System.out.println("傘張るよ～。");
	}

	public String toString() {
		return "拙者は武州○△□村の浪人、" + name + "ともうす。";
	}
}

public class CastleTown {

	public static void main(String[] args) {
		System.out.println("侍は働きます。");

		System.out.println("\n具体的に言うと藩士は年貢を取り立てます。\n");

		System.out.println("藩士1：");

		Retainer retainer = new Retainer();
		retainer.work();

		//ここに適切な処理を記述

		System.out.println("\n具体的に言うと浪人は傘張りをします。\n");

		System.out.println("浪人1：");

		//ここに適切な処理を記述
		Ronin ronin = new Ronin();
		ronin.work();

	}
}
