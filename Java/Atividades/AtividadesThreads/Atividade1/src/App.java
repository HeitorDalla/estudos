public class App {
    public static void main(String[] args) throws Exception {
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        obj2.start();
    }
}

class A extends Thread { // no momento em que extendo de Thread, a classe não é mais uma classe comum, é uma Thread
    public void run () {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hi");
        }
    }
}

class B extends Thread {
    public void run () {
        for (int i = 0; i < 100; i++) {
            System.out.println("Ola");
        }
    }
}