/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119048.latihan62.livingthing;

/**
 *
 * @author SystemOs
 * Nama      : Mochammad Faishal
 * NIM       : 10119048
 * Kelas     : IF2
 * Deskripsi : Menampilkan Program Living Thing
 */
public class PBOIF210119048Latihan62LivingThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Human h = new Human();
        h.setNama("Rizki Adam Kurniawan");
        h.walk(h.getNama());
        h.breath(h.getNama());
        h.eat(h.getNama());
    }
}
