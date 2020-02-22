package org.example;

public class Zadanie4 {

    double[] tab;
    int firstFree;

    public Zadanie4(int MaxSize) {
        tab = new double[MaxSize];
        firstFree = 0;
    }

    int getMaximumStackSize() {
        return tab.length;
    } // Metoda odwracająca kolejność elementów na stosie
    void reverse() {
        for (int i = 0; i < firstFree / 2; i++) {
            double temp = tab[i];
            tab[i] = tab[firstFree - 1 - i];
            tab[firstFree - 1 - i] = temp;

        }
    }

}
