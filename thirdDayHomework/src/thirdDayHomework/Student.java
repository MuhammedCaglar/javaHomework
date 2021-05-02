package thirdDayHomework;

public class Student extends User {
		private int successPercent;

		public int getSuccessPercent() {
			return successPercent;
		}
		
		//set böyle yazýlmaz normalde fakat ben tam dataya eriþim bilmediðim için ellemedim.
		public void setSuccessPercent(int successPercent) {
			this.successPercent = successPercent;
		}
}
