/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package jp.co.sss.java100_questions_cac.lesson01.challenge06;

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
		int sumprice = 250 * citronbuy + 280 * choocolabuy + 320 * pistagebuy;

		System.out.println("\n合計個数\t" + sum + "個");
		System.out.println("合計金額\t" + sumprice + "円");

		System.out.println("\nをお買いあげですね。");
		System.out.println("承りました。");

		citron = citron - citronbuy;
		choocola = choocola - choocolabuy;
		pistage = pistage - pistagebuy;

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン\t \\250・・・残り" + citron + "個");
		System.out.println("ショコラ\t \\280・・・残り" + choocola + "個");
		System.out.println("シトロン\t \\320・・・残り" + pistage + "個");

	}

}
