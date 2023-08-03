
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
public class fact 
{
    int a,i,f;
    void get()
    {
        Scanner S1=new Scanner(System.in);
        System.out.println("Enter the value");
        a=S1.nextInt();
        f=1;
        for(i=1;i<=a;i++)
        {
            
            f=i*f;
            System.out.println("fact("+i+")="+f);
        }
    }
    public static void main(String arg[])
    {
        fact S2=new fact();
        S2.get();
    }
    
}
