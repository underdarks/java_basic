package OOP1;

import basic.Animal;

public class Manress extends Human {

    @Override
    public int getAge() {
        return 0+10;
    }


    public static void main(String[] args) {
        Manress manress = new Manress();
        int age = manress.getAge();
        System.out.println("age = " + age);
    }

}
