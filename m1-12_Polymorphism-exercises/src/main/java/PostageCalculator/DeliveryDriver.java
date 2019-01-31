package PostageCalculator;

public interface DeliveryDriver {
	double calculateRate(int distance, double weight);
	//double calculateRatePound(int pDistance, double pWeight);
	String getType();

}
