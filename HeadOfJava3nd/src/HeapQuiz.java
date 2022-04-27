public class HeapQuiz {
    int id = 0;

    public static void main(String[] args) {
        int x = 0;
        HeapQuiz[] hq = new HeapQuiz[5];
        while (x < 3) {
            hq[x] = new HeapQuiz(); //выделяем в массиве первое место под абстрактный обект
            hq[x].id = x; //и даем этому обьекту свой номер
            x = x + 1; //пока цикл работаем сделующем элементу массива присваивается следующий номер
        }
        // hq[0] - id 0
        // hq[1] - id 1 и т.д.


    }
}
