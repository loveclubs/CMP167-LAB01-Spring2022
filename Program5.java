/**
 * 
 * @author - Liesel
 * 
 */

package week5_;

public class Program5 {
	public static void main(String [] args) {
		int sum = 0;
		
		for (int i = 1; i <= 10 ; i++) {
		sum = sum + 1; // sum += i
		}
		System.out.println(sum);
		
		double total = 0.0;
		
		for (int i = 1; i <= 100; i++) {
			total += i;
		}
		
		System.out.println("Total average " + total);
		
	}
}
