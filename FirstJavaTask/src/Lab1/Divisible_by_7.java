package Lab1;

/**
 * This class displays the lists of the numbers and sum of that number which is
 * divisible by 7 between 100 to 200 .
 * 
 * @author srizna
 * 
 */
public class Divisible_by_7 {
	public static void main(String[] args) {
		int sum = 0;
		int counter=0;
		
		for (int i = 100; i <= 200; i++) {
			if ((i % 7) == 0) {
				counter++;
				sum = sum + i;
				System.out.println(i + " " + "is divisible by 7");
			}
		}
		
		System.out.println("Total numbers divisible by 7 is:"+"\t"+counter);
		System.out.println("The sum of the numbers between 100 to 200 divisible by 7 is"
						+ " " + sum);
	}

}
