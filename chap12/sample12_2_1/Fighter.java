package chap12.sample12_2_1;

public class Fighter extends Player {

	public Fighter() {
		super("戦士");
	}

	@Override
	public void showStatus() {
		System.out.println("戦士は元気です。");
	}

}
