package exercise_5;

public final class Immutable {
	
	private final String Student;
	private final int number;
	
	
	
	public Immutable(String student, int number) {

		Student = student;
		this.number = number;
	}



	public String getStudent() {
		return Student;
	}



	public int getNumber() {
		return number;
	}
	
	
	public String toString() {
		return Student+number;
		
	}
	
	
	

	}
	
	
	
