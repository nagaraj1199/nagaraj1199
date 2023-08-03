
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
public class array 
{
    int sum,big, j,i,a[]=new int[5];
    void get()
    {
        System.out.println("enter the value");
        Scanner s1=new Scanner(System.in);
        for(i=0;i<5;i++)
            a[i]=s1.nextInt();
        System.out.println("value");
        
        for(i=0;i<5;i++)
        {
           for(j=i+1;j<5;j++) 
           {
           
               if(a[i]<a[j])
               {
                   a[i]=a[j];
                   big=a[j];
        
           System.out.println("big is"+big);
               } 
        }  
    }
    }
     public static void main(String arg[])
    {
        array s2=new array();
        s2.get();
    }
}
