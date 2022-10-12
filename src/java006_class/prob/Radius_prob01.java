package java006_class.prob;

public class Radius_prob01 {
	int pizza = 10;
	int donut = 2;
	double wonju = 3.14;
	double pizza_face = pizza * pizza * wonju;
	double donut_face = donut * donut * wonju;

	public Radius_prob01() {

	}

	public Radius_prob01(int pizza, int donut, double wonju, double pizza_face, double donut_face) {
		super();
		this.pizza = pizza;
		this.donut = donut;
		this.wonju = wonju;
		this.pizza_face = pizza_face;
		this.donut_face = donut_face;
	}

	public void display() {
		System.out.printf("자바피자의 면적은: %.1f\n", pizza_face);
		System.out.printf("자바도넛의 면적은: %.1f\n", donut_face);
	}

}
