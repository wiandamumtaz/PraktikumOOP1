
package ooppraktikum1;

import java.util.Scanner;

public class Main {
    Scanner input=new Scanner(System.in);
        System.out.println("Pilihan");
        System.out.println("1.Menghitung Lingkaran");
        System.out.println("2.Menghitung Persegi");
        System.out.print("Masukkan pilihan :");
        int pilihan = input.nextInt();
        
        switch (pilihan){
            case 1:
                lingkaran hitung = new lingkaran();
                hitung.hitunglingkaran();
                break;
            case 2:
                persegi Hitung = new persegi();
                Hitung.hitungpersegi();
                break;
}
    
}
