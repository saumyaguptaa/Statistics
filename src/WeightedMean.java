import java.util.Scanner;
import java.math.*;
public class WeightedMean {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double response, nr, dr;
		int n = sc.nextInt();
		int data[] = new int[n];
		int wt[] = new int[n];
		for(int i =0; i<n; i++)
			data[i] = sc.nextInt();
		for(int i =0; i<n; i++)
			wt[i] = sc.nextInt();
		nr = 0.0; dr = 0.0;
		for(int i =0; i<n; i++) {
			nr += data[i]*wt[i];
			dr += wt[i];
		}
		response = nr/dr;
		System.out.println(Math.round(response * 10) / 10.0);
	}
}