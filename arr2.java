//omar qaddora 202313052
package oop.sec17;

import java.util.Random;

public class arr2 {

    public static void main(String[] args) {
        Random d = new Random();
        double[] zz = new double[10000];
        double y = 0;
        double c = 0;
        double avg = 0;
        for (int i = 0; i <= 9999; i++) {
            zz[i] = d.nextInt();
            avg = avg + zz[i];
            if (c < zz[i]) {
                c = zz[i];
            }
            if (y > zz[i]) {
                y = zz[i];
            }

        }
        System.out.println("the max nuber is =" + c);
        System.out.println("the min nuber is =" + y);
        System.out.println("the avg =" + (avg / 10000));
        for (int i = 0; i <= 9999; i++) {
            System.out.println(zz[i]);
        }
    }

}
