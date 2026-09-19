public class overload_2 {
	static void deposit(String accountHolder, double amount) {
		System.out.println(accountHolder + " deposited Rs." + amount);
	}

	static void deposit(String accountHolder, double amount, String paymentMode) {
		System.out.println(accountHolder + " deposited Rs." + amount
				+ " using " + paymentMode);
	}

	static void deposit(String accountHolder, int amount) {
		System.out.println(accountHolder + " deposited Rs." + amount
				+ " in cash");
	}

	public static void main(String[] args) {
		deposit("Anu", 500);                        
		deposit("Rahul", 1250.50);                 
		deposit("Meena", 2000.00, "UPI");           
	}
}

