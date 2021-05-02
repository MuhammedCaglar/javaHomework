package thirdDayHomework;

public class InstructorManager extends UserManager {
	
		@Override
		public void add(User user) {
			System.out.println("Kullanıcı eklendi : " + user.getFirstName());
		}
		
		@Override
		public void delete(User user) {
			System.out.println("Kullanıcı silindi : " + user.getFirstName());
		}
		
		@Override
		public void update(User user) {
			System.out.println("Kullanıcı güncellendi : " + user.getFirstName());
		}
		
		
}
