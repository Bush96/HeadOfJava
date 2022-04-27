public class Dog {
    String name;

    public static void main(String[] args) {
        Dog dog1 = new Dog();            //создаем обект дог и получаем к нму доступ
        dog1.name = "Барт";
        dog1.bark();

        Dog[] myDogs = new Dog[3];    //создаем массив типа дог

        myDogs[0] = new Dog();        //помещаем вмассив элементы
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        myDogs[0].name = "Фрэд";    //получаем доступ к обектам дог с помощью ссылок из массива
        myDogs[1].name = "Джордж";

        System.out.print("Имя последней собаки - ");
        System.out.println(myDogs[2].name);

        int x = 0;                      //пересчитываем собак(элементы массива)
        while (x < myDogs.length) {
            myDogs[x].bark();
            x = x + 1;
        }
    }

    public void bark() {
        System.out.println(name + " сказал Гав!");
    }

}
