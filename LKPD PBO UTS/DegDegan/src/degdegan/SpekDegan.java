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
public class SpekDegan {
    int HargaBeli = 8000;
    double Berat = 1.2;
    
    //menghitung berat total pasokan dalam Kg
    void Berat(int x, int y, int z,int v){
        double berat = Berat * (x + y + z + v);
        System.out.println("Berat total pasokan dalam Kg adalah " + berat + " Kg");
    }
    
    void Berat(double x, double y, double z,double v){
        double berat = Berat * (x + y + z + v);
        System.out.println("Berat total pasokan dalam Kg adalah " + berat + " Kg");
    }
    
    //menghitung harga total pasokan
    void HargaBeli(int x, int y, int z, int v){
        int beli = HargaBeli * (x + y + z + v);
        System.out.println("Harga beli total pasokan adalah Rp. " + beli);
    }
    
    void HargaBeli(double x, double y, double z, double v){
        double beli = HargaBeli * (x + y + z + v);
        System.out.println("Harga beli total pasokan adalah Rp. " + beli);
    }
    
    
    //membuat method pasokan total buah
    int PasokanTotal(int x, int y, int z, int v){
        int total = x + y + z + v;
        return total;
    }
    
    double PasokanTotal(double x, double y, double z, double v){
        double total = x + y + z + v;
        return total;
    }
}
