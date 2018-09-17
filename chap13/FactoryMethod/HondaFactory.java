package FactoryMethod;

public class HondaFactory extends CarFactory {

	@Override
	public CarProduct createCar(String model) {

		switch (model){
		case "Civic":
			return new Civic();
		case "NSX":
			return new NSX();
		}
		return null;
	}

}
