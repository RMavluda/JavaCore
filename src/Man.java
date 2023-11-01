public class Man implements Cloneable {
    private int id;
    private String name;
    Object o;

    public Man(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public Man clone() throws CloneNotSupportedException{
        return (Man)super.clone();
    }
/*
    @Override
    public int compareTo(Man m){
        if(this.id - m.id < 0) return -1;
        else if(this.id == m.id) return 0;
        else return 1;
    }*/
}
