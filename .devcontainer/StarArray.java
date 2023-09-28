class StarArray
{
	public static void main(String[] args) {
	char arr[] []=new char[5][];
	int i;
	for(i=0;i<5;i=i+1)
	{
		arr[i]=new char[i+1];
	}
	for(i=0;i<5;i=i+1)
	{
		for(j=0;j<=i;j=j+1)
		{
			arr[i][j]='*';
		}
	}
	for(i=0;i<5;i=i+1)
	{
		for(j=0;j<=i;j=j+1)
		{
			System.out.print(arr[i][j]);
		}
		System.out.println();
	}
	}
}