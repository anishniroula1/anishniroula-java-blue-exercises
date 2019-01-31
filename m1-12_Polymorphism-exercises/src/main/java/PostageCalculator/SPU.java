package PostageCalculator;

public class SPU implements DeliveryDriver {
	private int shipTime;

	public SPU(int shipTime) {
		this.shipTime = shipTime;
	}

	// If "4-Day Ground" then rate = (weight * 0.0050) * distance. If "2-Day
	// Business"
	// then rate = (weight * 0.050) * distance. If "Next Day" then rate = (weight *
	// 0.075) * distance.

	public double calculateRate(int distance, double weight) {

		double rate = 0;
		if (shipTime == 4) {
			rate = ((weight / 16) * 0.0050) * distance;
		}
		if (shipTime == 2) {
			rate = ((weight / 16) * 0.050) * distance;
		}
		if (shipTime == 1) {
			rate = ((weight / 16) * 0.075) * distance;
		}
		return rate;
	}

//	SPU (4-Day Ground)             
//	SPU (2-Day Business)            
//	SPU (Next Day)    
	@Override
	public String getType() {
		if (shipTime == 4) {
			return "SPU (4-Day Ground)        ";
		}
		if (shipTime == 2) {
			return "SPU (2-Day Business)      ";
		}
		if (shipTime == 1) {
			return "SPU (Next Day)            ";
		}

		return null;
	}

}
