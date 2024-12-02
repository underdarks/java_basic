package basic;

//부모님 객체(상속을 하는자, 상위클래스)
public class Parents {

    //부모의 특징(필드, 변수)
    protected int money = 100;
    protected String house ="강남 100평 아파트";


    //기능

    //지금살고있는 집의 이름을 리턴해주는겁니다.
    protected String getHouseName(){
        return this.house;
    }

}
