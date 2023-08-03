
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
public class fibanoci 
{
    int a,i,sum,j,k;
    void get()
    {
        System.out.println("enter the value");
        Scanner s1=new Scanner(System.in);
        a=s1.nextInt();
        j=0;
        k=1;
        i=1;
        
        
            while(i<=a)
            {
                System.out.println(j);
                sum=j+k;
                j=k;
                k=sum;
                i++;
                
            }
        }
    
    public static void main(String arg[])
    {
        fibanoci s2=new fibanoci();
        s2.get();
    }
    
}
