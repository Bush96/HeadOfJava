public class Duck {
    private int size;
    private static int numOfCount = 0;        //статическая переменная одно и то же значение для всех переменных класса, т.е. не для одного обекта этого класа а для каждого

    public Duck() {
        numOfCount++;    //поместив статическую переменную в конструктор мы можем посчтитать соличество созданных обектов этого класса
    }

    public void setSize(int s) {
        size = s;
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        /*System.out.println("Размер утки "+ getSize());
        //не скомпилируется, так как статический метод не видит нестатические переменные!!!
         */
    }

}
