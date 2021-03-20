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
public class RPL extends Mapel{
    public String pemograman;
    public String DDG;
    public String siskomdig;
    
    public RPL (String nama, int kelas,String keahlian, String bi, String mtk, String bing, String pemograman, String DDG, String siskomdig){
        
    
    
    super (nama,kelas,keahlian,bi,mtk,bing);
        this.pemograman = pemograman;
        this.DDG = DDG;
        this.siskomdig = siskomdig;
    
    }
    public void info(){
        super.info();
        System.out.println("-------Mata Pelajaran Keahlian RPL-------");
        System.out.println("4. Produktif RPL        : "+pemograman);
        System.out.println("5. Dasar Desain Grafis  :  "+ DDG);
        System.out.println("6. SISKOMDIG            :  "+siskomdig);
        
    }
}
