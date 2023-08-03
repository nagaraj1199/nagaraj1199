
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
public class f2 
{
    int a,f;
    void get()
    {
        Scanner S1=new Scanner(System.in);
        System.out.println("Enter the value");
        a=S1.nextInt();
        for(f=1;a>=0;a--)
        {
            
            f=a*f;
            System.out.println("fact("+a+")="+f);
        }
    }
    public static void main(String arg[])
    {
        f2 S2=new f2();
        S2.get();
    }
    
}
    

