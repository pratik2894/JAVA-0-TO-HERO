package Java_session_10;

public class mother {
    public void behaviour(){
    }
}
class Father {
    public void behaviour(){
    }
}

class Son extends mother , Father{
    public static void main(String[] args) {
        Son s = new Son();
        s.behaviour();
    }
}

// Abstact classes
// Interface // Hybrid inheritance