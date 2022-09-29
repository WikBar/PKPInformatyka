package org.example;

public class Main {



    public static void main(String[] args) {
//Mając tablicę int[] numbers, wypełnioną liczbami całkowitymi i posortowaną malejąco ( numbers[i] > numbers[i+1] ),
// sprawdź czy występuje w niej liczba int x. Metoda powinna zwracać wartość TRUE, jeśli dana liczba występuje oraz FALSE w przeciwnym wypadku.
// W rozwiązaniu zależy nam na jak najmniejszej złożoności obliczeniowej (priorytet) oraz pamięciowej.
// Podaj szacowaną złożoność obliczeniową oraz pamięciową. Poniżej sygnatura metody do napisania.
        //zlozonosc obliczneiowa O(log_2 n);
        //Zlozonosc pamieciowa O(1);
        int[] numbers = {50, 20, 10, 0, -10};
        int x = 0;
        Searching searching=new Searching(numbers,x);
    }
}