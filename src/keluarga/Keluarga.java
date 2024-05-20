/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package keluarga;

/**
 *
 * @author user
 */
public class Keluarga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person bapakAgus = new Parent("Agus", "Magelang", "06 Agustus 1970", "Pedagang", "Magelang, Jawa tengah", "08085700129599");
        Person ibuMae = new Parent("Maesaroh", "Magelang", "16 Mei 1972", "PNS", "Magelang, Jawa tengah", "087834651239");
        Person zidan = new Child("Muh Zidan Arrafi R", "Magelang", "14 Februari 2003", "Pelajar/Mahasiswa", "Magelang", "088806404207");
        Person rizky = new Child("Rizky Ahsan Alkafhi", "Magelang", "17 Agustus 2007", "-", "Magelang", "085865773651");

        // Mencetak informasi ke konsol
        System.out.println("Keluargaku Bapak Agus:");
        System.out.println("Bapak ");
        System.out.println(bapakAgus.getDetails());

        System.out.println("Seorang ibu ");
        System.out.println(ibuMae.getDetails());

        System.out.println("Mereka berdua memiliki 2 anak:");
        System.out.println("Anak pertama yaitu anak laki laki");
        System.out.println(zidan.getDetails());

        System.out.print("Dan dia memiliki adik laki-laki yang merupakan anak kedua bagi kedua orang tuanya\n");
        System.out.println(rizky.getDetails());
    }
}
    
    

