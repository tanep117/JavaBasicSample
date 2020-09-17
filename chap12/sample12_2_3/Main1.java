package chap12.sample12_2_3;

public class Main1 {

	public static void main(String[] args) {

		Dog dog = new Dog();
		Baby baby = new Baby();

		dog.wark();
		baby.wark();

		Doubutsu[] doubutsu = {dog, baby};
		for(Doubutsu d: doubutsu) {
			d.wark();
		}
	}

}
