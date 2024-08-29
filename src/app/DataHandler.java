package src.app;

// Обработка входных данных разных типов
public class DataHandler {

    // Обобщенный нестатический метод, который принимает массив обобщенного типа
    // и возвращает String значение обработанного массива
    public <T> String handleData(T[] items) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        // Цикл обработки массива обобщенного типа
        for (T item : items) {
            count++;
            sb.append(String.format("(%d) %s ", count, item.toString()));
        }
        return sb.toString().trim();
    }
}
