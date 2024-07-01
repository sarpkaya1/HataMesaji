package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BolmeIslemi bolmeIslemi = new BolmeIslemi();
        try {
            double sonuc= bolmeIslemi.bol(10, 0);
            System.out.println("Sonuç: " + sonuc);
        } catch (SifiraBol e) {
            System.err.println(e.getMessage());
        }
    }
}