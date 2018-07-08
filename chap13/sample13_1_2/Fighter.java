package chap13.sample13_1_2;

public class Fighter extends Player {

	public Fighter() {
		super("戦士");
	}

	@Override
	public void showStatus() {
		System.out.println("戦士は元気です。");
	}

}
