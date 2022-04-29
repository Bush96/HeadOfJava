public class toyKy {
    public static void main(String[] args) {
        Person son = new Person();
        son.setAge(14);
        son.setName("Makar");

    }
}

class Person {
    private int age;
    private String name;

    public void setName(String userName) {
        if (userName.isEmpty()) {
            System.out.println("ВВеди имя");
        } else if (userName == "Makar"){
            System.out.println("really?");
        } else
        name = userName;
    }

    public String getName() {
        return name;
    }

    public void setAge(int userAge) {
        if(userAge<=0){
            System.out.println("неправильно");}else
        age = userAge;
    }

    public int getAge() {
        return age;
    }
}