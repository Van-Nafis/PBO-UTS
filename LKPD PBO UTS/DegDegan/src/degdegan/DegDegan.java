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

import java.util.Scanner;

public class DegDegan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        // Boyolali
        System.out.println("Masukan data kota Boyolali ");        
        // input jarak kota
        System.out.println("Masukan jarak kota : ");
        int jarakx= input.nextInt();
        // input pasokan
        System.out.println("Masukan jumlah pasokan : ");
        int jmlhx = input.nextInt();        
        
        Kota B = new Kota();        
        B.Jrk = jarakx;
        B.Jmlh = jmlhx;
        B.Data();
        B.Kg();        
        System.out.println("----------------------");
        
        // Salatiga
        System.out.println("Masukan data kota Salatiga ");        
        // input jarak kota
        System.out.println("Masukan jarak kota : ");
        int jaraky = input.nextInt();
        // input pasokan
        System.out.println("Masukan jumlah pasokan : ");
        int jmlhy = input.nextInt();
        
        Kota S = new Kota();        
        S.Jrk = jaraky;
        S.Jmlh = jmlhy;
        S.Data();
        S.Kg();        
        System.out.println("----------------------");
        
        // Klaten
        System.out.println("Masukan data kota Klaten ");        
        // input jarak kota
        System.out.println("Masukan jarak kota : ");
        int jarakz = input.nextInt();
        // input pasokan
        System.out.println("Masukan jumlah pasokan : ");
        int jmlhz = input.nextInt();
        
        Kota Kl = new Kota();        
        Kl.Jrk = jarakz;
        Kl.Jmlh = jmlhz;
        Kl.Data();
        Kl.Kg();        
        System.out.println("----------------------");
        
        // Kudus
        System.out.println("Masukan data kota Kudus ");        
        // input jarak kota
        System.out.println("Masukan jarak kota : ");
        int jarakv = input.nextInt();
        // input pasokan
        System.out.println("Masukan jumlah pasokan : ");
        int jmlhv = input.nextInt();
        
        Kota Ku = new Kota();        
        Ku.Jrk = jarakv;
        Ku.Jmlh = jmlhv;
        Ku.Data();
        Ku.Kg();        
        System.out.println("----------------------");
        
        SpekDegan x = new SpekDegan();
        x.Berat(B.Jmlh, S.Jmlh, Kl.Jmlh, Ku.Jmlh);
        x.HargaBeli(B.Jmlh, S.Jmlh, Kl.Jmlh, Ku.Jmlh);
        x.PasokanTotal(B.Jmlh, S.Jmlh, Kl.Jmlh, Ku.Jmlh);
        
        DeliveryServices y = new DeliveryServices();
        y.HargaJasa(jarakx, jaraky, jarakz, jarakv);
        
        Harga z = new Harga(x.HargaBeli, y.HargaJasaReturn(jarakx, jaraky, jarakz, jarakv), x.PasokanTotal(jmlhx, jmlhy, jmlhz, jmlhv));
        z.JualMinimal();
    }
    
}
