package solid.Ocp;

public class Main {

	public static void main(String[] args) {
		//SOLID PRENS�B�N�N �K�NC� HARF�N� TEMS�L EDEN "OPEN CLOSED" �RNE��..
		//OPEN CLOSED=PROGRAMLAR YEN� �ZELL�K EKLEMEYE A�IK,FAKAT O �ZELL�KLER� DE���T�RMEYE KAPALI OLMALIDIR.YAN� MEVCUTTAK� KODLAR DE���T�R�LMEMEL�D�R.
		
	CustomerManager customerManager=new CustomerManager(new EfCustomerDal());
		customerManager.add();

	}

}
