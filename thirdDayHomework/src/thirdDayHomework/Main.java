package thirdDayHomework;

public class Main {

	public static void main(String[] args) {
		Student student1= new Student();
		student1.setId(1);
		student1.setFirstName("Muhammet Emin");
		student1.setLastName("Çağlar");
		student1.setEmail("me@gmail.com");
		student1.setSuccessPercent(70);
	
		Instructor instructor1 = new Instructor();
		instructor1.setId(1);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroğ");
		instructor1.setEmail("ed@gmail.com");
		instructor1.setInstructorInfo("... Doğdu, ... Yaşında, ... Dan Mezun");
	
		UserManager userManager = new UserManager();
		userManager.add(instructor1);
		userManager.delete(instructor1);
		userManager.update(instructor1);
		userManager.add(student1);
		userManager.delete(student1);
		userManager.update(student1);
		
		System.out.println("------UserManager bitti--------");
		
		InstructorManager instructorManager= new InstructorManager();
		instructorManager.add(instructor1);
		instructorManager.delete(instructor1);
		instructorManager.update(instructor1);
		
		System.out.println("------InstructorManager bitti--------");
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);
		studentManager.delete(student1);
		studentManager.update(student1);

	}

}
