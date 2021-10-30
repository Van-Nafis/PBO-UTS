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
public class DeliveryServices {
    
    
    void HargaJasa(int x, int y, int z, int v){
        int jasa = (700000*(x/5)*2) + (700000*(y/5)*3) + (700000*(z/5)*4) + (700000*(v/5)*4);
        System.out.println("Harga jasa total Rp. " + jasa);
    }
    
    int HargaJasaReturn(int x, int y, int z, int v){
        int jasa = (700000*(x/5)*2) + (700000*(y/5)*3) + (700000*(z/5)*4) + (700000*(v/5)*4);
        return jasa;
    }
}
