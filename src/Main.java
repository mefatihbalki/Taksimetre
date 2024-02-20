import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km;
        Double perKm = 2.20, total= 10.0;

        //Kullanıcıdan Alınan Değer
        Scanner input = new Scanner(System.in);
        System.out.print("Gidilen Yolu Giriniz : ");
        km = input.nextInt();
//Toplam tutar
        total = total + (km * perKm);
//20 Tl altında çıkacak ücret
        total = (total <20) ? 20 : total;
        System.out.print("Ödenecek Tutar : "+total);
    }
}