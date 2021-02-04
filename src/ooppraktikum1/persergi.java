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
