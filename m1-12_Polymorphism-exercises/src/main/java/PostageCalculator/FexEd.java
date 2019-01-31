package PostageCalculator;

public class FexEd implements DeliveryDriver {

	/*
	 * rate = 20.00 If distance > 500 miles then rate = rate + 5.00 If weight > 48
	 * ounces then rate = rate + 3.00
	 */
	public double calculateRate(int distance, double weight) {

		double rate = 20.00;

		if (distance > 500) {
			rate += 5.00;
		}
		if (weight > 48) {
			rate += 3.00;
		}
		return rate;
	}

	@Override
	public String getType() {

		return "FexEd                     ";
	}

}
