
package tubes_2_akhir;

import java.util.InputMismatchException;
import java.util.Scanner;


public class messy {
    static int pilihan1(){
        Scanner s = new Scanner(System.in);
        System.out.println("============KENDARAAN============ ");
        System.out.println("|\t1. Tambah Kota\t\t|");
        System.out.println("|\t2. Hapus Kota\t\t|");
        System.out.println("|\t3. Lihat Kota\t\t|");
        System.out.println("=================================");
        System.out.print("Pilihan : ");   
        while (true) {
            try {
                int pilihan = s.nextInt();
                System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━");
                return pilihan;
            } catch (InputMismatchException e) {
                System.out.println("Format input salah!");
                System.out.print("Pilihan menu utama > ");
                s.next();
            }
        }
                
}
    
    static int pilihan2(){
        Scanner s = new Scanner(System.in);
        System.out.println("============KENDARAAN============ ");
        System.out.println("|\t1. Tambah Kota\t\t|");
        System.out.println("|\t2. Hapus Kota\t\t|");
        System.out.println("|\t3. Lihat Kota\t\t|");
        System.out.println("=================================");
        System.out.print("Pilihan : ");
        while (true) {
            try {
                int pilihan = s.nextInt();
                System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━");
                return pilihan;
            } catch (InputMismatchException e) {
                System.out.println("Format input salah!");
                System.out.print("Pilihan menu utama > ");
                s.next();
            }
        }
                
}
    
    static int pilihan3(){
        Scanner s = new Scanner(System.in);
        System.out.println("============KENDARAAN============ ");
        System.out.println("|\t1. Tambah Kota\t\t|");
        System.out.println("|\t2. Hapus Kota\t\t|");
        System.out.println("|\t3. Lihat Kota\t\t|");
        System.out.println("=================================");
        System.out.print("Pilihan : ");
        while (true) {
            try {
                int pilihan = s.nextInt();
                System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━");
                return pilihan;
            } catch (InputMismatchException e) {
                System.out.println("Format input salah!");
                System.out.print("Pilihan menu utama > ");
                s.next();
            }
        }
    
    }
}
