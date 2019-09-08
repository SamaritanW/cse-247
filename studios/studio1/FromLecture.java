package studio1;

import timing.ExecuteAlgorithm;
import timing.Ticker;
import timing.quiet.QuietAlgorithm;
import timing.utils.GenSizes;
import timing.utils.IntArrayGenerator;


public class FromLecture extends QuietAlgorithm {

	protected Ticker ticker;
	protected long   sum;

	public FromLecture() {

	}

	/**
	 * Begin with an array of two elements.
	 */
	@Override
	public void reset(Ticker ticker) {
		this.ticker = ticker;
	}

	/**
	 * As a "quiet" algorithm, all we care about is the
	 * parameter n.
	 */
	@Override
	public void run() {
		int j = 0;
		while (j <= n/2) {
			for (int k=0; k < 3; ++k) {
				//
				// Here
				ticker.tick();
				//
			}
			j = j + 1;
		}
	}
	
	public String toString() {
		return "Problem Lecture";
	}

	public static void main(String[] args) {
		GenSizes sizes = GenSizes.arithmetic(1, 100, 1);
		ExecuteAlgorithm.timeAlgorithm(
				"Lecture", 
				"studio1.FromLecture", 
				new IntArrayGenerator(), 
				sizes
				);	
	}

}
// question B1:
//1. c=1, n0=2
//2. c=500, n0=2
//3. c=1, n0=2
// question C1
// 1. 500O= O（n^2） c=1 n0= 75 
// 2. an+b=O(n^2) c=1 n0=a+sqrt(a^2-4b)/2) 
//question D1
// 1. NO
// 2. NO
// question E1