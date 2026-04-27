/**
 * 第5章 ロボット工場のお仕事
 *
 * 問題10 新しいロボットの作成（完全版）
 *
 * Rさんは、これまでのロボットの機能をすべて組み合わせた
 * 高性能ロボット「SuperRobot」を開発しました。
 *
 * 以下の内容でクラスを作成してください。
 *
 * パッケージ名  lesson8.challenge10
 * クラス名      SuperRobot
 *
 * 【処理の流れ】
 * ① 材料（豚肉、卵、バター、小麦粉、砂糖、水）をランダムで決定する。
 * ② 材料を配列にまとめる。
 * ③ 材料の量に応じて料理を作る。
 * ④ 調理後、あとかたづけロボットで材料をすべて0にする。
 *
 * 【条件（材料の必要量）】
 * ・豚肉1以上、卵1以上、バター1以上の場合 → 「とんかつ」
 *   （1人分：豚肉1、卵1、バター1）
 *
 * ・豚肉1以上、卵2以上の場合 → 「ポークオムレツ」
 *   （1人分：豚肉1、卵2）
 *
 * ・卵1以上、水1以上の場合 → 「スープ」
 *   （1人分：卵1、水1）
 *
 * ・それ以外 → 「何も作れません」
 *
 * 【注意】
 * ・料理は作れる最大の人数（〇人分）を計算して表示すること。
 *   （例：とんかつ → min(豚肉, 卵, バター) 人分）
 *   （例：ポークオムレツ → min(豚肉, 卵 / 2) 人分）
 *   （例：スープ → min(卵, 水) 人分）
 *
 * ・条件は上から順番に判定すること（とんかつ → ポークオムレツ → スープ）。
 * ・配列を使って材料を管理すること。
 *
 * 【実行例】
 *  SuperRobot：
 *  材料をランダムに取得します…
 *
 *  現在の材料：
 *  豚肉：2
 *  卵：3
 *  バター：10
 *  小麦粉：100
 *  砂糖：50
 *  水：2
 *
 *  ポークオムレツが出来ました。（2人分）
 *
 *  あとかたづけをします。
 *
 *  豚肉：0
 *  卵：0
 *  バター：0
 *  小麦粉：0
 *  砂糖：0
 *  水：0
 *
 *  きれいになりました。
 *
 */
package jp.co.sss.java100_questions_cac.lesson08.challenge10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class SuperRobot01 {
	int pork;
	int egg;
	int butter;
	int water;

	/**
		 * @param pork
		 * @param egg
		 * @param butter
		 * @param flour
		 * @param sugar
		 * @param water
		 */
	public SuperRobot01(int pork, int egg, int butter, int water) {
		this.pork = pork;
		this.egg = egg;
		this.butter = butter;
		this.water = water;
	}

	String getNamenum() {
		int people = 0;
		String menu = null;

		if (pork >= 1 && egg >= 1 && butter >= 1) {
			menu = "とんかつ";

			people = pork;
			if (egg < people) {
				people = egg;
			}
			if (butter < people) {
				people = butter;
			}

		} else if (pork >= 1 && egg >= 2) {
			menu = "ポークオムレツ";

			people = pork;
			int eggpeople = egg / 2;
			if (eggpeople < people) {
				people = eggpeople;
			}

		} else if (egg >= 1 && water >= 150) {
			menu = "卵スープ";

			people = egg;
			if (water < people) {
				people = water;
			}
		}

		if (menu != null) {
			return menu + "が" + people + "人前出来ました。";
		} else {
			return "何も作れません。";
		}

	}

}

class ClearRobot {

	void clearTable(int[] ingredients) {
		for (int i = 0; i < ingredients.length; i++) {
			ingredients[i] = 0;
		}
	}

}

public class SuperRobot {

	public static void main(String[] args) throws IOException {

		System.out.println("今日は豚肉を使った料理を作るよ\n");
		System.out.println("選択肢は「とんかつ」「ポークオムレツ」「卵スープ」があるよ");
		System.out.println("「とんかつ」を作るには豚肉1人前と卵1個とバター１人前が必要だよ");
		System.out.println("「ポークオムレツ」を作るには豚肉１人前と卵１個が必要だよ");
		System.out.println("「卵スープ」を作るには卵1個と水150mlが必要だよ");
		System.out.println("\n何を作ろうかな？\n");

		System.out.println("\n必要な材料を入力してください");
		System.out.println("豚肉何人前使いますか？＞");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String porkStr = reader.readLine();
		int pork = Integer.parseInt(porkStr);

		System.out.println("卵は何個使いますか？＞");
		String eggStr = reader.readLine();
		int egg = Integer.parseInt(eggStr);

		System.out.println("バターは何人前使いますか？＞");
		String butterStr = reader.readLine();
		int butter = Integer.parseInt(butterStr);

		System.out.println("水は何ml使いますか？＞");
		String waterStr = reader.readLine();
		int water = Integer.parseInt(waterStr);

		System.out.println();
		System.out.println("現在の材料：");
		System.out.println("豚肉：" + porkStr);
		System.out.println("卵：" + eggStr);
		System.out.println("バター：" + butterStr);
		System.out.println("水：" + waterStr);

		SuperRobot01 robot = new SuperRobot01(pork, egg, butter, water);
		System.out.println(robot.getNamenum());

		System.out.println("食べ終わりました");
		System.out.println("\n使ったものが散乱してるね\n");
		System.out.println("\n後片づけをしますか？\n");
		System.out.println("1.はい、2.いいえ");
		String choicenum = reader.readLine();
		int choice = Integer.parseInt(choicenum);

		if (choice == 1) {
			System.out.println("全ての個数が0になるまで片づけよう");
		} else {
			System.out.println("汚いまま終わりです");
			return;
		}

		int[] ingredients = { pork, egg, butter, water };

		ClearRobot clearRobot = new ClearRobot();
		clearRobot.clearTable(ingredients);

		System.out.println("豚肉  ：" + ingredients[0] + "人前");
		System.out.println("卵    ：" + ingredients[1] + "個");
		System.out.println("バター：" + ingredients[2] + "人前");
		System.out.println("水    ：" + ingredients[3] + "ml");

		System.out.println("\nきれいになりました。");
	}
}
