package solid.liskovsubstitutionprinciple;

public class LiskovSubstitutionPrinciple {
    interface Bike{
        void turnOnEngine();
        void accelerate();
    }
    // as in motorcycle feature are extending
    class Motorcycle implements Bike{
        @Override
        public void turnOnEngine() {
            //code for motorcycle
        }
        @Override
        public void accelerate() {
            //code for motorcycle
        }
    }
    // but in bike we are returning null for acceleration so  have
// to create feature like this we don't have to return null
    class Bicycle implements Bike{
        @Override
        public void turnOnEngine() {
            return;
        }
        @Override
        public void accelerate() {
            return;
        }
    }
}