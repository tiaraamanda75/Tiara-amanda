
package tiara.amanda;

import java.util.Scanner;

public class TiaraAmanda {

    
    public static void main(String[] args) {
        System.out.println("Tiara amanda");
        System.out.println("2209010075");
        System.out.println("Operator Penugasan23");
        System.out.println("====================");
        Scanner userInput = new Scanner (System.in);
        System.out.println("Gunakan angka untuk memilih opsi");
        System.out.println("a. Penambahan");
        System.out.println("b. Pengurangan");
        System.out.println("c. Pengkalian");
        System.out.println("d. Pembagian");
        System.out.println("e. Sisa bagi");
        
        System.out.print("input:");
        int input = userInput.nextInt();
        
    if (input == 1){
        System.out.println(" Penambahan ");
        System.out.println("Masukan angka awal");
        int nilai2 = userInput.nextInt();
        System.out.println("Masukan angka akhir");
        int nilai3 = userInput.nextInt();
        
        int Hasil = nilai2+nilai3;
        System.out.println("Hasilnya adalah:" + Hasil);
    }   else{
        System.out.println("masukan nilai yang benar");
    }
    
    
    if (input == 2){
        System.out.println(" Pengurangan ");
        System.out.println("Masukan angka awal");
        int nilai2 = userInput.nextInt();
        System.out.println("Masukan angka akhir");
        int nilai3 = userInput.nextInt();
        
        int Hasil = nilai2-nilai3;
        System.out.println("Hasilnya adalah:" + Hasil);
    }
        
    if (input == 3){
        System.out.println(" Perkalian ");
        System.out.println("Masukan angka awal");
        int nilai2 = userInput.nextInt();
        System.out.println("Masukan angka akhir");
        int nilai3 = userInput.nextInt();
        
        int Hasil = nilai2*nilai3;
        System.out.println("Hasilnya adalah:" + Hasil);
    }
    
    if (input == 4){
        System.out.println(" Pembagian ");
        System.out.println("Masukan angka awal");
        int nilai2 = userInput.nextInt();
        System.out.println("Masukan angka akhir");
        int nilai3 = userInput.nextInt();
        
        int Hasil = nilai2/nilai3;
        System.out.println("Hasilnya adalah:" + Hasil);
    
        
    }
    if (input == 5){
        System.out.println(" Sisa bagi ");
        System.out.println("Masukan angka awal");
        int nilai2 = userInput.nextInt();
        System.out.println("Masukan angka akhir");
        int nilai3 = userInput.nextInt();
        
        int Hasil = nilai2%nilai3;
        System.out.println("Hasilnya adalah:" + Hasil);
    }
    
    
    
    
    
        System.out.println("Operator Pembanding");
        System.out.println("=============");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka awal: ");
        int angka2 = scanner.nextInt();

        System.out.print("Masukkan angka akhir: ");
        int angka3 = scanner.nextInt();

        
        boolean Lebih_besar = (angka2 > angka3);
        boolean Lebih_kecil = (angka2 < angka3);
        boolean Sama_dengan = (angka2 == angka3);
        boolean Tidak_sama_dengan = (angka2 != angka3);
        boolean Lebih_besar_sama_dengan = (angka2 >= angka3);
        boolean LEbih_kecil_sama_dengan = (angka2 <= angka3);
        

        
        System.out.println(angka2 + " > " + angka3 + " adalah " + Lebih_besar);
        System.out.println(angka2 + " < " + angka3 + " adalah " + Lebih_kecil);
        System.out.println(angka2 + " == " + angka3 + " adalah " + Sama_dengan);
        System.out.println(angka2 + " != " + angka3 + " adalah " + Tidak_sama_dengan);
        System.out.println(angka2 + " >= " + angka3 + " adalah " + Lebih_besar_sama_dengan);
        System.out.println(angka2 + " <= " + angka3 + " adalah " + LEbih_kecil_sama_dengan);

        
        
 
        System.out.println("Operator Bitwise");
        System.out.println("===========");
        
        
        Scanner baru = new Scanner(System.in);

        System.out.print("Masukkan angka awal (bilangan bulat): ");
        int angka = scanner.nextInt();

        System.out.print("Masukkan angka akhir (bilangan bulat): ");
        int angkax = scanner.nextInt();

        
        int And = angka2 & angka3;
        int Or = angka2 | angka3;
        int Xor = angka2 ^ angka3;
        int Negatif_kembali = ~angka3;
        int Negatif_kembali2 = ~angka3;
        int Left_shift = angka2 << angka3;
        int Right_shift = angka2 >> angka3;
        int Right_shift_unsigned = angka2 >>> angka3;


        
        System.out.println(angka2 + " & " + angka3 + " = " + And);
        System.out.println(angka2 + " | " + angka3 + " = " + Or);
        System.out.println(angka2 + " ^ " + angka3 + " = " + Xor);
        System.out.println("~" + angka2 + " = " + Negatif_kembali);
        System.out.println("~" + angka3 + " = " + Negatif_kembali2);
        System.out.println(angka2 + " << " + angka3 + " = " + Left_shift);
        System.out.println(angka2 + " >> " + angka3 + " = " + Right_shift);
        System.out.println(angka2 + " >>> " + angka3 + " = " + Right_shift_unsigned);



        
        scanner.close();
        
    }
    
}
