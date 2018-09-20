import java.util.Arrays;
import java.util.Scanner;

public class Quartiles {
    public double returnQ(double[] a){
        int l = a.length;
                
        if(l%2 == 1)
            return a[(l-1)/2];
        else {
            return (a[(l/2)-1]+a[l/2])/2;
        }
    }
    
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double ar[] = new double[n];
        for(int i = 0; i<n;i++) {
            ar[i] = sc.nextDouble();
        }
        Arrays.sort(ar);
        int l = ar.length;
        Quartiles obj = new Quartiles();
        if(l%2 == 1) {
            System.out.println(obj.returnQ(Arrays.copyOfRange(ar, 0, ((l-1)/2))));
            System.out.println(ar[(l-1)/2]);
            System.out.println(obj.returnQ(Arrays.copyOfRange(ar, (l+1)/2, l)));    
        }
        else{
            System.out.println(obj.returnQ(Arrays.copyOfRange(ar, 0, (l/2)-1)));
            System.out.println((ar[l/2]+ar[(l/2)-1])/2);
            System.out.println(obj.returnQ(Arrays.copyOfRange(ar, (l/2)+1, l)));
            
        }
    }
}
