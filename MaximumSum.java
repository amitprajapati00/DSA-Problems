class MaximumSum
{
	static int GreatestSum(int[] arr)
	{
		int sum=0,temp=0;
		 for(int i=0;i<arr.length;i++)
		 {
			 if(i==0)
			 {
				sum=arr[0];
			 }
			 temp=0;
			 for(int j=i;j<arr.length;j++)
			 {
				temp+=arr[j];
			 }
			 if(sum<temp)
			 {
				 sum=temp;
			 }
		 }
		 return sum;
	}
	public static void main(String... ak)
	{
		//int arr[]={2,3,-8,7,-1,3,2};
		//int arr[]={-2,-4};
		int arr[]={5, 4, 1, 7, 8};
		System.out.println(GreatestSum(arr));
	}
}