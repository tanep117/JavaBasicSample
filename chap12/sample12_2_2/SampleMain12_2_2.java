package chap12.sample12_2_2;

public class SampleMain12_2_2 {

	public static void main(String[] args) {

		SorawoTobu[] tobumono = {
				new AirPlane(),
				new Helicopter(),
				new Bird()
		};

		for(SorawoTobu tobu: tobumono) {
			tobu.fly();
		}

	}



}
