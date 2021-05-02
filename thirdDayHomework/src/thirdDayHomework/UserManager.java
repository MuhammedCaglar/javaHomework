package thirdDayHomework;

public class UserManager {
		
		public void add(User user) {
			System.out.println("Kullanýcý eklendi : " + user.getFirstName());
		}
		
		public void delete(User user) {
			System.out.println("Kullanýcý silindi : " + user.getFirstName());
		}
		
		public void update(User user) {
			System.out.println("Kullanýcý güncellendi : " + user.getFirstName());
		}
		
		
		
}
