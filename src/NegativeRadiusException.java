public class NegativeRadiusException extends Throwable {
    int r;
    public NegativeRadiusException(){

    }

    public NegativeRadiusException(int r){
        this.r = r;
    }

    public int getR(){
        return r;
    }
}
