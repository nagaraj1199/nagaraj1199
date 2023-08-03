
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
public class amstrong 
{
    int a,r,tem,sum,i;
    void get()
    {
        System.out.println("Enter the value");
        Scanner s1=new Scanner(System.in);
        a=s1.nextInt();
        
        for(i=1;i<=a;i++)
        {
            tem=i;
            sum=0;
        while(tem!=0)
        {
            r=tem%10;
            sum=sum+(r*r*r);
            tem=tem/10;}
            
        {
        
        if(i==sum)
            System.out.println(i);}}
            
        
    }
    
    public static void main(String arg[])
    {
        amstrong s2=new amstrong();
        s2.get();
    }
    
}
