
public class C extends Jack{

    public C(){
        System.out.println("C is called!");
    }
    public String parentToString2(){
        return super.toString();
    }

    public String parentToString3(){
        return parentToString();
    }
}