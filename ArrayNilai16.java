package Jobsheet9;
import java.util.Scanner;
   
class ArrayNilai16 {
  public static void main(String args[]){  
    Scanner input16 = new Scanner(System.in);

    int [] nilaiAkhir = new int [10];

    for (int i = 0; i < 10; i++) {
        System.out.print("Masukkan nilai akhir ke-" + i + " : ");
        nilaiAkhir [i] = input16.nextInt();
    }
    for (int i = 0; i< 10; i++) {
        System.out.println("Nilai akhir ke-" + i + " adalah " + nilaiAkhir[i]);
    }
  }
}