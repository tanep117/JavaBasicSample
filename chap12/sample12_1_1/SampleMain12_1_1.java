package chap12.sample12_1_1;

public class SampleMain12_1_1 {

	public static void main(String[] args) {

		Asobinin asobinin = new Asobinin();
		Souryo souryo = new Souryo();

		System.out.println(asobinin.getJob() + "の攻撃のターン");
		asobinin.attack();
		System.out.println(souryo.getJob() + "の攻撃のターン");
		souryo.attack();


		/*
		 * ポリモーフィズムを使った例
		 *
		Player[] party = { new Asobinin(),	new Souryo() };

		for (int j = 0; j < party.length; j++) {
			System.out.println(party[j].getJob() + "の攻撃のターン");
			party[j].attack();
		}
		*/
	}

}
