import java.util.HashSet;
import java.util.Set;


public class Problem1 {
	
	public static void main(String[] args) {
		
		int[] ints = {3,5};
		Set<Integer> mults = multof(ints,1000);
		
		System.out.println("Sum of multiples of 3 and 5: "+sumSet(mults));		
	}
	
	private static int sumSet(Set<Integer> set) {
		
		int sum = 0;
		
		for(int n : set)
			sum += n;
		
		return sum;
	}
	
	/**
	 * - multof
	 * Generate integer multiples < limit 
	 * @param num
	 * @param lim
	 * @return set of integer multiples
	 */
	private static Set<Integer> multof(int[] num, int lim) {
		
		Set<Integer> mults = new HashSet<Integer>();
		
		for(int n : num) {
			if(n >= 1) {
				for(int i = 1; i*n < lim; i++)
					mults.add(i*n);
			}
		}
		
		return mults;
	}

}
