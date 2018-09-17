import java.util.Scanner;

public class WeightedMean {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int data[] = new int[n];
		int wt[] = new int[n];
		for(int i =0; i<n; i++)
			data[i] = sc.nextInt();
		for(int i =0; i<n; i++)
			wt[i] = sc.nextInt();
		int nr = 0, dr = 0;
		for(int i =0; i<n; i++) {
			nr += data[i]*wt[i];
			dr += wt[i];
		}
		System.out.println(nr/dr);
		
	}
}
