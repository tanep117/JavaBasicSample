package chap12.sample12_2_1;

public class SampleMain12_2_1 {
	/*
	 * interfaceの実装例
	 * interfaceにより武器が自由に変更可能になる。
	 */

	public static void main(String[] args) {

		//戦士と魔法使いのインスタンス化
		Fighter fighter = new Fighter();
		Wizard wizard = new Wizard();

		//攻撃技を設定する。
		fighter.setAttack(new SwordAttack());
		//fighter.setAttack(new Poison());
		wizard.setAttack(new FireBall());
		//wizard.setAttack(new Heal());

		//攻撃をする
		fighter.Attack();
		System.out.println("-----------------");
		wizard.Attack();

		//ステータス表示
		System.out.println("******************");
		fighter.showStatus();
		wizard.showStatus();

	}

}
