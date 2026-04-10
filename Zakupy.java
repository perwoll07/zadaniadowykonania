import java.util.ArrayList;

public class Zakupy {
    public static void main(String[] args) {

        // 1. Stwórz listę obiektów Produkt
        ArrayList<Produkt> listaZakupow = new ArrayList<>();

        // 2. Dodaj trzy produkty
        listaZakupow.add(new Produkt("Chleb", 4.50));
        listaZakupow.add(new Produkt("Masło", 8.20));
        listaZakupow.add(new Produkt("Mleko", 3.10));

        // 3. Wyświetl wszystkie produkty
        System.out.println("Lista zakupów:");
        for (Produkt p : listaZakupow) {
            p.wyswietl();
        }
    }
}

