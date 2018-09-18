/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul1;
import java.util.Scanner;
/**
 *
 * @author Fariz
 */
public class BeaSiswa {
 public static void main (String[] args){
     Scanner masukan = new Scanner(System.in);
     System.out.println("Masukan nilai TPA:");
     int TPA = masukan.nextInt();
     System.out.println("Masukan nilai Bahasa Inggris:");
     int BahasaInggris = masukan.nextInt();
     if ((TPA>85)&&(BahasaInggris>80)){
         System.out.println("Siswa dapat beasiswa");
     }else
         System.out.println("Siswa tidak dapat beasiswa");
 }   
}
