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
public class palindrome 
{
    int sum,r,tem,n;
    void get()
    {
        Scanner s1=new Scanner(System.in);
        n=s1.nextInt();
        sum=0;
        tem=n;
;        while(n>0)
        {
            
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
            
        }
        if(tem==sum)
        
           System.out.println("palindrome");
             
        
        else 
           System.out.println("not");
    }
    

public static void main(String arg[])
{
    palindrome s2=new palindrome();
    s2.get();
}

}
