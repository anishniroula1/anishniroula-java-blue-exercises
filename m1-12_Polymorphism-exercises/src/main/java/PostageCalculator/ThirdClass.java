package PostageCalculator;

public class ThirdClass implements DeliveryDriver {

	@Override
	public double calculateRate(int distance, double weight) { // 600 50
		// (this is in Ounces )rate = per mile rate * distance
		double rate = 0;
		if (weight >= 0 && weight <= 2) {
			rate = 0.0020;
			rate = rate * distance;

		} else if (weight >= 3 && weight <= 8) {
			rate = 0.0022;
			rate = rate * distance;
		} else if (weight >= 9 && weight <= 15) {
			rate = 0.0024;
			return rate * distance;
		}
		if (weight >= 1*16 && weight <= 3*16) {
			rate = 0.0150 * distance;
		} else if (weight >= 4*16 && weight <= 8*16) {
			rate = 0.0160 * distance;
		} else if (weight >= 9 * 16) {
			rate = 0.0170 * distance;
		}

		return rate;
	}

	@Override
	public String getType() {

		return "Postal Service (3rd Class)";
	}

}
