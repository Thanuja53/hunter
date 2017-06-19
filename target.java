import java.util.*;
class target 
{
  public static void main(String s[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the target number");
    int no=sc.nextInt();
    for(int i=0;i<s.length;i++)
    {
      for(int j=0;j<s.length;j++)
      {
        if(i!=j)
        {
          if(Integer.valueOf(s[i])+Integer.valueOf(s[j])==no)
          {
            System.out.println(s[i]+" and "+s[j]);
          }
        }
      }
    }
  }
}
