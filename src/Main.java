import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

       double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.0, toplam, armutKilo, elmaKilo, domatesKilo, muzKilo, patlicanKilo;

       Scanner input = new Scanner(System.in);

       System.out.print("Armuttan kaç kilo aldınız? : ");
       armutKilo = input.nextDouble();

        System.out.print("Elmadan kaç kilo aldınız? : ");
        elmaKilo = input.nextDouble();

        System.out.print("Domatesten kaç kilo aldınız? : ");
        domatesKilo = input.nextDouble();

        System.out.print("Muzdan kaç kilo aldınız? : ");
        muzKilo = input.nextDouble();

        System.out.print("Patlıcandan kaç kilo aldınız? : ");
        patlicanKilo = input.nextDouble();

        toplam = (armut * armutKilo) + (elma * elmaKilo) + (patlican * patlicanKilo) + (domates * domatesKilo) + (muz * muzKilo);

        System.out.print("Ödenecek toplam tutar = " + toplam + " tl");







    }
}