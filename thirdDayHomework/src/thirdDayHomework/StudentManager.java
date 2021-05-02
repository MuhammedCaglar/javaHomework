package thirdDayHomework;

public class StudentManager extends UserManager {
	
	@Override
	public void add(User user) {
		System.out.println("Öðrenci eklendi : " + user.getFirstName());
	}
	
	@Override
	public void delete(User user) {
		System.out.println("Öðrenci silindi : " + user.getFirstName());
	}
	
	@Override
	public void update(User user) {
		System.out.println("Öðrenci güncellendi : " + user.getFirstName());
	}
}
