
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
public class age 
{
    int a;
    void get()
    {
    Scanner S1=new Scanner(System.in);
    a = S1.nextInt();
    if(a>18)
    {
        System.out.println("major");
    }
    else
    {
        System.out.println("minor");
    }
    }        
    public static void main(String arg[])
    {
        age S2=new age();
        S2.get ();
    }
}

