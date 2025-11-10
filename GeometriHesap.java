/*
 * Ad Soyad: [Esmanur YILMAZ]
 * Ogrenci No: [250541033]
 * Tarih: [10.11.2025]
 * Aciklama: Gorev 1 - Geometrik Sekil Hesaplayici
 * 
 * Bu program temel geometrik sekillerin alan ve
 * cevre hesaplamalarini yapar.
 */

        
        import java.util.Scanner;

import static java.lang.Math.PI;
public class GeometriHesap {
    //önce metotları tanımlayalım
    public static double calculateSquareArea(double kenar) {
        return kenar*kenar;
    }
    public static double calculateSquarePerimeter(double kenar) {
        return 4*kenar;
    }
    public static double calculateRectangleArea(double genislik, double yukseklik) {
        return genislik * yukseklik;
    }
    public static double calculateRectanglePerimeter(double genislik,double yukseklik) {
        return (genislik+yukseklik)*2;
    }
    public static double calculateCircleArea(double r){
        return Math.pow(r,2)*Math.PI;
    }
    public static double calculateCirclePerimeter(double r){
        return (Math.PI*r)*2;
    }
    public static double calculateTriangleArea(double taban, double yukseklik1) {
        return (taban*yukseklik1)/2;
    }
    public static double calculateTrianglePerimeter(double a,double b, double c){
        return a+b+c;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== GEOMETRIK SEKIL HESAPLAYICI ===");
        System.out.println();
        // KARE bilgileri
        System.out.println("KARE:");
        System.out.print("Kenar uzunlugu (cm): ");
        double kenar = input.nextDouble();

        // DIKDORTGEN bilgileri
        System.out.println("\nDIKDORTGEN:");
        System.out.print("Kisa kenar (cm): ");
        double genislik = input.nextDouble();
        System.out.print("Uzun kenar (cm): ");
        double yukseklik = input.nextDouble();

        // DAIRE bilgileri
        System.out.println("\nDAIRE:");
        System.out.print("Yaricap (cm): ");
        double r = input.nextDouble();

        // UCGEN bilgileri
        System.out.println("\nUCGEN:");
        System.out.print("Taban (cm): ");
        double taban = input.nextDouble();
        System.out.print("Yukseklik (cm): ");
        double yukseklik1 = input.nextDouble();
        System.out.print("1. kenar (cm): ");
        double a = input.nextDouble();
        System.out.print("2. kenar (cm): ");
        double b = input.nextDouble();
        System.out.print("3. kenar (cm): ");
        double c = input.nextDouble();



        System.out.printf("Karenin Alanı: %.2f\n" , calculateSquareArea(kenar));
        System.out.printf("Karenin Cevresi: %.2f\n" , calculateSquarePerimeter(kenar));
        System.out.printf("Dikdörtgenin Alanı: %.2f\n" , calculateRectangleArea(genislik,yukseklik));
        System.out.printf("Dikdörtgenin Çevresi: %.2f\n" , calculateTriangleArea(genislik,yukseklik));
        System.out.printf("Dairenin Alanı: %.2f\n" , calculateCircleArea(r));
        System.out.printf("Dairenin Çevresi: %.2f\n" , calculateCirclePerimeter(r));
        System.out.printf("Üçgenin Alanı: %.2f\n" , calculateTriangleArea(yukseklik1, taban));
        System.out.printf("Üçgenin Çevresi: %.2f\n" , calculateTrianglePerimeter(a,b,c));
    }

}
        
        
        
        
        
        
        
        
        
        // SONUCLARI YAZDIR
        System.out.println("\n========================================");
        System.out.println("         HESAPLAMA SONUCLARI");
        System.out.println("========================================");
        
        System.out.printf("\nKARE (kenar: %.1f cm):\n", squareSide);
        // Alan ve cevre yazdir
        
        
        System.out.printf("\nDIKDORTGEN (%.1f x %.1f cm):\n", rectWidth, rectHeight);
        // Alan ve cevre yazdir
        
        
        System.out.printf("\nDAIRE (yaricap: %.1f cm):\n", radius);
        // Alan ve cevre yazdir
        
        
        System.out.printf("\nUCGEN (taban: %.1f, yukseklik: %.1f cm):\n", base, height);
        // Alan ve cevre yazdir
        
        
        System.out.println("========================================");
        
        input.close();
    }
}
