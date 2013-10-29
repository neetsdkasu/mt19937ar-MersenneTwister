package hoge;

import java.io.IOException;
import java.io.PrintStream;

import mt19937ar.MersenneTwister;

public class Hoge {

	public static void main(String[] args) throws IOException {
		MersenneTwister rand = new MersenneTwister();
//		PrintStream out = System.out;
		PrintStream out = new PrintStream("test.out");
		
		// mt19937ar.out ��r�p�o��
	    int i;
	    long[] init= {0x123, 0x234, 0x345, 0x456};
	    int length = 4;
	    rand.init_by_array(init, length);
	    /* This is an example of initializing by an array.       */
	    /* You may use init_genrand(seed) with any 32bit integer */
	    /* as a seed for a simpler initialization                */
	    out.println("1000 outputs of genrand_int32()");
	    for (i = 0; i < 1000; i++) {
	      out.printf("%10d ", rand.genrand_int32());
	      if (i % 5 == 4) out.println();
	    }
	    out.println("\n1000 outputs of genrand_real2()");
	    for (i = 0; i < 1000; i++) {
	      out.printf("%10.8f ", rand.genrand_real2());
	      if (i % 5 == 4) out.println();
	    }
	    
	    out.close();
	}

}
