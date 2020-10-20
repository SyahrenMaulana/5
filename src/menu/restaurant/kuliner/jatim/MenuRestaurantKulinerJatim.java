/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu.restaurant.kuliner.jatim;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class MenuRestaurantKulinerJatim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [] menu = {"Gurami Asam Manis", "Udang Goreng Tepung", "Udang Rica-Rica", "Cumi Asam Manis"};
        int [] harga = {45000, 30000, 15000, 25000, 40000};
        
        System.out.println("Selamat Datang di Kuliner Seafood Jatim");
        System.out.println("List Menu");
        
        //perulangan
        for (int i = 0; i < menu. length; i++){
            System.out.println(i+"."+menu[i]+" => "+harga[i]);
        }
        System.out.println("**********");
        //scanner
        System.out.println("Silahkan Masukan Menu yang dipilih : ");
        
        Scanner input = new Scanner(System.in);
        
        int pilihan = input.nextInt();
        
        System.out.println("Input pilihan : "+menu[pilihan]);
        
        //percabangan
        System.out.println("Silahkan Masukan Uang anda");
        
        int uang = input.nextInt();
        
        if (uang > harga[pilihan]){
            System.out.println("Kembalian :"+(uang - harga[pilihan]));            
        }else if (uang == harga[pilihan]){
            System.out.println("Uang Anda Sesuai Harga Maka Tunggu di Meja dan Makanan Akan di antar oleh Pelayan");            
        }else{
            System.out.println("Uang Anda Kurang "+(harga[pilihan] - uang));
      
    }
    
}
