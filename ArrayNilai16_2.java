package Jobsheet9;
import java.util.Scanner;
   
class ArrayNilai16_2 {
  public static void main(String args[]){  
    Scanner input16 = new Scanner(System.in);

     int [] nilaiAkhir = new int [10];

    for (int i = 0; i < nilaiAkhir.length; i++) {
        System.out.print("Masukkan nilai akhir ke-" + i + " : ");
        nilaiAkhir [i] = input16.nextInt();
    }
    for (int i = 0; i < nilaiAkhir.length; i++) {
        if (nilaiAkhir[i] > 70){
        System.out.println("Mahasiswa ke-" + i + " lulus! ");
        }
    }
  }
}