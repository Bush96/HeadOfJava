public class TestBox {
    Integer i;
    int j;

    public static void main(String[] args) {
        TestBox t = new TestBox();
        t.go();
    }

    public void go() {
        j = i;
        System.out.println(j);
        System.out.println(i);
    }
    //Не компилируется ибо программа видит Интеджер как обьект который ничем не является без какого либо значения
    //в i можно поставить значние  и все будет работать, а если в jчтоо поставить - все равно без еализации i ничего не сработает



}


