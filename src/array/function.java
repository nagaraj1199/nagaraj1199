/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
 *
 * @author Raja
 */
public class function 
{
    int a[][]=new int[3][3];
    int i,j,even,odd,zero,positive,negative,k,l,m,n;
    void get()
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("value");
        for(i=0;i<3;i++)
        for(j=0;j<3;j++)
        a[i][j]=s1.nextInt();
        System.out.println("view");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print("\t"+a[i][j]);
            }
            System.out.print("\n");
        }
        even=0;
        odd=0;
        positive=0;
        negative=0;
        zero=0;
        l=0;
        k=0;
        m=0;
        n=0;
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
        
        if(a[i][j]%2==0)
        {
            k=k+a[i][j];
            even++; 
        }
        if(a[i][j]%2==1)
        {
            l=l+a[i][j];
            odd++;  
        }
        if(a[i][j]>0)
        {
            m=m+a[i][j];
            positive++;  
        }
        if(a[i][j]<0)
        {
            n=n+a[i][j];
            negative++;  
        }
        if(a[i][j]==0)
        {
              
            zero++;  
        }
        
        }
        }
        System.out.println("even="+even);
        System.out.println("0dd="+odd);
        System.out.println("add even="+k);
        System.out.println("add odd="+l);
        System.out.println("positive="+positive);
        System.out.println("negative="+negative);
        System.out.println("add positive="+m);
        System.out.println("add negative="+n);
        System.out.println("zero="+zero);
        
    }
    public static void main(String arg[])
    {
        function s2=new function();
        s2.get();
    }
}
