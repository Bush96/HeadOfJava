
import java.util.ArrayList;

public class ArrayListMagnet {

    public static void main(String[] args) {              //Чему я удивился - все действия решили быть прописаны тут
        ArrayList<String> a = new ArrayList<String>();    //обьявляем Эррэйлист даем эми а
        a.add(0, "Ноль");                    //наполняем лист обьектами
        a.add(1, "Один");
        a.add(2, "Два");
        a.add(3, "Три");
        //
        printAl(a);                                       //вызываем метод в параметры которого передаем обектры Эррэйлиста

        a.remove(2);                                 //фишка Аррэйлиста, ремув удаляет выбранный элемент из него
        if (a.contains("Три")) {
            a.add("Четыре");
        }
        printAl(a);

        if (a.indexOf("Четыре") != 4) {                     //индекс ОФ возвращает запрос есть нужный обьект в массиве, возвращается булевое значение да нет
            a.add(4, "4.2");
        }
        printAl(a);

        if (a.contains("Два")) {                           //контэинс фишка Эррэйлиста, интересующаяся есть ли элемент в массиве но не просит вернуть реультат
            a.add("2.2");
        }
        printAl(a);

    }

    public static void printAl(ArrayList<String> al) {
        for (String element : al) {                               //для каждого элемента листа мы:
            System.out.print(element + " ");                      //перечисляем их в пользовательскуюстроку
        }
        System.out.println(" ");                                  //каждый новый вызов метода ишется с новой строки
    }
}










