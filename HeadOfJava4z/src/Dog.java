public class Dog {
    int size;
    String name;

    public void setSize(int s){
        size = s;
    }

    void bark(int numofBurks, String hum) {
        if (size > 60) {
            System.out.println("Gav Gav");}
        else if (size > 14) {
                System.out.println("Vuf Vuf");
            } else {
                System.out.println("Naf Naf");
            }
        }
    }
