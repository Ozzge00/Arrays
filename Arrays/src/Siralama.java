import java.util.Scanner;
import java.util.Arrays;
public class Siralama {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
	
		System.out.print("Dizinin boyutu:");
		int n=input.nextInt();
		int[]list= new int[n];
		System.out.println("Dizinin elemalar�n� giriniz");
		for(int i=0;i<n;i++)
		{
			System.out.print((i+1)+".Elaman�:");
			int n2=input.nextInt();
			list[i]=n2;	
				
		}
		
		Arrays.sort(list);
		System.out.println("S�ralama:"+Arrays.toString(list));
		
		
		
	}
}


