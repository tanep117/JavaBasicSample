package chap13.sample13_1_2;

public class Poison implements Attack {

	@Override
	public void exec() {
		System.out.println("毒の攻撃。相手は毎ターン10づつダメージを食らう。");
	}

}
