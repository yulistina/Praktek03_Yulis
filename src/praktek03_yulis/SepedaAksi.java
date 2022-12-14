/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek03_yulis;

/**
 *
 * @author HP 14-an017AU
 */
public class SepedaAksi {
    public static void main(String[] args) {
        Sepeda s = new Sepeda();
        s.setMerk("Butterfly");
        s.setWarna("Merah");
        s.setHarga(1000);
        
        s.cetakInfo();
        
        System.out.print("Merknya \t:");
        System.out.println(s.getMerk());
        System.out.print("Warnanya \t:");
        System.out.println(s.getWarna());
        System.out.print("Harganya \t:");
        System.out.println(s.getHarga());
    }
}
