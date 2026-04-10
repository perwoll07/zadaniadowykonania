class Produkt {
    String nazwa;
    double cena;

    // Konstruktor
    public Produkt(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }

    void wyswietl() {
        System.out.println(nazwa + " - " + cena + " zł");
    }
}
