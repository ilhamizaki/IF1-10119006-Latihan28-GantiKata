/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119006.latihan28.gantikata;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Ilham zaki
 * Kelas    : IF 1
 * NIM      : 10119006
 * Deskripsi Program : Menganti kata pada kalimat
 */
public class IF110119006Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        String kalimat, ganti, kata;
        
        System.out.println("=====Program Mengganti Kata=====");
        System.out.println();
        System.out.print("Masukkan Kalimat : ");
        kalimat = userInput.nextLine();
        System.out.print("Ganti Kata : ");
        ganti = userInput.nextLine();
        System.out.print("Menjadi Kata : ");
        kata = userInput.nextLine();
        
        System.out.println();
        System.out.println("=========Hasil Formatting=======");
        System.out.println("Kalimat Awal : " + kalimat);
        System.out.println("Kalimat baru : " + kalimat.replace(ganti, kata));
    }
    
}
