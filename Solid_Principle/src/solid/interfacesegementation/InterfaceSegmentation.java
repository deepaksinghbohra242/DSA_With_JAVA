package solid.interfacesegementation;

public class InterfaceSegmentation {

//interface RestaurantEmployee{
//    void washDishes();
//    void serveCustomers();
//    void cookFood();
//}
//// as we have to write implementation for every employee which are not neces
//class Waiter implements RestaurantEmployee{
//    @Override
//    public void washDishes() {
//    }
//    @Override
//    public void serveCustomers() {
//    }
//    @Override
//    public void cookFood() {
//    }
//}

    // using Liskov substitution
    interface waiterInterface{
        void serveCustomer();
        void takeOrder();
    }
    interface ChefInterface{
        void cookFood();
        void decideMenu();
    }
    // using breakdown into many interface so that each have its own functionality
    class waiter implements waiterInterface{
        @Override
        public void serveCustomer(){
        }
        @Override
        public void takeOrder() {

        }
    }

}