package OOP2;


//인터페이스 구현을 해볼게요
public class ChundungDuck implements Duck{

    public ChundungDuck() {

    }

    //추상메서드를 재정의
    @Override
    public void quackquack() {
        System.out.println("청둥오리가 꽥꽥거립니다");
    }

    public static void main(String[] args) {
        //다형성(구체화 의존하지 않고 추상화에 의존한다)
        Duck chDuck = new RedDuck();
        chDuck.fly();
        chDuck.swim();
        chDuck.quackquack();
    }
}

