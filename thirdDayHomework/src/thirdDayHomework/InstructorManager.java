package thirdDayHomework;

public class InstructorManager extends UserManager {
	
		@Override
		public void add(User user) {
			System.out.println("Kullanýcý eklendi : " + user.getFirstName());
		}
		
		@Override
		public void delete(User user) {
			System.out.println("Kullanýcý silindi : " + user.getFirstName());
		}
		
		@Override
		public void update(User user) {
			System.out.println("Kullanýcý güncellendi : " + user.getFirstName());
		}
		
		
}
