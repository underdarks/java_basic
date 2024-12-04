package OOP1;

//추상 클래스
public abstract class Human {
    protected String name;

    public String getName(){
        return this.name;
    }

    //추상 메서드
    public abstract int getAge();

//    public abstract int testFunc();

}
