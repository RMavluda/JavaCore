public class TestInterface {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sleep();
        animal.walk();
        Sleepable sleepObj = new Animal();
        sleepObj.sleep();
 /*       for(int i = 0; i < 100; i++){
            chaskSleepable(arr[i]);
        }*/
    }
   /* public static void chaskSleepable(Sleepable a){
        a.sleep();
    }
    public static void chaskClone(Cloneable a){

    }*/
}
