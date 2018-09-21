import java.util.Scanner;
import java.math.*;
public class StdDev {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double m = 0, dev = 0;
        double ar[] = new double[n];
        for(int i = 0; i<n;i++) {
            ar[i] = sc.nextDouble();
            m += ar[i];
        }
        m /= n;
        for(double i:ar) 
        	dev += ((i-m)*(i-m));
        System.out.println(String.format("%.01f", (Math.sqrt(dev/n))));
	}
}
