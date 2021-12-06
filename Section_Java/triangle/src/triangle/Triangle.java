package triangle;


public class Triangle {
	public void dessineTriangleBas(int m)
	{
		for (int i=1;i<=m;i++)
		{
			for (int j=i ;j<=m;j++)
			{
				System.out.print(" * ");
	        }
			System.out.println("");
		}
	}
	public void dessineTriangleHaut(int n) 
	{
		for(int l=1;l<=n;l++)
		{
			for(int k=1;k<=l;k++)
			{
				System.out.print(" * ");
			}
			System.out.println("");
		}
		
	}
}
