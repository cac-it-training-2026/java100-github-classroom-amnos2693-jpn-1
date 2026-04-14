/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題4 注文を受ける
 *
 * 3種類のマカロンを任意の個数購入できるようにします。
 * [問題3]までの表示を行った後で
 * 実行例を参考に処理を追記してください。
 * （ >8 は >を表示した後で入力待ち状態になり、
 *   ユーザーがキーボードから8を入力したイメージです。）
 *
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
 * をお買いあげですね。
 * 承りました。
 */

package jp.co.sss.java100_questions_cac.lesson01.challenge04;

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

		System.out.println("\nをお買いあげですね。");
		System.out.println("承りました。");

	}

}
