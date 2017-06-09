import java.util.*;
class arrayrepeat
{
    public static void main(String args[])
    {
        {
        Scanner in=new Scanner(System.in);
   	   	String s1=in.nextLine();
        char[] c=s1.toCharArray();
        for(int i=0;i<s1.length();i++)
        {
            int f=0;
        	char ch=s1.charAt(i);
        	for(int j=0;j<s.length();j++)
        	{
        		if(ch==c[j])
        		{
        			f++;
        		}
        	}
        	if(f==1)
        	{
        		System.out.print(c[i]);
        	}
        }
       
        
        }
    }
}
