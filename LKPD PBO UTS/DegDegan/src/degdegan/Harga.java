/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package degdegan;

/**
 *
 * @author Acer
 */
public class Harga {
    int HargaBeli;
    int Laba = 15000000;
    int HargaJasa;
    int PasokanTotal;
    
    
    Harga(int hargabeli, int hargajasa, int pasokan){
        HargaBeli = hargabeli;
        HargaJasa = hargajasa;
        PasokanTotal = pasokan;
    }
    
    void JualMinimal(){
        int minimal = (HargaBeli*PasokanTotal + HargaJasa + Laba) / PasokanTotal;
        System.out.println("Harga minimal penjualan adalah Rp. " + minimal);
    }
    
}
