package OOP1;

//추상 클래스는 설계도
//아파트 설계도
public abstract class Bird {
    protected String name;

    public abstract void display();

    public void quack(){
        System.out.println(" 꽥!");
    }

}
