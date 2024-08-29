package src.app;

public class Main {

    public static void main(String[] args) {

        DataProvider provider = new DataProvider();
        DataHandler dataHandler = new DataHandler();

        // Обработка массива данных наименований товаров
        String namesOutput = dataHandler.<String>handleData(provider.getProductNames());
        getOutput("Products: " + namesOutput);

        // Обработка массива данных о суммах продаж
        String salesOutput = dataHandler.<Double>handleData(provider.getSalesAmounts());
        getOutput("Sales, EUR: " + salesOutput);
    }

    // Вывод результата работы программы
    private static void getOutput(String output) {
        System.out.println(output);
    }
}
