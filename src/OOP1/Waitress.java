package OOP1;

//여자 종업원
public class Waitress extends Human{

    //재정의를 반드시 해줘야합니다(override)
    @Override
    public int getAge(){
        return 10;
    }

    public static void main(String[] args) {
        Waitress waitress = new Waitress();
        waitress.name="여자1";
        waitress.getName();
    }

}
