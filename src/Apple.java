/**
 * 클래스를 사용하는 이유
 *  - 특정한 물체를 표현하고 싶어서 사용하는겁니다.
 *
 * 사과 클래스
 *  - 사과의 특징들을 표현하고싶어요
 */
//붕어빵틀이라고 보시면 됩니다.
//public class 클래스명
public class Apple {

    //메서드(함수, y=f(x))


    /**
     * 사과의 맛을 알고싶어서 기능을 만든거에요
     *
     * 즉 여기서 String(문자열)을 리턴해준다. 반환해준다
     * @param sweet -> 함수의 파라미터(x) 값
     * @return -> 리턴해줄값
     */
    public String getAppleTaste(int sweet){
        System.out.println("sweet = " + sweet);
        return "사과는 맛잇어요";
    }

    /**
     * 당도의 값을 확인하고싶은 기능
     * 파라미터가 없는 함수
     *
     */

    //public 리턴할자료형 메서드명()
    public int getSweet(){
        return 5;
    }

    public static void main(String[] args) {
        //클래스명 변수명 = new 클래스명();
        //붕어빵(실체) 만드는거(밀가루 붇고, 팥 넣고)
        Apple c = new Apple();

        //메서드(기능)을 쓰고싶으면 클래스 변수명.메서드명()

        //사과의 당도 값을 가져와서 거기에 +1을 하고싶은 경우
        //함수가 리턴해주는 자료형 변수명 = c.메서드명()
        int sweet = c.getSweet();

        //저희가 하고싶은 추가적인 기능을 더하는겁니다.
        sweet++; //1을더해서

        System.out.println("sweet = " + sweet); //출력
    }


}
