package basic;

public class Man extends Person{

    private String job;

    public Man(String name, int age, String job) {
        //상속을 해주는 클래스(상위 클래스)의 생성자를 호출합니다.
        super(name, age);
        System.out.println("Man 클래스 생성자 함수 호출 시작");
        this.job = job;
        System.out.println("Man 클래스 생성자 함수 호출 끝");
    }

    public void shoot(){
        System.out.println("남자가 총을 쏩니다!");
    }

    public static void main(String[] args) {

        //클래스명 변수명 = new 클래스명
        Man man = new Man("홍길동2",30,"개발자");
        man.run();

        //신기하죠
        Animal ani = new Man("홍길동3",30,"개발자");
        Person p =new Man("홍길동3",30,"개발자");
        p.name="d";


//        ani.shoot();
//        ani.move();




        //Person p = new Man("홍길동4",30,"개발자");
//        Man m2 = new Person("a",1);




    }


}
