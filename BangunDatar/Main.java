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
public class Main {
    public static void main (String [] args){
        
        //membuat objek bangun datar 
        BangunDatar bangundatar = new BangunDatar();
        
        //membuat objek persegi dan mengisi nilai 
        Persegi persegi = new Persegi();
        persegi.sisi = 2;
        
        //Membuat objek persegi panjang dan mengisi nilai
        PersegiPanjang persegipanjang = new PersegiPanjang();
        persegipanjang.panjang = 10;
        persegipanjang.lebar = 5;
        
        //Membuat objek segitiga dan mengisi nilai
        Segitiga segitiga = new Segitiga();
        segitiga.alas = 10;
        segitiga.tinggi = 5;
        segitiga.sisimiring = 12;
        
        //membuat objek lingkaran dan mengisi nilai 
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 5;
   
        
        //Memanggil method luas dan keliling
        bangundatar.luas();
        bangundatar.keliling();
        
        persegi.luas();
        persegi.keliling();
        
        persegipanjang.luas();
        persegipanjang.keliling();
        
        segitiga.luas();
        segitiga.keliling();
        
        lingkaran.luas();
        lingkaran.keliling();
        
        
        
        
        
        
    }
    
}
