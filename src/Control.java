
//클래스의 명칭은 맨앞은 대문자가 와야합니다.
//Control, control(X) Control(o)

//여기서 배우실것은 제어문입니다.
//코드의 흐름제어
public class Control
{

    public static void main(String[] args) {
        String fruits = "사과"; //문자열

        //과일종류에 따라 출력하고싶은 내용이 달라집니다.

        //만약 ~~ 라면(가정)
        if(fruits == "사과") { //값 비교(동일하냐?)
            System.out.println("저는 사과입니다.");
        }
        //그리고 또 만약 ~~ 라면(가정)
        //else if는 위의 조건이 만족하면 실행하고(A가 아닐떄 B를 실행)
        //if는 위의 조건이 만족하든 안하든 실행됩니다.(A이든 아니든 무조건 검증)
        else if(fruits == "배"){
            System.out.println("저는 배입니다.");
        }
        //위의조건에 아무것도 적합하지 않으면 실행
        // 어떠한 조건에도 만족하지않으면 실행됩니다.
        else{
            System.out.println("과일이 아닙니다.");
        }


        System.out.println("실행완료!");
    }




}
