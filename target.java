import java.util.*;

public class target
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a[]=new int[s.nextInt()];
		int t=sc.nextInt();
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		System.out.println(chcktrgt(a,t));
  }
	private static String chcktrgt(int[] a, int t)
	{
		String str=null;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==t)
					str=a[i]+","+a[j]+"  ";
			}
		}
		return str;
	}
}
