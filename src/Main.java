import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Degiskenleri tanimladik.
        int n1, n2, total, select;

        // Scanner yapisini projemize ekledik.
        Scanner input = new Scanner(System.in);

        // Isleme alinacak olan ilk ve ikinci sayilari kullanicidan alip ilgili degiskenlere atadik.
        System.out.print("Merhabalar.\nIslem yapmak istediginiz ilk sayiyi giriniz: ");
        n1 = input.nextInt();

        System.out.print("Islem yapmak istediginiz ikinci sayiyi giriniz: ");
        n2 = input.nextInt();

        // Kullanicidan hangi islemi gerceklestirmek istedigi verisini alip bunu select adli degiskenimize atadik.
        System.out.print("Toplama icin: 1\nCikarma icin : 2\nCarpma icin : 3\nBolme icin :4\n\nLutfen seciminizi iletiniz: ");
        select = input.nextInt();

        // Select degiskeni ile birlikte switch-case yapisinda kontroller saglanip gerekli islemler yapiliyor.
        switch (select) {
            case 1:
                total = n1 + n2;
                System.out.println("\nSonuc : " + total);
                break;

            case 2:
                total = n1 - n2;
                System.out.println("\nSonuc : " + total);
                break;

            case 3:
                total = n1 * n2;
                System.out.println("\nSonuc : " + total);
                break;

            case 4:
                if (n2 != 0) {
                    total = n1 / n2;
                    System.out.println("\nSonuc : " + total);
                } else {
                    System.out.println("0 a bolum belirsizliktir.");
                }
                break;

            default:
                System.out.println("\nHatali giris yapildi.");
                break;
        }

    }
}