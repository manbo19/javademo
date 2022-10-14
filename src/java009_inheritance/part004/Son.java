package java009_inheritance.part004;

public class Son extends Parent {
	String dept;

	public Son() {

	}

	public Son(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}

	public String toString() {
		return String.format("%s %d %s\n", name, age, dept);
	}

}
