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
public class Multimedia extends Mapel{
    
    public String multimedia;
    public String editor;
    public String game;
    
    
    public Multimedia (String nama, int kelas,String keahlian, String bi, String mtk, String bing, String multimedia, String editor, String game){
        
        super (nama,kelas,keahlian,bi,mtk,bing);
                this.multimedia = multimedia;
                this.editor = editor;
                this.game = game;
                
    }
    public void info (){
        super.info();
        System.out.println("-------Mata Pelajaran Keahlian Multimedia-------");
        System.out.println("Produktif Multimedia : "+multimedia);
        System.out.println("Teknik Edior Video   : "+editor);
        System.out.println("Pengembangan Game    : "+game);
    }
    
}
