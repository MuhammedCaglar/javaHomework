package javaHomework;

public class Course {
	
	public Course() {
		System.out.println("Course Constructor çalýþtý.");
	};
	
	public Course(int id,String name,int completePercent) {
		this.id=id;
		this.name=name;
		this.completePercent=completePercent;
		System.out.println("Course Constructor çalýþtý.");
	};
	
	int id;
    String name;
    int completePercent;
    
}
