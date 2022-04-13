package Day30;

public class InvoiceGenerator {
	private static final double MINIMUM_COST_PER_KM = 10;
	private static final double COST_PER_TIME = 1;
	private static final double MINIMUM_FARE = 5;

	/*
	 * CalculateFare calculate a distance, MINIMUM_COST_PER_KOLOMETER. time,
	 * COST_PER_TIME Result is Result. create one method calculateFare()
	 */
	public double calculateFare(double distance, int time) {
		double totalFare = distance * MINIMUM_COST_PER_KM + time * COST_PER_TIME;
		return Math.max(totalFare, MINIMUM_FARE);
	}

	/*
	 * @Description- array of ride Is Created and check a rides value. calculated a
	 * total fare.
	 */
	public InvoiceSummary calculateFare(Ride[] rides) {
		double totalFare = 0;
		for (Ride ride : rides) {
			totalFare += this.calculateFare(ride.distance, ride.time);
		}
		return new InvoiceSummary(rides.length, totalFare);
	}
}