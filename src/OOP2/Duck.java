package OOP2;

//오리
//청둥오리, 하얀색오리, 노란색오리, 기타 등등..
//오리 먼저 추상화해서 어떤 오리를 구체화 시키더라도 저희가 선언한 기능들을 재사용하고 싶습니다.

//추상화 2가지
//추상클래스, 인터페이스
public interface Duck {
    //특징
    //색깔, 크기, 이름

    //상수화(고정값)
    int size=10; //초기화
    String color="";

    String name="";

    //기능
    //꽥꽥(quack), 수영(swim), 날기(fly)

    //추상 메서드
    void quackquack();


    //공통 메서드(디폴트 메서드)
    default void swim(){
        System.out.println("오리는 수영을 합니다");
    }

    default void fly(){
        System.out.println("size = " + size);
        System.out.println("color = " + color);
        System.out.println("name = " + name);

        System.out.println("오리가 날아요~");
    }

}
