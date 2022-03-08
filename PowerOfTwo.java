// Write a program that calculates all the powers of 2 from 1 - 10
// 2 4 8 16 32
public class PowerOfTwo {
	public static void main(String [] args) {
		
		int pow = 0;
		
		for (int i = 2; i <= 1024 ; i++) {
			pow = (int) Math.pow(i, pow); // sum += i
			}
		
		System.out.println(pow);
		
		
	}
}
