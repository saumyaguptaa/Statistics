import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class MMM {
	static int[] sortArray(int[] n) {
		Arrays.sort(n);
		return n;
	}
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		String s = "1 2 3 4 5 6 7 2";
		String ar[] = s.split(" ");
		int[] iar = new int[ar.length];
		double mean = 0, median, mode;
		for(int i = 0; i<ar.length;i++)
			iar[i]=Integer.parseInt(ar[i].trim()); 	
		for(int j : iar)
			mean = mean + j;
		mean /= ar.length;
		System.out.println("Mean = "+mean);
		int num = ar.length;
		iar = sortArray(iar);
		if(num%2 == 1)
			median = iar[(num+1)/2];
		else
			median = iar[num/2]+iar[(num/2)+1];
		
		System.out.println("Median = "+median);
		HashMap map = new HashMap<>();
		for(int i : iar)
			if(map.containsKey(i))
				map.replace(i, (int)(map.get(i))+1);
			else
				map.put(i, 1);
		System.out.println(map.toString());
	}
}
