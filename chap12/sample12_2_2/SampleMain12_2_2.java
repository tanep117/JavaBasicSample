package chap12.sample12_2_2;

public class SampleMain12_2_2 {

	public static void main(String[] args) {

		/*
		SorawoTobu[] tobumono = {
				new AirPlane(),
				new Helicopter(),
				new Bird()
		};
		*/

		AirPlane airplane1 = new AirPlane();
		SorawoTobu airplane = new AirPlane();
		SorawoTobu helicopter = new Helicopter();
		SorawoTobu Bird = new Bird();

		SorawoTobu[] tobu = {airplane, helicopter, Bird};


		for(int i=0; i<tobu.length; i++) {
			tobu[i].fly();
		}


	}



}
