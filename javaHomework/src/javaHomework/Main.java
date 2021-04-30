package javaHomework;

public class Main {

	public static void main(String[] args) {
		
		Course kurs1=new Course();
		kurs1.id=1;
		kurs1.name="C#";
		kurs1.completePercent=45;
		
		Course kurs2=new Course(2,"Java",67);
		
		Course[] kurslar= {kurs1,kurs2};
		
		for (Course kurs : kurslar) {
			System.out.println(kurs.name);
		}
		
		System.out.println("-------Course classı bitti---------");
		
		Teacher egitmen1= new Teacher();
		egitmen1.name="Engin Demiroğ";
		
		Teacher egitmen2= new Teacher();
		egitmen2.name="Murat Kurtboğan";
		
		Teacher[] egitmenler= {egitmen1,egitmen2};
		for (Teacher egitmen : egitmenler) {
			System.out.println(egitmen.name);
		}
		
		System.out.println("--------Teacher classı bitti--------");
		
		CourseManager courseManager=new CourseManager();
		courseManager.addCourse(kurs2);
		courseManager.addHomeWork();
	}

}
