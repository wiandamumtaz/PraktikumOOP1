package ooppraktikum1;

import java.util.Scanner;

public class persergi {
     void hitungpersegi(){
        Scanner input=new Scanner(System.in);
        int sisi,luas;
        
        System.out.print("Masukkan Sisi =");
        sisi=input.nextInt();
        
        luas=sisi*sisi;
        
        System.out.println("Luas Persegi ="+luas);
    }
    
}
