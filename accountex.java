package neww;


public class accountex { 
		
		private int number;
		private String holder;
		private double balance;
		
		public accountex(int number, String holder) {
		
			this.number = number;
			this.holder = holder;
		}
		public accountex(int number, String holder, double initialDeposit) {
			super();
			this.number = number;
			this.holder = holder;
			deposit(initialDeposit);
		}
		public int getNumber() {
			return number;
		}

		public String getHolder() {
			return holder;
		}
		public void setHolder(String holder) {
			this.holder = holder;
		}
		public double getBalance() {
			return balance;
		}

	   public void deposit( double amoount) {
		   balance += amoount;
	   }
	   public void withdraw(double amoount) {
		   balance -= amoount +5.0; 
	   
	   }
		
	 public String toString() {
		 return "account" 
		        + number
		        +", holder: "
		        + holder 
		        + ", balance:$"
		        + String.format("%.2df",balance);
				 
		
		 
		 
		 
		 
		 
	 }
	 }
		
		
		
		
		