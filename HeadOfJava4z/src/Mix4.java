public class Mix4 {
    int counter = 0;

    public static void main(String[] args) {
        int count = 0;
        Mix4[] m4a = new Mix4[20];
        int x = 0;
        while (x<19){
            m4a[x] = new Mix4();
            m4a[x].counter = m4a[x].counter + 1;     //запутывающая строка не имеющая отношения к заданию, так как метод в равнение будет возвращать всегда 1 либо нолькоунтеру первого элемента массива добавляем 1 единицу, в остальных каунтерах других элементов каунтер все еще 1, в 1ом же стало 2
            count = count + 1;                 //просто абстрактной переменной которая просто существует мы добавляем 1 единицу
            count = count + m4a[x].maybeNew(x);   //предыдущую полученную единицу мы добавляем к первому элементу массива которому методом передана единица, так как метод возвращает по условию только единицу либо ноль пок x <5
            x = x + 1;
        }
        System.out.println(count + " " + m4a[1].counter);
    }
    public int maybeNew(int index){
        if (index<1){
            Mix4 m4 = new Mix4();
            m4.counter = m4.counter + 1;
            return 1;
        }
        return 0;
    }
}
