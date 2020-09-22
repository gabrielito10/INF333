import java.util.*;
public class SerieConSalto {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Digite valor de N");
		int N=x.nextInt();
		/*
		//1,2,3,4,5,8,7,16,9,32
		int a=1;
		int b=2;
		System.out.println(a);
		System.out.println(b);
		for (int i=1 ; i<N ; i++)
		{
			if (i%2 != 0) //impar
			{
				a+=2;
				System.out.println(a);
			}	
			else  //par
			{
				b*=2;
				System.out.println(b);
			}
		}*/
		
		//8,2,9,2,11,4,14,12
				int a=8;
				int b=2;
				int y=1;
				int z=1;
				System.out.println(a);
				System.out.println(b);
				for (int i=1 ; i<N ; i++)
				{
					if (i%2 != 0) //impar
					{
						a+=y;
						y++;
						System.out.println(a);
					}	
					else  //par
					{
						b*=z;
						z++;
						System.out.println(b);
					}
				}
	}

}
