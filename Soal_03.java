package logically_03;

import java.util.Scanner;
public class Logically_03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,i,total;
        total = 0;
        
        System.out.print("Masukkan variabel yang di inginkan : ");
        n = input.nextInt();
        
        for(i=1; i<=n; i++){
            total = total + i;
        }
        
        System.out.print("Hasil Penjumlahan : " + total);
        
        
    }
    
}
