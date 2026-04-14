/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題8 閉店作業を行う
 *
 * 閉店時間となったため、閉店メッセージを表示し
 * 売上の割合を確認します。
 * 以下の実行例を参考に処理を追記、改変してください。
 * （%の表示は小数第一位切り捨てで行います。）
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 */

package jp.co.sss.java100_questions_cac.lesson01.challenge08;

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
		double citronbuy = Double.parseDouble(citronstr);

		System.out.print("ショコラ　＞");
		String choocolastr = reader.readLine();
		Double choocolabuy = Double.parseDouble(choocolastr);

		System.out.print("ピスタージュ　＞");
		String pistagestr = reader.readLine();
		Double pistagebuy = Double.parseDouble(pistagestr);

		System.out.println("\nシトロン　" + citronbuy + "個");
		System.out.println("ショコラ　" + choocolabuy + "個");
		System.out.println("ピスタージュ　" + pistagebuy + "個");

		Double sum = citronbuy + choocolabuy + pistagebuy;
		int sumprice = (int) (250 * citronbuy + 280 * choocolabuy + 320 * pistagebuy);

		System.out.println("\n合計個数\t" + sum + "個");
		System.out.println("合計金額\t" + sumprice + "円");

		System.out.println("\nをお買いあげですね。");
		System.out.println("承りました。");

		citron = (int) (citron - citronbuy);
		choocola = (int) (choocola - choocolabuy);
		pistage = (int) (pistage - pistagebuy);

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン\t \\250・・・残り" + citron + "個");
		System.out.println("ショコラ\t \\280・・・残り" + choocola + "個");
		System.out.println("シトロン\t \\320・・・残り" + pistage + "個");

		System.out.println("\n　閉店時間となりました。");
		System.out.println("またのお越しをお待ちしております。\n");

		System.out.println("\n売上の割合");
		System.out.println("売上合計\t \\" + sumprice);

		System.out.println(
				"\nシトロン\t \\" + (int) (250 * citronbuy) + "・・・ " + (int) ((250 * citronbuy) / sumprice * 100) + "%");
		System.out.println(
				"ショコラ\t \\" + (int) (280 * choocolabuy) + "・・・ " + (int) ((280 * choocolabuy) / sumprice * 100) + "%");
		System.out.println(
				"ピスタージュ\t \\" + (int) (320 * pistagebuy) + "・・・" + (int) ((320 * pistagebuy) / sumprice * 100) + "%");

	}

}
