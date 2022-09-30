# PKPInformatyka

1.A. W jakim celu używa się klas abstrakcyjnych, a w jakim interfejsów?

- Klas abstrakcyjnych używa się do odwzorowania pewnej hierarchi w programie, to znaczy jeżeli klasa wyższa posiada cechy klas niższych lub mają one niewielkie modyfikacje.

- Pozwala to na łatwe zaimplementowanie dodatkowych cech/zachowań dla każdej klasy dziedziczącej po klasie abstrakcyjnej poprzez dodanie do niej dodatkowych metod.

Interfejsów używa się do:

- służą do tworzenia interfejsów funkcyjnych czyli posiadających jedną metodę, wykorzystuje się je to wyrażeń lambda używa się ich do wymuszenia zaimplemetowania metod określajacyh zachowanie danego obiektu. 
- W każdej klasie która dziedziczy interfejs jego metoda musi zostać nadpisana i może się ona różnić od tych samych metod w innych klasach implementujących ten sam interfejs. Używa się jej do określenia zachowania obiektu ale nie określa typu tego zachowania. Np. metoda w interfejsie zrobHalas() wykorzystana na obiektach klasy kot oraz pies będzie miała inne ciało metody przy tej samej nazwie metody i wykorzystaniu tego samego interfejsu.

=============================================================================================

1.B. Czym różni się tablica od listy liniowej?

Tablica:
- Wielkość tablicy jest zadeklarowana przy jej tworzeniu (statyczną) i niezmienną w dalszym działaniu programu
- szybsza od listy
- length do określenia długości tablicy
- możliwa wielowymiarowość


Lista liniowa:
- lista liniowa ma wielkość dynamiczną i nie trzeba definiować jej wielkości przy deklaracji może być powiększana kiedy jest taka potrzeba
- wolniejsza od tablicy
- nie przechowywuje typów prymitywnych (int,double,float,...etc.) metoda size() do określenia wielkosci tablicy
- zawsze jednowymiarowe
