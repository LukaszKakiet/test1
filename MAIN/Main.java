package MAIN;

class Person {
    String imie;
    String nazwisko;
    String numerAlbumu;

    public Person(String imie, String nazwisko, String numerAlbumu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerAlbumu = numerAlbumu;
    }

    public void wyswietlInformacje() {
        System.out.println("Imię: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Numer albumu: " + numerAlbumu);
    }
}

public class Main {
    public static void main(String[] args) {
        Person osoba = new Person("Łukasz", "Kakiet", "123456");
        osoba.wyswietlInformacje();
    }
}