/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.*;

/**
 *
 * @author Raja
 */
public class name 
{
    public static void main(String arg[])
    {
        PriorityQueue<String> q=new PriorityQueue<>();
        q.add("siva");
        q.add("ishu");
        q.add("sri");
        q.add("raja");
        Iterator a=q.iterator();
        while(a.hasNext())
        {
            System.out.println(a.next());
        }
    }
    
}
