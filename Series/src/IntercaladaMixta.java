import java.util.Scanner;

public class IntercaladaMixta {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Digite valor de N");
		int N = x.nextInt();
		int a[]=new int[N];
		for (int i=0;i<N;i++)
		{
			if (i==0) 
			{
				a[i]=1;
			}
			else
			{
				if(i%2==0)
				{				
					a[i]=a[i-1]*2;
				}
				else
				{
					a[i]=a[i-1]+(i+1)/2;
				}
			}
		}
		for (int i=0;i<N;i++)
		{
			System.out.print(a[i]+" ");
		}


	}

}
