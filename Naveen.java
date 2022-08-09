
public class Naveen {

	public static void main(String[] args) 
	{
		int[] arr = {11,1,6,5,8,9,4,7,3,2,10};
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]<arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[0]);
			break;
		}
	}

}
