package chap14.sample14_2_2;

public class SampMain14_2_2 {

	public static void main(String[] args) {
		Fighter fPapasu = new Fighter("パパス");
		Fighter fPapasu2 = new Fighter("パパス");
		Fighter fTonnura = new Fighter("とんぬら");
		Wizard wPapasu = new Wizard("パパス");

		System.out.println("fPapasuとfPapasu");
		System.out.println(fPapasu.equals(fPapasu));
		System.out.println("-------------------------");
		System.out.println("fPapasuとfPapasu2");
		System.out.println(fPapasu.equals(fPapasu2));
		System.out.println("-------------------------");
		System.out.println("fPapasuとfTonnura");
		System.out.println(fPapasu.equals(fTonnura));
		System.out.println("-------------------------");
		System.out.println("fPapasuとwPapasu");
		System.out.println(fPapasu.equals(wPapasu));
	}

}
