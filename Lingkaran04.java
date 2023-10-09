package Jobsheet4;
import java.util.Scanner;

public class Lingkaran04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r;
        double keliling, luas, phi = 3.14;

        System.out.println("Masukkan jari-jari lingkaran: ");
        r = sc.nextInt();

        keliling = 2 * phi * r;
        luas = phi * r * r;

        System.out.println(keliling);
        System.out.println(luas);
        sc.close();
    }
}

/* Algoritma Lingkaran04

Deklarasi:
1. sc: scanner
2. r: int
3. phi = 3.14, keliling, luas: double

Deskripsi:
1. print “masukkan jari-jari lingkaran!”
2. read r
3. keliling = 2 * phi * r
4. luas = phi * r * r
5. print keliling
6. print luas */