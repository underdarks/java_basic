package basic;

public class Animal {

    public int getAge(){
        System.out.println("getAge");
        return 0;
//        return age+1;
    }

    public Animal() {
        System.out.println("Animal 생성자 호출");
    }

    public void move(){
        System.out.println("움직입니다");
    }

    protected void speak(){
        System.out.println("말합니다");
    }

}
