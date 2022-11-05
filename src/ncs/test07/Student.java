package ncs.test07;

public class Student extends Human {
	int number;
	String major;

	public Student(String name, int age, int height, int weight, int number, String major) {
		super(name, age, height, weight);
		this.number = number;
		this.major = major;
	}

	@Override
	public String toString() {
		String data = name + "\t" + age + "\t" + height + "\t" + weight + "\t" + number + "\t" + major;
		return data;
	}

}
