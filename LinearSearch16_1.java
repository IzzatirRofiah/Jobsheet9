package Jobsheet9;
import java.util.Scanner;
   
class LinearSearch16_1 {
  public static void main(String args[]){  
    Scanner input16 = new Scanner(System.in);
   
    int [] nilaiKey = new int [10];
        int jmlKey = 0;
        int hasil = 0;
        int cari = 0;
        

        System.out.print("Masukkan jumlah elemen array : ");
        jmlKey = input16.nextInt();

        for (int i = 0; i < jmlKey; i++) {
            System.out.print("Masukkan elemen array ke-"+(i+1)+" : ");
            nilaiKey[i] = input16.nextInt();
        }

        System.out.print("Masukkan key yang ingin dicari : ");
        cari = input16.nextInt();
        for (int i = 0; i < jmlKey; i++){
            if (nilaiKey[i] == cari){
                hasil = i;
                System.out.println("Key ada di posisi ke- " +i);
                break;
            }
        }

  }
}