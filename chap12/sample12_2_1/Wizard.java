package chap12.sample12_2_1;

public class Wizard extends Player {

	public Wizard() {
		super("魔法使い");
	}

	@Override
	public void showStatus() {
		System.out.println("魔法使いは少し疲れている。");
	}

}
