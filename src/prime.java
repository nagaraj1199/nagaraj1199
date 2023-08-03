
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
public class prime 
{
    int a,i,j;
    void get()
    {
        System.out.println("Enter the value");
        Scanner s1=new Scanner(System.in);
        a=s1.nextInt();
        for(j=2;j<=a;j++)
        {
        
          
        
        
            for(i=2;i<=j;i++)
            {
                if(j%i==0)
                    break;
            }
            if(j==i)
                System.out.println(j);
            
        }
                
            }
            
            
        
    
    public static void main(String arg[])
    {
        prime s2=new prime();
        s2.get();
    }
}
