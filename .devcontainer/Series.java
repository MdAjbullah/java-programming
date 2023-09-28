class Series
{
	public static void main(String[] args) {
		int i;
		i=1;
		while(i<=50)
		{
			System.out.print(i+",");
			i=i+1;
		}
        System.out.println("\n");
        i=50;
        do
        {
        	System.out.print(i+",");
        	i=i-1; 
        }
        while(i>=1);
        System.out.println("\n");
        for(i=2; i<=100; i=i+2)
        {
        	System.out.print(i+",");
        }
        System.out.println("\n");    
        for(i=65; i<=90; i=i+1)
        {
        	System.out.print((char)i+",");
        }
        System.out.println("\n");
	}
}