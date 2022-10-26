package ncs.test08;

public class User {
	String id;
	String password;
	String name;
	int age;
	char[] gender;
	String phone;

	public User() {

	}

	public User(String id, String password, String name, int age, char[] gender, String phone) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
	}

	@Override
	public String toString() {
		String data = id + "\t" + password + "\t" + name + "\t" + age + "\t" + gender + "\t" + phone;
		return data;
	}

}
