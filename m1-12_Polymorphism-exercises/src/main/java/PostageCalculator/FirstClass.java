package PostageCalculator;

public class FirstClass implements DeliveryDriver {

	@Override
	public double calculateRate(int distance, double weight) {
		// (this is in Ounces )rate = per mile rate * distance
		double perMile;
		double rate = 0;
		if (weight >= 0 && weight <= 2) {
			perMile = 0.035;
			rate = perMile * distance;

		}
		if (weight >= 4 && weight <= 8) {
			perMile = 0.040;
			rate = rate * distance;
		}
		if (weight >= 9 && weight <= 15) {
			perMile = 0.047;
			rate = perMile * distance;
		} else if (weight >= 1*16 && weight <= 3*16) {
			rate = 0.195 * distance;
		} else if (weight >= 4*16 && weight <= 8*16) {
			rate = 0.450 * distance;
		} else if (weight >= 9 * 16) {
			rate = 0.500 * distance;
		}

		return rate;
	}

	@Override
	public String getType() {

		return "Postal Service (1st Class)";
	}

}
