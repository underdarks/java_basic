

//붕어빵 틀입니다.
public class Fish
{
    //붕어빵이 스스로 움직이는 기능(메서드)
    //public 리턴할자료형 메서드명 () {}  => 메서드 생성 규칙
    //클래스의 메서드 생성
    public int move() //호출된 함수
    {
        int x=10; //x 좌표
        int y=10; //y 좌표

        //좌표계산
        int result = x +y;
        return result;
    }
    
    //제가 어떤 값(함수 파라미터)을 넘기면 add라는 메서드에서 +10을 해서 리턴해주고싶어요
    //함수 파라미터는 자료형 변수명(택배 내용물)
    public int plus(int value) //value = 10
    {
        int result = value+10; //10 + 10
        return result;  //20 리턴
    }

    //void는 반환값이 없는 자료형입니다.
    public void change()
    {
        int a=10;
        int b=20;

        int result = a+b;
        //리턴이없어요

        //파일 저장, 데이터 저장, 화면에 보여주기
        //그중에 하나인 화면에 출력한겁니다(테스트용)
        System.out.println("result = " + result);
    }


    public static void main(String[] args)
    {
        //붕어빵 만들기
        //클래스명 변수명 = new 클래스명();
        Fish fish = new Fish();

        //변수명.함수명


        //붕어빵이 잉어빵으로 변화는 기능(메서드)
        fish.change();
    }

}
