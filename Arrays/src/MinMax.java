import java.util.Arrays;
import java.util.Scanner;
public class MinMax {

	public static void main(String[] args) {

	int[] list= {15,12,788,1,-1,-778,2,0};
	Scanner input=new Scanner(System.in);
	System.out.print("Say� giriniz:");
	int number=input.nextInt();
	Arrays.sort(list);
	int max=0,min=0;
	
	for(int i:list)
	{
		if(i<number) min=i;
	}
	
	for(int i=list.length-1;i>=0;i--)
	{
		if(list[i]>number) max=list[i];
		
	}	
		
	System.out.println("Girilen Say�:"+number);
	System.out.println("Girilen say�dan k���k en yak�n say�:"+min);
	System.out.println("Girilen say�dan b�y�k en yak�n say�:"+max);
	}

}
