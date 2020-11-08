/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10117125.latihan39.nilaiterbesardanterkecil;
import java.util.Scanner;
/**
 *
 * @author
 * Nama     : Zulfi Ihzam Rahmat
 * Kelas    : IF-1
 * NIM      : 10117125
 * Deskripsi Program : program ini berisi program nilai terbesar dan terkecil
 * nilai mahasiswa 
 */
public class IF110117125Latihan39NilaiTerbesarDanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String namaPetugas;
        int jmlMhs;

        nilai hasil = new nilai();
        Scanner scanner = new Scanner(System.in);

        System.out.println("===Program nilai terbesar dan nilai terkceil===");
        System.out.print("Masukkan Nama Petugas : ");
        namaPetugas = scanner.nextLine();
        System.out.print("Masukkan Banyaknya Mahasiswa :  ");
        jmlMhs = scanner.nextInt();
        System.out.println();

        hasil.inputNilai(jmlMhs);
        System.out.println();
        hasil.tampilNilaiTerbesarTerkecil(jmlMhs);

        System.out.println("Nilai Terbesar : " + hasil.nilaiBesar);
        System.out.println("Nilai Terkecil : " + hasil.nilaiKecil);
        System.out.println();
        System.out.println("Nama Petugas : " + namaPetugas);
    }
    
}
