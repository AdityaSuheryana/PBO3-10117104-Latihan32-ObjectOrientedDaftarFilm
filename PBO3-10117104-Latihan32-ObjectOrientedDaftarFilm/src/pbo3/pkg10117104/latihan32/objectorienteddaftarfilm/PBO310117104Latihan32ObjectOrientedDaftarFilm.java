/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117104.latihan32.objectorienteddaftarfilm;

/**
 *
 * @author
 * Nama : Aditya Suheryana
 * Nim : 10117104
 * Kelas : IF-3/PBO3
 * Deskripsi Program : Membuat program menampilkan rincian film berbasis object
 * 
 */
public class PBO310117104Latihan32ObjectOrientedDaftarFilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("====Daftar Film Sedang Tayang======");
        
        Film film1 = new Film();
        film1.nowPlaying("Venom","Action, Horrror, Scifi",8.5,120);
        film1.nowPlaying("Small Foot","Animation",9.0,96);
        film1.nowPlaying("Crazy Rich Asian","Comedy",7.8,119);
        film1.nowPlaying("Asih","Horrror",6.0,100);
    }
    
}
