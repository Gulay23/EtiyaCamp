package customerWorkShop;

public class CarCredit extends CreditManager {
	public double calculate(double price) {
		double number= price*1.20;
		System.out.println("kredi hesapland�: "+ number);
		return price*1.20;
	}
}
