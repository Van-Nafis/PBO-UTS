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
public class Kota {    
    
    int Jrk;
    int Jmlh;
    double Kg = 1.2;
    
    void Data(){        
        System.out.println("Jarak " + Jrk + " Km");
        System.out.println("Jumlah pasokan " + Jmlh + " Buah");        
    }  
    
    void Kg(){
        System.out.println("Berat pasokan dalam Kg : " + Jmlh*Kg);
    }
    
    
    
}
