package TutorialJava;

import java.util.Scanner;

public class Belajar {

    public static void main(String[] args) {
        // Menghitung Luas Persegi Panjang
        Scanner nilai = new Scanner(System.in);
        int Panjang, Lebar;
        System.out.print("Input Panjang : " );Panjang = nilai.nextInt();
        System.out.print("Input Lebar : " );Lebar =  nilai.nextInt();

        int Luas, Keliling;
        Luas = Panjang * Lebar;
        System.out.println("Input Luas : " + Luas);
        Keliling = 2*Panjang + 2*Lebar;
        System.out.println("Input Keliling : " + Keliling);

    }
}
