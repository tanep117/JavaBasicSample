package FactoryMethod;

public class ToyotaFactory extends CarFactory {

	@Override
	public CarProduct createCar(String model) {

		switch (model){
		case "Vitz":
			return new Vitz();
		case "Prius":
			return new Prius();
		}

		return null;
	}

}
