package Jobsheet9;
import java.util.Scanner;
   
class ArrayRataNilai16_1 {
  public static void main(String args[]){  
    Scanner input16 = new Scanner(System.in);

    int[] nilaiMhs = new int [10];
    double total = 0;
    double rata2;
    int count = 0;

    for (int i = 0; i < nilaiMhs.length; i++) {
        System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : " );
        nilaiMhs[i] = input16.nextInt();
    }
    for (int i = 0; i < nilaiMhs.length; i++) {
        total += nilaiMhs[i];
        if (nilaiMhs[i] > 70){
            count++;
        }
    }
    rata2 = total/nilaiMhs.length;
    System.out.println ("Rata-rata nilai : "+ rata2);
    System.out.println ("Jumlah mahasiswa yang lulus adalah : " + count);
  }
}