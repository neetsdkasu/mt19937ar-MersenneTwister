package mt19937ar;

public class Random extends java.util.Random {

	final MersenneTwister mt;

	public Random() {
		this(System.currentTimeMillis());
	}

	public Random(long seed) {
		super(0);
		mt = new MersenneTwister(seed);
	}

	public Random(long[] init_key) {
		super(0);
		mt = new MersenneTwister();
		mt.init_by_array(init_key, init_key.length);
	}

	protected synchronized int next(int bits) {
		return (int) (mt.genrand_int32() >> (32 - bits));
	}

	public synchronized void setSeed(long seed) {
		super.setSeed(seed);
		if (mt == null) {
			return; // call by super class (java.util.Random) constructor
		}
		mt.init_genrand(seed);
	}

	public synchronized void setSeed(long[] init_key) {
		super.setSeed(0);
		mt.init_by_array(init_key, init_key.length);
	}
}
