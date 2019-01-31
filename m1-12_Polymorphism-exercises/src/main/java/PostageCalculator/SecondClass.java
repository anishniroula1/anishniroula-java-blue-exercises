package PostageCalculator;

public class SecondClass implements DeliveryDriver {

	@Override
	public double calculateRate(int distance, double weight) {
		// (this is in Ounces )rate = per mile rate * distance
		double rate = 0;
		double perMile;
		if (weight >= 0 && weight <= 2) {
			perMile = 0.0035;
			rate = perMile * distance;

		} else if (weight >= 3 && weight <= 8) {
			perMile = 0.0040;
			rate = perMile * distance;
		} else if (weight >= 9 && weight <= 15) {
			perMile = 0.047;
			rate = perMile * distance;
		}
		if (weight >= 1*16 && weight <= 3*16) {
			rate = 0.0195 * distance;
		} else if (weight >= 4*16 && weight <= 8*16) {
			rate = 0.0450 * distance;
		} else if (weight >= 9 * 16) {
			rate = 0.0500 * distance;
		}

		return rate;
	}

	@Override
	public String getType() {

		return "Postal Service (2nd Class)";
	}

}
