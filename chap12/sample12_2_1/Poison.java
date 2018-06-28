package chap12.sample12_2_1;

public class Poison implements Attack {

	@Override
	public void exec() {
		System.out.println("毒の攻撃。相手は毎ターン10づつダメージを食らう。");
	}

}
