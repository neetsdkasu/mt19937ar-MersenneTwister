import mt19937ar.Random;

public class TestRandom {

	public static void main(String[] args) {
		Random rand = new Random(12345L);

		for (int i = 0; i < 100; i++) {
			System.out.printf("%d, ", rand.nextInt(100));
			if (i % 10 == 9)
				System.out.println();
		}
		for (int i = 0; i < 100; i++) {
			System.out.printf(rand.nextBoolean() + ", ");
			if (i % 10 == 9)
				System.out.println();
		}
		for (int i = 0; i < 100; i++) {
			System.out.printf("%f, ", rand.nextDouble());
			if (i % 10 == 9)
				System.out.println();
		}
		for (int i = 0; i < 100; i++) {
			System.out.printf("%f, ", rand.nextGaussian());
			if (i % 10 == 9)
				System.out.println();
		}

		long[] init = { 0x123, 0x234, 0x345, 0x456 };
		rand.setSeed(init);

		for (int i = 0; i < 100; i++) {
			System.out.printf("%d, ", rand.nextInt(100));
			if (i % 10 == 9)
				System.out.println();
		}
		for (int i = 0; i < 100; i++) {
			System.out.printf(rand.nextBoolean() + ", ");
			if (i % 10 == 9)
				System.out.println();
		}
		for (int i = 0; i < 100; i++) {
			System.out.printf("%f, ", rand.nextDouble());
			if (i % 10 == 9)
				System.out.println();
		}
		for (int i = 0; i < 100; i++) {
			System.out.printf("%f, ", rand.nextGaussian());
			if (i % 10 == 9)
				System.out.println();
		}

		rand.setSeed(12345L);
		for (int i = 0; i < 100; i++) {
			System.out.printf("%d, ", rand.nextInt(100));
			if (i % 10 == 9)
				System.out.println();
		}
	}

}
