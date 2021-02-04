/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooppraktikum1;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class lingkaran {
    void hitunglingkaran(){
        Scanner input=new Scanner(System.in);
        double luas,phi=3.14; 
        int jarijari;
        
        System.out.print("Masukkan Jari-Jari =");
        jarijari=input.nextInt();
        
        luas=phi*jarijari*jarijari;
        
        System.out.println("Luas Lingkaran = "+luas);
    
    }
}
