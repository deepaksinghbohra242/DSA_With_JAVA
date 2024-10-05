package solid.dependencyinjection;

public class DependencyInjectionPrinciple {
    interface Keyboard{

    }
    class WiredKeyboard{

    }
    class BluetoothKeyboard{

    }
    //here i am using concerete class to create  object which is not suitable
//    class Macbook{
//        private final WiredKeyboard k;
//        Macbook(WiredKeyboard k) {
//            this.k = k;
//        }
//    }
    // I have to use interface rather than class so that implementation can be changed
    class Macbook{
        private Keyboard obj;
    }
}
