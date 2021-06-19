package com.ssi;

public class Mobile {

		private SIM sim;
		private String brand;
		
		public Mobile() {
			System.out.println("Zero Arg Constructor...!");
		}
		public Mobile(SIM sim) {
			System.out.println("Setting SIM Using One Arg Constructor ...!");
			this.sim = sim;
		}

		public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			System.out.println("Setting Brand Using setter...!");
			this.brand = brand;
		}

		public void setSim(SIM sim) {
			System.out.println("Setting SIM using setter...!");
			this.sim = sim;
		}
		
		public void doCall() {
			if(sim!=null)
				sim.call();
			else
				System.out.println("Please Insert A SIM...!");
		}
		public void doMessage() {
			if(sim!=null)
				sim.sms();
			else
				System.out.println("Please Insert A SIM...!");
		}
}
