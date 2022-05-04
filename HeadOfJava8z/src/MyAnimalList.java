public class MyAnimalList {
     Animal[] animals = new Animal[5];
     int x = 0;

    public void add(Animal a) {                 //Animal - тип передаваемого обьекта, а - сам обьект
        if (x < animals.length) {
            animals[x] = a;               //из мейн метода мы в этот метод параметром передадим обьек если захотим пока его длина меньше массива
            System.out.println("Animal добавлен в ячейку nextIndex " + x);
            x++;    //увеличиваем индекс для доступа к следующей ячейке       }
    }}



class Animal {

}

class Dog extends Animal {

}

class Cat extends Animal {

}

class AnimalTestDrive {
    public void main(String[] args) {
        MyAnimalList list = new MyAnimalList();
        Dog a = new Dog();
        Cat c = new Cat();
        Cat b = new Cat();
        list.add(a);
        list.add(c);
        list.add(b);
    }
}}

