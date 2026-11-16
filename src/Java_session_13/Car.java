package Java_session_13;

public interface Car {
    // To achieve 100% abstraction
    public  void myCar();
    // interfaces supports
    // defaults method's
    // static methods
    // concrete method's are not allowed
    // by default method's of interfaces are abstract
    default void defaultSound(){
        System.out.println("This is an default car sound !! ");
    }
    static void MusicSystem(){
        System.out.println("This is default Music system for Car ! ");
    }
    public void Sound();

}
interface Truck extends Car{
    public void Sound();
}
class Disel implements Car , Truck{
    @Override
    public void myCar(){
        System.out.println("This is an Disel car !");
    }

    @Override
    public void Sound() {
        System.out.println("This is Truck !! ");
    }

}
class Petrol implements Car{

    @Override
    public void myCar() {
        System.out.println("This is an Petrol car ! ");
    }

    @Override
    public void Sound() {

    }

}
