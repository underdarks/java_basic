package basic;

public class Person extends Animal {

    protected String name;
    private int age;

    //생성자 함수
    //public 클래스명() {
    //
    //}
    public Person(String name, int age) {
        System.out.println("Person 생성자호출2 시작");
        this.name = name;
        this.age = age;
        System.out.println("Person 생성자호출2 끝");
    }

    //객체를 생성할떄는 생성자 함수를 호출합니다.
    //코드로 선언하지않으면 디폴트(기본)으로 만들어집니다.
    public Person() {
        System.out.println("생성자호출 시작");
        System.out.println("생성자호출 끝");
    }

    public void run(){
        System.out.println("사람이 달립니다.");
    }

    public static void main(String[] args) {
        //구체화, 붕어빵 만드는거(객체 생성)
//        Person p = new Person();

        Person p2 = new Person("홍길동", 30);
        System.out.println("p2.name = " + p2.name);
        p2.move();

    }


}
