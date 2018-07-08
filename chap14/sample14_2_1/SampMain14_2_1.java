package chap14.sample14_2_1;

public class SampMain14_2_1 {

	public static void main(String[] args) {
		Fighter fighter = new Fighter();
		Wizard wizard = new Wizard();

		Object[] obj = new Object[2];
		obj[0] = fighter;
		obj[1] = wizard;

		for(int i=0; i<2; i++) {
			System.out.println(obj[i].toString());
		}
	}

}
