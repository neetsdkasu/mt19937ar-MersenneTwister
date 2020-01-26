import java.io.PrintStream;

import mt19937ar.MTRandom;

public class TestRandom {

	public static void main(String[] args) throws Exception {

		try (PrintStream out = new PrintStream("test_random.out")) {

			MTRandom rand = new MTRandom(12345L);

			for (int i = 0; i < 100; i++) {
				out.printf("%d, ", rand.nextInt(100));
				if (i % 10 == 9)
					out.println();
			}
			for (int i = 0; i < 100; i++) {
				out.printf(rand.nextBoolean() + ", ");
				if (i % 10 == 9)
					out.println();
			}
			for (int i = 0; i < 100; i++) {
				out.printf("%f, ", rand.nextDouble());
				if (i % 10 == 9)
					out.println();
			}
			for (int i = 0; i < 100; i++) {
				out.printf("%f, ", rand.nextGaussian());
				if (i % 10 == 9)
					out.println();
			}

			long[] init = { 0x123, 0x234, 0x345, 0x456 };
			rand = new MTRandom(init);

			for (int i = 0; i < 100; i++) {
				out.printf("%d, ", rand.nextInt(100));
				if (i % 10 == 9)
					out.println();
			}
			for (int i = 0; i < 100; i++) {
				out.printf(rand.nextBoolean() + ", ");
				if (i % 10 == 9)
					out.println();
			}
			for (int i = 0; i < 100; i++) {
				out.printf("%f, ", rand.nextDouble());
				if (i % 10 == 9)
					out.println();
			}
			for (int i = 0; i < 100; i++) {
				out.printf("%f, ", rand.nextGaussian());
				if (i % 10 == 9)
					out.println();
			}

			rand.setSeed(12345L);
			for (int i = 0; i < 100; i++) {
				out.printf("%d, ", rand.nextInt(100));
				if (i % 10 == 9)
					out.println();
			}
		}
	}

}
