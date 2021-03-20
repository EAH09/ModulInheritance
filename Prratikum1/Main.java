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
public class Main {
    public static void main (String [] args){
        
        //membuat objek RPL
        RPL rpl = new RPL ("Errisa Aura Hidayah",10,"RPL","","",""," 8 Jam Pelajaran","5 Jam Pelajaran","4 Jam Pelajaran");
        rpl.info();
        System.out.println("================================================");
        //membuat objek TKJ
        TKJ tkj = new TKJ ("Putri Bhalqis Felisa",10,"TKJ","","","","8 Jam Pelajaran","4 Jam Pelajaran","5 Jam Pelajaran");
        tkj.info();
        System.out.println("================================================");
        //membuat objek Multimedia
        Multimedia multi = new Multimedia("Dahayu Vira Guritna",10,"Multimedia","","","","9 Jam Pelajaran","3 Jam Pelajaran","4 Jam Pelajaran");
        multi.info();
    }
    
}
