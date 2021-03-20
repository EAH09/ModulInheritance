/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prratikum1;

/**
 *
 * @author erisa
 */
public class Mapel {
    
    //Atributnya
    public String nama,keahlian;
    public int kelas;
    public String bi, mtk , bing;
    
    //konstruktor oke
    public Mapel(String nama, int kelas,String keahlian, String bi, String mtk, String bing){
        this.nama = nama;
        this.kelas = kelas;
        this.keahlian = keahlian;
        this.bi = bi;
        this.mtk = mtk;
        this.bing = bing;
        
    }
    public void info(){
        System.out.println("Nama : "+this.nama);
        System.out.println("Kelas : "+this.kelas);
        System.out.println("Keahlian : "+this.keahlian);
        System.out.println("---------------Mapel Utama---------------");
        System.out.println("1. B Indonesia : " +bi+ "3 Jam Pelajaran ");
        System.out.println("2. Matematika  : "+mtk + "4 Jam Pelajaran");
        System.out.println("3. B inggris   : "+bing + "3 Jam Pelajaran");
        
    }
            
    
}
