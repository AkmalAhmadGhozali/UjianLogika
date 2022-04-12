package logically_002;

import java.util.Scanner;
public class Logically_002 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        
        System.out.print("Masukkan sebuah bilangan : ");
        a = scan.nextInt();
    
        if(a % 2 == 0){
            System.out.print("Bilangan " + a + " adalah bilangan genap. \n");
        }else {
            System.out.print("Bilangan " + a + " adalah bilangan ganjil. \n");
        }
        
    }
    
}
