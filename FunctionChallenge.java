package FunctionBAul;

import java.util.Scanner;

public class FunctionChallenge {
    public static void jumlah(double a, double b) {
            double jumlah = a + b;
            System.out.print("Hasil Penjumlahan: " +jumlah+"\n");
        }
        public static void kurang(double a, double b) {
            double jumlah = a - b;
            System.out.print("Hasil Pengurangan: " +jumlah+"\n");
        }
        public static void kali(double a, double b) {
            double jumlah = a * b;
            System.out.print("Hasil Perkalian: " +jumlah+"\n");
        }
        public static void bagi(double a, double b) {
            double jumlah = a / b;
            System.out.print("Hasil Pembagian: " +jumlah +"\n");
        }
    
        public static void main(String[] args) {
            Scanner ja = new Scanner(System.in);
            System.out.print("Bilangan Pertama: ");
            double a = ja.nextDouble();
            System.out.print("Bilangan Kedua: ");
            double b = ja.nextDouble();
            System.out.println();
            ja.close();
    
            jumlah(a,b);
            kurang(a,b);
            kali(a,b);
            bagi(a,b);
        
    }

}
