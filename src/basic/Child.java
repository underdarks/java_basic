package basic;

//자식 객체(상속을 받는 사람, 파생클래스, 자식클래스)
public class Child extends Parents{ //상속

    //기능

    //현재 나의 돈이 얼마나 있는지 조회하는 기능
    public int getMoney(){
        return this.money;
    }

    public static void main(String[] args) {
        //붕어빵틀에서 붕어빵을 만드는 과정(구체화)
        //객체명 변수명 = new 객체명();
        Child child = new Child();

        int money = child.getMoney();
        System.out.println("money = " + money);

        String houseName = child.getHouseName();
        System.out.println("houseName = " + houseName);
    }
}
