
package finalproject;

import java.util.Random;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

public class FinalProject {

static Random rand = new Random();
public static ArrayList<String> test = new ArrayList<String>();
public static int songNum;
public static String[] noun = {"Blood","War","Sea","Son","Lord","Angels","Rider","Masters","Rage"};
public static String[] verb = {"Rage"};
public static String[] adjective = {"Holy","Electric","Eternal"};
    //dungeons
    //ride
    //flight
    //twilight
    //destiny
    //cry
    //fly
    public static void main(String[] args) {
        songNum = albumLength();
        createTime();
        System.out.println(songNum);
        System.out.println(test);
    }
    
    public static int albumLength()
    {
        int n1 = rand.nextInt(9) + 9;
        return n1;
    }

    public static void createTime()
    {
        //generates the initial potentially intro song length
        int m1 = rand.nextInt(4);
        int m2 = rand.nextInt(30) + 30;
        if(m1 < 2)
        {
            String putout = m1 + ":" + m2;
            test.add(putout);
        }
        else
        {
            String putout = m1 + ":" + m2;
            test.add(putout);
        }
        //generates the rest of the lengths, min of 3 minutes, max of 8
        for(int i = 1; i < songNum; i++)
        {
            int n1 = rand.nextInt(5) + 3;
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
