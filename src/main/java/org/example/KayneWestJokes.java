package org.example;


import java.util.Scanner;

public class KayneWestJokes {



    public static void main(String[] args) {

        //Napisz program, który wykorzysta API Kanye Rest https://kanye.rest/ by każdorazowo zaproponować nową perełkę mądrości od Kanye Westa.
        // Program powinien być obsługiwany z poziomu konsoli i obsługiwać komendę "next" by wywołać następny cytat. Program nie potrzebuje oprawy graficznej.
        // Zwróć uwagę na poprawną architekturę aplikacji oraz na czystość kodu.
        //Dla chętnych, za dodatkowe punkty: dodaj zapisywanie cytatów w pamięci, by upewnić się, że każdy kolejny cytat jest nowy.

        Scanner scan=new Scanner(System.in);
        UserInterface ui=new UserInterface(scan);
        ui.start();

    }
}