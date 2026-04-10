class Ksiazka {
 String tytul;
 String autor;
 // 1. Uzupełnij konstruktor
 public Ksiazka(String tytul, String autor) {
 this.tytul = tytul;
 this.autor = autor;
 }
 void wyswietl() {
 System.out.println("Książka: " + tytul + " - " + autor);
 }
}

