package bankexception;

public class Test {
	public static void main(String[] args) {
		try {
			balance(3635);
			internate("No");
		}catch(InvalidBalanceException e) {
			System.out.println(e);
		}catch(NoInternateException e1) {
			System.out.println(e1);
		}
		finally {
			System.out.println("The balance");
		}
	}
	public static void balance(int balanceamt)throws InvalidBalanceException{
		if(balanceamt<100) {
			throw new InvalidBalanceException("NOT SUFFICENT BALANCE");
		}else {
			System.out.println("SUFFICIENT BALANCE");
		}
	}
	public static void internate(String internate)throws NoInternateException{
		if(internate!=null) {
			throw new NoInternateException("NOT SUFFICENT INTERNATE");
		}else {
			System.out.println("SUFFICIENT INTERNATE");
		}
	}

}
