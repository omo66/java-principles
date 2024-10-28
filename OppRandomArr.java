package oop.sec17;

public class OppRandomArr {

    public static void main(String[] args) {
        int min, max;
        int n = 10000;
        int arr[] = new int[n];

        min = 1000;
        max = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Randoms();
            sum += arr[i];
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }

        }
        double avg = sum / n;
        System.out.println("the min =" + min);
        System.out.println("the max =" + max);
        System.out.println("the avg = " + avg);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int Randoms() {
        int rad = (int) (Math.random() * 1000);
        return rad;
    }
}
