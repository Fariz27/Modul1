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
public class DataDiri {
    public static void main(String[] args){
     dataDiri();
     
     
    }
    static void dataDiri(){
        Scanner s = new Scanner(System.in);
        System.out.println("Masukan data : ");
        System.out.print("Nama \t\t\t: ");
        String nama = s.nextLine();
        System.out.print("NIS \t\t\t: ");
        int NIS = s.nextInt();
        System.out.print("Tempat lahir \t\t: ");
        String tempatLahir = s.next();
        System.out.print("Tanggal lahir \t\t: ");
        int tanggalLahir = s.nextInt();
        System.out.print("Bulan lahir \t\t: ");
        String bulan = s.next();
        System.out.print("Tahun lahir\t\t: ");
        int tahun = s.nextInt();
        System.out.print("Jenis Kelamin \t\t: ");
        String jk = s.next();
        System.out.print("Alamat di Malang \t: ");
        String alamat = s.next();
        System.out.print("Motto Hidup \t\t: ");
        String motto = s.next();
        System.out.println("");
        System.out.println("");
        System.out.println("Data yang disimpan :");
        System.out.println("");
        System.out.println("Nama\t\t\t: "+nama);
        System.out.println("NIS\t\t\t: "+NIS);
        System.out.println("Tempat tanggal Lahir\t: "+tempatLahir+" "+tanggalLahir+" "+bulan+" "+tahun);
        System.out.println("Alamat di Malang\t: "+alamat);
        System.out.println("Motto\t\t\t: "+motto);
        
    }
}
