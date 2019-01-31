package PostageCalculator;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class PostageCalculator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<DeliveryDriver> deliveryDriver = new ArrayList<DeliveryDriver>();
		/* if OZ is more then 15, do 15/16 which will convert to lb */

		SPU gound4 = new SPU(4);
		SPU ground2 = new SPU(2);
		SPU nextDay = new SPU(1);

		deliveryDriver.add(new FirstClass());
		deliveryDriver.add(new SecondClass());
		deliveryDriver.add(new ThirdClass());
		deliveryDriver.add(new FexEd());
		deliveryDriver.add(gound4);
		deliveryDriver.add(ground2);
		deliveryDriver.add(nextDay);
		

		System.out.println("Please enter the weight of the package? ");
		double inWeight = in.nextDouble();
		in.nextLine();
		System.out.println("(P)ounds or (O)unces? ");

		String userChoice = in.nextLine();
		String newChoice = userChoice.toUpperCase();

		System.out.println("What distance will it be traveling? ");
		int userDistance = in.nextInt();
		in.nextLine();

		if (newChoice.equals("O")) {
			System.out.printf("%10s                    %10s", "Delivery Method", "$ cost");
			System.out.println();
			System.out.println("----------------------------------------------------");

			for (DeliveryDriver newPlan : deliveryDriver) {
				System.out.printf("%10s              %4.2f", newPlan.getType(),
						newPlan.calculateRate(userDistance, inWeight));
				System.out.println();
				// System.out.println(newPlan.getType() + " " + "Rate: " +
				// newPlan.calculateRate(userDistance, inWeight));
			}
		}
		if (newChoice.equals("P")) {
			inWeight = inWeight * 16.0;
			System.out.printf("%10s                    %10s", "Delivery Method", "$ cost");
			System.out.println();
			System.out.println("----------------------------------------------------");

			for (DeliveryDriver newPlan : deliveryDriver) {
				System.out.printf("%10s              %4.2f", newPlan.getType(),
						newPlan.calculateRate(userDistance, inWeight));
				System.out.println();
			}
		}
	}

}
