package logically_01;

import java.util.Scanner;
public class Logically_01 {

    public static void main(String[] args) {
       Scanner input = new Scanner( System.in );
        int angka1,angka2,angka3,terbesar;
        System.out.print("number 1 = ");angka1=input.nextInt();
        System.out.print("number 2 = ");angka2=input.nextInt();
        System.out.print("number 3 = ");angka3=input.nextInt();
        terbesar=(angka1>angka2)?angka1:angka2;
        terbesar=(terbesar>angka3)?terbesar:angka3;
        System.out.println("Nilai tertingginya adalah angka = "+terbesar);
        
    }
    
}
