package java018_collection;

class Seoul {
	public void showYou() {
		System.out.println("seoul");
	}

}

class Fruit extends Seoul {
	@Override
	public void showYou() {
		System.out.println("Fruit");
	}

}

class Apple extends Fruit {
	@Override
	public void showYou() {
		System.out.println("Apple");
	}

}

class Orange extends Fruit {
	@Override
	public void showYou() {
		System.out.println("Orange");
	}

}

class Fruitbox<T> {
	private T item;

	public Fruitbox() {
		// TODO Auto-generated constructor stub
	}

	public void store(T item) {
		this.item = item;
	}

	public T pullout() {
		return item;
	}
}

public class Java199_User {

	public static void main(String[] args) {

	}// end main()

}
// end class
