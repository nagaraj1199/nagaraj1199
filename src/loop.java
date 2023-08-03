
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
public class loop 
{
    int n;
    void get()
    {
        Scanner S1=new Scanner(System.in);
        n=S1.nextInt();
        
        while(n>=0)
        {
            
            if(n%2==1)
             System.out.println(n);
                n--;    
        }
    }
    public static void main(String arg[])
    {
        loop S2=new loop();
        S2.get();
    }
}
