import java.util.*;
class uniq
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n1=sc.nextInt();
    int[] n=new int[n1];
    for(int i=0;i<n1;i++)
      no[i]=sc.nextInt();
    for(int j=0;j<n1;j++)
    {
      int a=0,b=0;
      int flag=0;
      a=n[j];
          for(int k=0;k<n1;k++)
          {
			      b=n[k]; 
            if(a==b)
              flag++;
          }
      if(flag==1)
	   {
         System.out.println(a);
		    break;
	   }
    }
  }
}
