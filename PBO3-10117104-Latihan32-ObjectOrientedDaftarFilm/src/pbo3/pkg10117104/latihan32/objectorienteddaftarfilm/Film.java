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
public class Film {
    
    public String filmName;
    public String filmGenre;
    public Double filmRating;
    public int filmDuration;
    
    
    public void nowPlaying(String filmName, String filmGenre, 
            Double filmRating,int filmDuration){
    
    System.out.println("");    
    System.out.println("Judul Film : "+filmName);
    System.out.println("Genre Film : "+filmGenre);
    System.out.println("Rating Film : "+filmRating);
    System.out.println("Duration Film : "+filmDuration+" Menit");
        
    }
}
