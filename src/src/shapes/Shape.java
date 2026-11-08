package shapes;

public abstract class Shape {

    public abstract double area();
}


//Klasy abstrakcyjnej (zamiast interfejs) lepiej użyć gdy chcemy zadeklarować zmienne, które
//nie będą statyczne, tylko klasy dziedziczące będą ich używać. Gdy chcemy stworzyć metody deafultowe
//dla klas (w interfejsie też można, ale lepiej w klasie abstrakcyjnej).