/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題5 合計金額を求める
 *
 * 入力されたマカロンの個数から合計購入数、合計金額を求めます。
 * 合計購入数、合計金額を求める処理を追記した後で
 * [問題4]の表示を実行例を参考にして改変してください。
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * 合計個数    16個
 * 合計金額  4480円
 *
 * をお買いあげですね。
 * 承りました。
 *
 */

package jp.co.sss.java100_questions_cac.lesson01.challenge05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {

		System.out.println("たいへんお待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！");

		int citron = 30;
		int choocola = 30;
		int pistage = 30;

		System.out.println("\n");
		System.out.println("本日のおすすめ商品です。");
		System.out.println("\n");
		System.out.println("シトロン\t \\250・・・残り" + citron + "個");
		System.out.println("ショコラ\t \\280・・・残り" + choocola + "個");
		System.out.println("シトロン\t \\320・・・残り" + pistage + "個");

		System.out.println("\nそれぞれ何個ずつ買いますか？（最大30個まで）\n");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("シトロン ＞");
		String citronstr = reader.readLine();
		int citronbuy = Integer.parseInt(citronstr);

		System.out.print("ショコラ　＞");
		String choocolastr = reader.readLine();
		int choocolabuy = Integer.parseInt(choocolastr);

		System.out.print("ピスタージュ　＞");
		String pistagestr = reader.readLine();
		int pistagebuy = Integer.parseInt(pistagestr);

		System.out.println("\nシトロン　" + citronbuy + "個");
		System.out.println("ショコラ　" + choocolabuy + "個");
		System.out.println("ピスタージュ　" + pistagebuy + "個");

		int sum = citronbuy + choocolabuy + pistagebuy;
		int sumprice = citronbuy * 250 + choocolabuy * 280 + pistage * 320;

		System.out.println("\n合計個数\t" + sum + "個");
		System.out.println("合計金額\t" + sumprice + "円");

		System.out.println("\nをお買いあげですね。");
		System.out.println("承りました。");

	}

}
