package com.example.lib;

public class hw5 {
    public static void main(String[] avrg) {
        java.util.Scanner scanner = new
                java.util.Scanner(System.in);

        System.out.println("input Hour1 :");
        int hu1 = scanner.nextInt();

        System.out.println("input Minute1 :");
        int min1 = scanner.nextInt();

        System.out.println("input Second1 :");
        int sec1 = scanner.nextInt();

        System.out.println("input Hour2 :");
        int hu2 = scanner.nextInt();

        System.out.println("input Minute2 :");
        int min2 = scanner.nextInt();

        System.out.println("input Second2 :");
        int sec2 = scanner.nextInt();

        int allsec1 = (hu1 * 3600) + (min1 * 60) + sec1;
        int allsec2 = (hu2 * 3600) + (min2 * 60) + sec2;

        System.out.println("Ans:" + Math.abs(allsec1 - allsec2));
    }
}
