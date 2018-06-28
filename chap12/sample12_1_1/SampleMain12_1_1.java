package chap12.sample12_1_1;

public class SampleMain12_1_1 {

	public static void main(String[] args) {

		Player[] party = { new Asobinin(),
				new Souryo() };

		for (int j = 0; j < party.length; j++) {
			System.out.println(party[j].getJob() + "の攻撃のターン");
			party[j].attack();
		}
	}

}
