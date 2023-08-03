
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
public class square 
{
    int a,s,i,j,k;
    void get()
    {
        System.out.println("enter the value");
        Scanner s1=new Scanner(System.in);
        a=s1.nextInt();
        j=0;
        k=1;
        for(i=1;i<=a;i++)
        {
            
            
            s=j+k;
            k=s;
            j++;
            System.out.println(s);
            
        }
    }
    public static void main(String arg[])
    {
        square s2=new square();
        s2.get();
    }
}
