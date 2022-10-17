package java011_casting.part04;

public class Java112_binding {

	// 결합도와 상호의존성이 낮아졌다.
	public static void process(HomeTv tv) {
		tv.turnOn();
		tv.soundUp();

		if (tv instanceof SamsungTv) {
			SamsungTv stv = (SamsungTv) tv;
			stv.move();
		} else if (tv instanceof LgTv) {
			LgTv ltv = (LgTv) tv;
			ltv.call();
		}

	}

	public static void main(String[] args) {

		LgTv lg = new LgTv("LG"); // 객체생성
		process(lg);

		SamsungTv ss = new SamsungTv("SAMSUNG"); // 객체생성
		process(ss);

	}// end main()

}// end class
