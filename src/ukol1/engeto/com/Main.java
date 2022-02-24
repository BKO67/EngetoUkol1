package ukol1.engeto.com;

import java.math.BigDecimal;


public class Main {

    // ukol c. 1
    public static void ukol1VypisHello() {
        System.out.println("Hello world");
    }
    // ukol c. 2
    public static void ukol2TextovaPromenna() {
        String uzivatel = "Karel";
        System.out.println(uzivatel);
    }
    // ukol c. 3
    public static void ukol3CiselnaPromenna() {
        int pocetLekci = 10;
        System.out.println(pocetLekci);
    }
    // ukol c. 4
    public static void ukol4PromennaDesetinneCislo() {
        double cena = 10.0;
        System.out.println(cena);
    }
    // ukol c. 5
    public static void ukol5PresnePricitani() {
        BigDecimal cena = BigDecimal.ZERO;
        for (int i = 0; i < 10; i++) {
            cena = cena.add(BigDecimal.valueOf(0.1));
        }
        System.out.println(cena);
    }
    // ukol c. 6
    public static void ukol6NastaveniHodnotyBigDecimal() {
        BigDecimal cena = BigDecimal.ZERO;
        cena = cena.add(BigDecimal.valueOf(0.1));
        System.out.println(cena);
    }
    // ukol c. 7
    public static void ukol7PromennaCisloASpojeniTextu() {
        int vykonMotoru = 120;
        System.out.println("Výkon Motoru je: "+vykonMotoru+" kW.");
    }
    // ukol c. 8
    public static void ukol8SpojeniTextu() {
        int velikostKosile = 37;
        System.out.println("Velikost košile je: " + velikostKosile + ".");
    }
    // ukol c. 9
   public static void ukol9ZapisMetody() {
       System.out.println("Metoda *skoro* bez chybičky!");
    }
    public static void main(String[] args) {
        System.out.println("Oprav chyby a spusť všechny metody!");
        System.out.println("Komentáře odstraníš klávesovou zkratkou <Ctrl>+</> ");
        ukol1VypisHello();
        ukol2TextovaPromenna();
        ukol3CiselnaPromenna();
        ukol4PromennaDesetinneCislo();
        ukol5PresnePricitani();
        ukol6NastaveniHodnotyBigDecimal();
        ukol7PromennaCisloASpojeniTextu();
        ukol8SpojeniTextu();
        ukol9ZapisMetody();
    }
}
