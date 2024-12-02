package basic;


public class Circle {

    public static void main(String[] args) {
        //반복문
        //foreach
        //for (초기치; 조건문; 증가치) {
        //    ...
        //}
        for(int i =0; i<3; i++) { //외부 반복문
            for(int j=0;j<3;j++){ //내부 반복문
                System.out.print("*");
            }

        }


    }
}
