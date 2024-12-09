package OOP1;

public class Swallow extends Bird{

    public Swallow() {
        this.name="비둘기";
    }

    @Override
    public void display() {
        System.out.println("name = " + name);
    }


    public static void main(String[] args) {
        //다형성을 지원
        //추상화된 상위 타입으로 클래스 생성시 타입을 선언햇을떄
        //실제 구체화한 상속받은 클래스는 어떤것이든 상관없고 그리고 기능도 변함없이 동작합니다.
        Bird bird = new Pigeon();

        bird.display();
        bird.quack();
    }
}
