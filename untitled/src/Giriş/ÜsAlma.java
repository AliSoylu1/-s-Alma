package Giriş;

import java.util.Scanner;

public class ÜsAlma {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n,k;
        System.out.println("Üssü alınacak sayı: ");
        n = input.nextInt();
        System.out.println("Kuvvet miktarı: ");
        k = input.nextInt();
        int total = 1;
        for (int i = 1; i <= k ; i++){
            total *= n;

        }System.out.println("Sonuç: " + total);






    }
}
