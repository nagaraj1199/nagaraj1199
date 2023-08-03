
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
public class even 
{
    int a;
    void get()
    {
        Scanner S1 =new Scanner(System.in);
        a=S1.nextInt();
        if(a%2==0)
        {
            System.out.println("even number");
        }
        else
        {
            System.out.println("odd number");
        }
    }
    public static void main (String arg[])
    {
        even S2=new even();
        S2.get();
    }
    
}
