import java.util.ArrayList;

public class DotCom {

    private ArrayList<String> locationCells;   //переменная экземпляра класса ДотКом  - Эррэй лист с ячейками описываюищими местоположение
    private String name;                       //переменная экземпляра класса ДотКом описывающая имя цели

    public void setLocationCells(ArrayList<String> loc) {             //сеттер который обновляет местоположение цели (случайный адрес который предоставляет ГэймХелпер

        locationCells = loc;
    }

    public void setName(String n){                         //Простой сеттер хранящий имена целей
        name = n;
    }

    public String checkYourself(String userInput) {   //аргумент принимающий ход игрока
        String result = "Miss";
        int index = locationCells.indexOf(userInput);  //проверяем содержится ли в массиве загаданная ячейка игрока, если ее нет то метод вернет -1
        if (index >= 0) {
            locationCells.remove(index);   //если индекст больше или равен нулю - значит ячейка точно нходится в массиве и мы ее удаляем

            if (locationCells.isEmpty()) {    //если список пустой = значит это поледнее попадание
                result = "Bikini Bottom";
            } else {
                result = "Get it";
            }
        }
        return result;
    }
}
