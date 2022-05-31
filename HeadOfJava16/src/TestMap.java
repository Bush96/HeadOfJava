import java.util.HashMap;

public class TestMap {
    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<>();   //Нужны два типовых параметра
        scores.put("Yn", 42);  //один ключ, второй значение
        scores.put("Re", 12);

        System.out.println(scores);
        System.out.println(scores.get("Yn"));   //метод гет принимает ключ и возвращает значение. Вывод представляется в виде пар ключ=значение
    }
}
