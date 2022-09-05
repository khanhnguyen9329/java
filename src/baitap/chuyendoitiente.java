package baitap;

import java.util.Scanner;

public class chuyendoitiente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double USD ;
        System.out.print("Số lượng USD :");
        USD = sc.nextDouble();

        double Result = USD * 23000;
        System.out.println("VND ="+ Result);


    }
}
