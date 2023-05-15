package HW.relation;

public interface Hero {
    public static final String info = "hero";
    public abstract void f2();


    default void heroInfo(){
        System.out.println("info hero");
    }
}
