package basic;


//객체 + 지향(방법론)
// => 왜배워야하나요?
// -> 당신이 코드를 잘 설계하고 유연하게 대응할 수 있게 코드를 구성하고 싶다면
// -> 1900년대부터 저희의 선배님들이 어떻게하면 코드를 잘 설계하고 유연하게 대응할 수 있을까?
// -> 객체지향(선배님들의 팁)
//객체(=사물, 세상에 존재하는 모든것들)

//객체(클래스)는 특징과 기능을 구현됩니다.
//추상화(규격, 붕어빵틀)
public class Car {
    //특징(멤버변수, 필드)
    //바퀴, 핸들, 엔진, 속도
    private String handle;
    private String engine;

    public int speed;

    //기능(메서드, 함수)
    //핸들 움직이기, 엑셀 밟기, 브레이크 밟기, 와이퍼 움직이기
    public void handleMove(){
        this.engine="람보르기니 엔진";
        System.out.println("핸들이 움직입니다");
    }
    public void brakePress(){
        System.out.println("브레이크를 밟습니다");
    }

    //접근제한자 리턴형자료형 함수(기능)명(){
    //    함수가하는일1....
    //    함수가하는일2..
    // }
    public String getEngineName(){
        //this = 객체(클래스) 자기자신(myself)
        return this.engine;
    }


    public static void main(String[] args) {
        //붕어빵틀에서 붕어빵을 만드는 과정(구체화)
        //객체 변수명 = new 객체();
        Car myNewCar = new Car();

        //변수명.기능명
        myNewCar.handleMove();
        myNewCar.brakePress();
        myNewCar.speed=10;

        String engineName = myNewCar.getEngineName();
        System.out.println("engineName = " + engineName);
    }
}
