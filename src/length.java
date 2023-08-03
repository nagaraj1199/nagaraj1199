
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
public class length 
{
    int a[]=new int[50];
    int b[]=new int[50];
    int c[]=new int[50];
    int n,s,t,i,j;
    void get()
    {
        System.out.println("ENTER THE LENGTH VALUE");
        Scanner s1=new Scanner(System.in);
        n=s1.nextInt();
        i=0;
        s=(i+(n/2));
        t=(i+1+(n/2));
        for(i=0;i<n;i++)
            a[i]=s1.nextInt();
        if(i%2==0)
        {
             System.out.println("b array");
            for(i=0;i<(n/2);i++)
            {b[i]=a[i];
             
              System.out.println(b[i]);
            } 
            System.out.println("c array");
            for(j=s;j<n;j++)
            {c[j]=a[j];
            
            System.out.println(c[j]);
            }}
        else
                {
                    
                 System.out.println("b array");
            for(i=0;i<(1+(n/2));i++)
            {b[i]=a[i];
             
              System.out.println(b[i]);
            } 
            System.out.println("c array");
            for(j=t;j<n;j++)
            {c[j]=a[j];
            
            System.out.println(c[j]);   
                }}
            
        
        
        
        
    }
    public static void main(String arg[])
    {
        length s2=new length();
        s2.get();
    }
    
    
}
