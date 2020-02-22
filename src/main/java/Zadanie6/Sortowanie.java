package Zadanie6;

public class Sortowanie {

    public int[] sortowanie(int[] wejscie) {

        for (int i = 1; i < wejscie.length; i++) {
            int liczba = wejscie[i];
            int j = i;

            while ((j > 0) && (wejscie[j - 1] > liczba)) {
                wejscie[j] = wejscie[j - 1];
                j--;
            }

            wejscie[j] = liczba;
        }
        return wejscie;
    }
}
