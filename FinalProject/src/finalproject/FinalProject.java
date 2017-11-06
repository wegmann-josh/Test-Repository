
package finalproject;

import java.util.Random;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

public class FinalProject {

public static ArrayList<String> test = new ArrayList<String>();
    
    public static void main(String[] args) {
        createTime();
        System.out.println(test);
    }
    
    public static void createTime()
    {
        Random rand = new Random();
        int m1 = rand.nextInt(4);
        int m2 = rand.nextInt(30) + 30;
        if(m1 < 2)
        {
            String putout = m1 + ":" + m2 + " (Intro)";
            test.add(putout);
        }
        else
        {
            String putout = m1 + ":" + m2;
            test.add(putout);
        }
        for(int i = 0; i < 7; i++)
        {
            int n1 = rand.nextInt(7) + 1;
            int n2 = rand.nextInt(60);
            if(n2 < 10)
            {
                String output = n1 + ":" + "0" + n2;    
                test.add(output);
            }
            else
            {
                String output = n1 + ":" + n2;
                test.add(output);
            }
        }
    }
}
