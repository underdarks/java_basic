package basic;

import javax.lang.model.SourceVersion;

public class Control {

    public static void main(String[] args) {
        //제어문은 if, else if, else
        //코드의 흐름을 제어

        int age =29;

        //나이가 30살 이상이면 성인입니다 출력하고
        //나이가 30살 미만이면 청소년입니다.
        //나이가 60살 이상이면 어른입니다

        // 나이가 30 ~ 59(범위)
        if(age >= 30 & age <60){
            System.out.println("성인입니다");
        }
        //나이가 0~ 29살이면 너는 청소년
        else if(age < 30){
            System.out.println("청소년입니다");
        }
        //너는 나머지 조건들이 악무것도 아니면 어른이야
        else{
            System.out.println("어른입니다");
        }

        





    }
}
