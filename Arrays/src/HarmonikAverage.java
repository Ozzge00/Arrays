import java.util.Arrays;

public class HarmonikAverage {

	public static void main(String[] args) {
		int[] list= {2,4,6,8,10};
		System.out.println(Arrays.toString(list));
		System.out.println(list.length);
		double sum=1.0;
	
		for(int i=0;i<list.length;i++)
		{
			sum+=(1.0/list[i]);
					
		}
		
		double average=list.length/sum;
		System.out.println(average);
		
	}

}
