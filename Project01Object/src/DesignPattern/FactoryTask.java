package DesignPattern;

interface PaymentGateway
{
 void paymentConnection();
}

class Gpay implements PaymentGateway
{

	@Override
	public void paymentConnection() {
		System.out.println("now user can use Paymentgateway -- Gpay");
}
	
}

class Paytm implements PaymentGateway
{

	@Override
	public void paymentConnection() {
		System.out.println("now user can use Paymentgateway -- Paytm");
		
	}
}

class Phonepay implements PaymentGateway
{

	@Override
	public void paymentConnection() {
		System.out.println("now user can use Paymentgateway -- Phonepay");
		
	}
	
}

class PaymentDetail
{
	private PaymentGateway pay;
public void SwitchPayment(String Service)
{
switch(Service)	
{
    case "Gpay":
	pay=new Gpay();
	break;

    case "Paytm":
	pay=new Paytm();
	break;

    case "Phonepay":
	pay=new Phonepay();
	break;
	
	default:
    pay=null;
	break;

}
}

public PaymentGateway getPayMent()
{
	return pay;
	
}
}

public class FactoryTask {
          
	   public static void main(String args[])
	   {
		   PaymentDetail paymentdetail= new  PaymentDetail();
		   paymentdetail.SwitchPayment("Phonepay");
		   PaymentGateway pay = paymentdetail.getPayMent();
		   pay.paymentConnection();
		   
	   }
}
