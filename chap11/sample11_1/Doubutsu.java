package chap11.sample11_1;

public class Doubutsu {
	private String syurui;  //動物の種類
	private String name;    //動物の名前

	public Doubutsu(String syurui, String name) {
		this.syurui= syurui;
		this.name = name;
	}

	public void showStatus() {
		System.out.println("私は" + this.syurui + "です。");
		System.out.println("名前は" + this.name + "です。");
	}

	public void naku() {
		System.out.println(this.syurui + "は鳴きます。");
	}

}
