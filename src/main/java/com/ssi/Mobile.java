package com.ssi;

public class Mobile {

		private SIM sim;
		
		public void setSim(SIM sim) {
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
