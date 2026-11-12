package Java_session_11;

public class Animal {
    public void sound(){
        System.out.println("This is animal sounds");
    }

    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
    }
}
class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("Dog is barking.....!");
    }
}
class Cat extends Animal{
    @Override
    public void sound(){
        System.out.println("Cat sound is Meow Meow !!");
    }
}
class Lion extends Animal{
    @Override // <-- JVM flag
    public void sound(){
        System.out.println("Line is roaring.... !!");
    }
}

