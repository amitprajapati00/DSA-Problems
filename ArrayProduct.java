class  ArrayProduct
{
	//production array element either index no.
	/*static int[] ProductElement(int[] arr)
	{
		int[] result=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			result[i]=1;
			for(int j=0;j<arr.length;j++)
			{
				if(i!=j)
				{
					result[i]*=arr[j];
				}
			}
		}
		return result;
	}*/
	static int[] ProductElement(int[] arr)
	{
		int[] result=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			result[i]=arr[i]*arr[i];
		}
		return result;
	}
	public static void main(String... ak)
	{
		int arr[]={10,3,5,8,9};
		int[] result=ArrayProduct.ProductElement(arr);
		for(int i=0;i<result.length;i++)
		{
			//calculate square of the given array element
			System.out.println(result[i]);
		}
	}
}