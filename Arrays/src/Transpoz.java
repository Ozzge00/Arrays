import java.util.Arrays;
import java.util.Scanner;

public class Transpoz {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Dizinizn sýra boyutunu giriniz:");
		int r=input.nextInt();
		System.out.print("Dizinizn sutun boyutunu giriniz:");
		int c=input.nextInt();
		int[][] list=new int[r][c];
		
		for(int i=0;i<r;i++){
			
			for(int j=0;j<c;j++){
				
				System.out.print("Elaman giriniz:");
				list[i][j]=input.nextInt();
			}
		}
		System.out.println("Matris: ");
		for(int i=0;i<r;i++){
			
			for(int j=0;j<c;j++){
				System.out.print(list[i][j]+" ");
			}
			System.out.println(" ");
		}
		
		System.out.println("Transpoze: ");
		for(int i=0;i<list[0].length;i++){
			
			for(int j=0;j<list.length;j++){
				
				System.out.print(list[j][i]+" ");
				
			}
			System.out.println(" ");
		}
		}

}


