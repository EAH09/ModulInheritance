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
public class TKJ extends Mapel {
    
    public String Jaringan;
    public String komputer;
    public String dasar;
    
    public TKJ (String nama, int kelas,String keahlian, String bi, String mtk, String bing, String Jaringan, String komputer, String dasar){
        
        super (nama,kelas,keahlian,bi,mtk,bing);
            this.Jaringan = Jaringan;
            this.komputer = komputer;
            this.dasar = dasar;
            
            
    }
    public void info(){
        super.info();
        System.out.println("-------Mata Pelajaran Keahlian TKJ-------");
        System.out.println("4. Produktif TKJ    : "+Jaringan);
        System.out.println("5. Pemograman Web   : "+komputer);
        System.out.println("6. Kode Jaringan    : "+dasar);
    }
    
}
