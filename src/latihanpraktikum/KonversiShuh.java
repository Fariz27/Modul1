/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanpraktikum;
import java.util.Scanner;
/**
 *
 * @author Fariz
 */
public class KonversiShuh {
 public static void main(String[] args){
 Scanner s = new Scanner(System.in);
 int ulang =0;
 do{
     System.out.print("Masukan suhu dalam Celcius : ");
     double c=s.nextDouble();
     konversi(c);
     System.out.println("Ulangi lagi? (ya=1/tidak=0)");
     ulang = s.nextInt();
 }while(ulang==1);
}
 public static void konversi(double c){
     int pilih=0;
     double hasil=0;
     Scanner s = new Scanner(System.in);
     System.out.println("Pilih Konversi : \n1.Reamur \n2.Farenheit \n3.Kelvin");
     System.out.print("pilih : ");
     pilih=s.nextInt();
     switch(pilih){
         case 1:hasil=c/5*4;
                System.out.println("Hasilnya adalah : "+hasil);break;
         case 2:hasil=c/5*9+32;
                System.out.println("Hasilnya adalah : "+hasil);break;
         case 3:hasil=c+273;
                System.out.println("Hasilnya adalah : "+hasil);
     }if(pilih>3){
         System.out.println("Pilihan Salah");
     }if(pilih<1){
         System.out.println("Pilihan Salah");
     }
 }
}
