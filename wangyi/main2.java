package wangyi;

import java.util.Scanner;

/**
 * Created by wt on 2017/8/12.
 */
public class main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

            int num = in.nextInt();
            int num1[] = new int[num];
            for(int i = 0;i< num;i++)
                num1[i] = in.nextInt();

            if(num % 2 ==1){
                System.out.print(num1[num-1]);
                for(int j = num-3;j>=0;j -= 2)
                    System.out.print(" "+num1[j]);
                for(int k = 1;k<num;k += 2)
                    System.out.print(" "+num1[k]);
            }

            if(num % 2 ==0){
                System.out.print(num1[num-1]);
                for(int j = num-3;j>=0;j -= 2)
                    System.out.print(" "+num1[j]);
                for(int k = 0;k<num;k += 2)
                    System.out.print(" "+num1[k]);
            }

        }


}
