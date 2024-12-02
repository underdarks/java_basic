/**
 * 반복문
 *  - 프로그래밍에서 중요한 요소중 하나입니다.
 */
public class iterator_basic {

    public static void main(String[] args){
        System.out.println("반복문 실행");
        int num =0; //num이라는 변수에 0을 대입(메모리에 올림)
        int num2=0;

//        System.out.println(num++); // num출력하고나서 num++
//        System.out.println(++num2); // num을 찍기전에 num++나서 출력

        //3가지 다 동일한 작업이고, 표현(코딩)을 조금 줄인거죠
//        num = num +1; //0 + 1
//        num +=1;        //1
//        num++; //값을 1만 증가시키는 표현


        //후위 증감연산자(뒤에더한다)
        for (int i2= 0; i2 < 5; i2++){
            System.out.println("i2 = " + i2);
        }

        System.out.println(" ============== ");

        //선위 증감연산자(앞에더한다)
        for (int i= 0; i < 5; ++i){
            System.out.println("i = " + i);
        }

//        for(int num2=10 ; num2 > 0; num2-=2)
//        { //2씩감소입니다
//            int a=30;
////            System.out.println("a + num2 = " + a+num2);
//            System.out.println("num2 = " + num2);
//        }

        System.out.println("반복문 종료");
    }
}
