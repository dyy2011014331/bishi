package wangyi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.next();

        int times[]= new int[26];
        for(int i = 0;i<times.length;i++)
            times[i] = 0;
        int count = 0;

        for(int j=0;j<str.length();j++){
            times[str.charAt(j)-'A']++;
        }

        for(int k=0;k<26;k++)
            if(times[k]!=0)
                count++;
        if(count == 3)
        System.out.println(0);
        if(count == 1)
            System.out.println(1);
        if(count == 2)
            System.out.println(2);
    }
}
