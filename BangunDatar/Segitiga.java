/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BangunDatar;

/**
 *
 * @author erisa
 */
public class Segitiga extends BangunDatar {
    float alas;
    float tinggi;
    float sisimiring;
    
    
    
    float luas(){
        float luas = (alas * tinggi)* 1/2;
        System.out.println("Luas Segitiga = "+luas);
        return luas;
        
    }
    float keliling(){
        float keliling = alas + tinggi + sisimiring;
        System.out.println("Keliling segitiga = "+keliling);
        return keliling;
    }
    
}
