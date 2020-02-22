package org.example;

public class Zadanie1{

    double[] tab;
    int firstFree;

    public Zadanie1(int MaxSize) {
        tab = new double[MaxSize];
        firstFree = 0;
    }

    int getMaximumStackSize() {
        return tab.length;
    }


    boolean isEmpty() {
        if (firstFree == 0) {
            return true;
        } else
            return false;
    }

    int getSize() {
        return firstFree;
    }

    // Metoda dodająca na stos
    void Push(double E) throws ArrayIndexOutOfBoundsException {
        if (firstFree < tab.length) {
            tab[firstFree] = E;
            firstFree++;

        } else {
            throw new ArrayIndexOutOfBoundsException(
                    "Przepełnienie stosu, operacja nie powiodła się");
        }
    }

    double Pop() throws IndexOutOfBoundsException {
        if (firstFree <= 0) {
            throw new IndexOutOfBoundsException(
                    "Stos jest pusty, operacja nie powiodła się");
        }

        double temp = tab[firstFree - 1];
        firstFree--;
        return temp;
    }

    void display() throws IndexOutOfBoundsException {
        if (firstFree == 0) {
            throw new IndexOutOfBoundsException(
                    "Stos jest pusty, operacja nie powiodła się");
        }

        int temp = firstFree - 1;
        do {
            System.out.println(tab[temp]);
            temp--;
        } while (temp > -1);

    }

    void clear() {
        for (int i = 0; i < firstFree; i++) {
            tab[i] = 0.0;

        }

        firstFree = 0;
    }

}


