import java.util.*;
class arra
{
 public static void main(String args[])
 {
  Scanner sc=newScanner(System.in);
  int n=sc.nextInt();
  int[] a=new int[n];
  int x=0;y=0;z=0;
  for(int i=0i<n;i++)
  {
   a[i]=sc.nextInt();
  }
  for(int i=0;i<n;i++)
  {
   for(int j=1;j<n;j++)
   {
    for(int k=n-1;k>=0;k--)
    {
     if(i!=j&&j!=k)
     {
      x=a[i];
      y=a[j];
      z=a[k];
      System.out.println("sum of "+y+" "+z+"is"+x);
     }
    }
   }
  } 
 }
}      
