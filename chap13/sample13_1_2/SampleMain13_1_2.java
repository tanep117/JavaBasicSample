package chap13.sample13_1_2;

import java.util.Scanner;

public class SampleMain13_1_2 {
	/*
	 * interfaceの実装例
	 * interfaceにより武器が自由に変更可能になる。
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//戦士と魔法使いのインスタンス化
		Fighter fighter = new Fighter();
		Wizard wizard = new Wizard();


		int pNum = inputPlayer(sc);
		Player player;
		if(pNum==1) {
			player = fighter;
		} else {
			player = wizard;
		}

		
		//攻撃技を設定する。
		int aNum = inputAttack(sc);
		Attack attack;
		switch (aNum) {
		case 1:
			attack = new SwordAttack();
			break;
		case 2:
			attack = new Poison();
			break;
		case 3:
			attack = new FireBall();
			break;
		case 4:
			attack = new Heal();
			break;
		default:
			attack = null;
		}
		
		
		//攻撃をする
		System.out.println("-----------------");
		player.setAttack(attack);
		player.Attack();

		sc.close();
	}

	public static int inputPlayer(Scanner sc) {
		System.out.println("攻撃するプレーヤーを選択してください。");
		System.out.print("1:戦士  2:魔法使い > ");
		String stInNum = sc.nextLine();
		try {
			int num = Integer.parseInt(stInNum);
			if(num==1 || num==2) {
				return num;
			}
			return inputPlayer(sc);
		} catch (NumberFormatException e) {
			System.out.println("数値を入力して下さい。");
			return inputPlayer(sc);
		}
	}

	public static int inputAttack(Scanner sc) {
		System.out.println("攻撃技を選択してください。");
		System.out.print("1:刀攻撃  2:毒  3:ファイヤーボール  4:回復 > ");
		String stInNum = sc.nextLine();
		try {
			int num = Integer.parseInt(stInNum);
			if(num>=1 && num<=4) {
				return num;
			}
			return inputPlayer(sc);
		} catch (NumberFormatException e) {
			System.out.println("数値を入力して下さい。");
			return inputPlayer(sc);
		}
	}
}
