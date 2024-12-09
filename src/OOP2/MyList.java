package OOP2;

import OOP1.Bird;
import OOP1.Human;
import OOP1.Manress;
import OOP1.Waitress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class MyList {

    //리스트 - 자료구조 중의 하나에요
    //자료구조 선형 자료구조, 비선형 자료구조, 등등
    //리스트 선형 자료구조(자료를 어떻게 저장하는지)중 하나입니다.
    public static void main(String[] args) {
        //다형성
        List arr= new ArrayList<Human>();
        Human human1 = new Manress();
        Human human2  = new Waitress();

        arr.add(human1);
        arr.add(human2);

        System.out.println(((Human)arr.get(0)).getAge());
        System.out.println(((Human)arr.get(1)).getAge());

    }

}
