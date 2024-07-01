package org.example;

public class BolmeIslemi {
    public double bol(double bolunen, double bolen) {
        if (bolen == 0) {
            throw new SifiraBol("Sıfıra bölme işlemi hatası");
        }
        return  bolunen / bolen;
    }






}
