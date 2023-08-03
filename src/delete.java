
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raja
 */
public class delete 
{
    int n,count=0, i,j,b[]=new int[900];
    int a[]=new int[100];
    int c=a[0];
    void get()
    {
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(i=0;i<n;i++)
        {
            a[i]=s.nextInt();
           
        }
        
        
        for(i=0;i<n;i++)
        {
            for(j=1;j<i;j++)
            {
                if(a[i]==a[j])
                {
                    count++;
                }
                if(count==0)
                {
                    System.out.println(a[i]);
                }count=0;
            }
        }
    }
    
public static void main(String arg[])
{
    delete s1=new delete();
    s1.get();


}
}
