package FactoryMethod;

public class MainCarTest {

	public static void main(String[] args) {
		//ファクトリーの生成
		CarFactory toyota = new ToyotaFactory();
		CarFactory honda = new HondaFactory();

		//車
		CarProduct vitz = toyota.create("Vitz", "青");
		vitz.showModel();
		vitz.run();
		System.out.println();
		
		CarProduct prius = toyota.create("Prius", "シルバー");
		prius.showModel();
		prius.run();
		System.out.println();
		
		CarProduct civic = honda.create("Civic", "黒");
		civic.showModel();
		civic.run();
		System.out.println();
		
		CarProduct nsx = honda.create("NSX", "赤");
		nsx.showModel();
		nsx.run();

	}

}
