package Java_session_10;

public class Oop {

    // Method overloading.
    // Method overriding.

    public static void main(String[] args) {
        Oop oop = new Oop();
        oop.animal();
       // oop.animal("Roar");
        oop.animal(true);
    }

    public void animal( String voice , int legs  ){
        voice = "Bark";
        legs = 4;
        System.out.println("Dog  : " + voice + "Having legs " +  legs);
    }
    public void animal(){
        System.out.println("This is Tiger ");
    }
    public void animal(int istail , String voice  ){
        System.out.println("This is my animal voice : " + voice);
    }

    public String animal(boolean isfly){
        return "My animal will fly ? " + isfly;
    }

    // Method rules
    // 1 : We can acheive method overloading by defining multiple with the same name
    // 2 : method paramters must be different in all methods
    // 3 : number of parameter can be same but order must be different
    // 4 : if all methods have same parameter count then order of parameter must be different

}
