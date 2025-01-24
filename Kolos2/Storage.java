public class Storage <T>{
    private T object;

    public T retrieve(){
        return object;
    }
    public void store(T object){
        this.object = object;
    }

}
