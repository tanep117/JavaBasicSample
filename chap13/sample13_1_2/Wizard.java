package chap13.sample13_1_2;

public class Wizard extends Player {

	public Wizard() {
		super("魔法使い");
	}

	@Override
	public void showStatus() {
		System.out.println("魔法使いは少し疲れている。");
	}

}
