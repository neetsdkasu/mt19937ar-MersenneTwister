package hoge;

import mt19937ar.MersenneTwister;

public class Hoge {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		MersenneTwister rand = new MersenneTwister(10);

	    int i;
	    long[] init= {0x123, 0x234, 0x345, 0x456};
	    int length=4;
	    rand.init_by_array(init, length);
	    /* This is an example of initializing by an array.       */
	    /* You may use init_genrand(seed) with any 32bit integer */
	    /* as a seed for a simpler initialization                */
	    System.out.println("1000 outputs of genrand_int32()");
	    for (i=0; i < 1000; i++) {
	      System.out.printf("%10d ", rand.genrand_int32());
	      if (i%5==4) System.out.println();
	    }
	    System.out.println("\n1000 outputs of genrand_real2()");
	    for (i=0; i<1000; i++) {
	      System.out.printf("%10.8f ", rand.genrand_real2());
	      if (i%5==4) System.out.println();
	    }		
		
	}

}
