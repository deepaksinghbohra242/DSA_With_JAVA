package solid.singleresponsibilityprinciple;

public class SingleResponsibilityPrinciple {
    class Marker {
        String name;
        String color;
        int year;
        int price;

        public Marker(String name, String color, int year, int price) {
            this.name = name;
            this.color = color;
            this.year = year;
            this.price = price;
        }
    }

// before using single responsibility principle
//class Invoice{
//    private Marker marker;
//    private int quantity;
//
//    public Invoice(Marker marker, int quantity) {
//        this.marker = marker;
//        this.quantity = quantity;
//    }
//    public int calculateTotal(){
//        return (marker.price * this.quantity);
//    }
//}

// after using single  responsibility principle

    class Invoice{
        private Marker marker;
        private int quantity;

        public Invoice(Marker marker, int quantity) {
            this.marker = marker;
            this.quantity = quantity;
        }
        public int calculateTotal(){
            return (marker.price * this.quantity);
        }
        public void saveToDB(){
            //save data
        }
        public void printInvoice(){
            //save the data into db
        }

    }
    class InvoiceDao{
        Invoice invoice;

        public InvoiceDao(Invoice invoice) {
            this.invoice = invoice;
        }
        public void saveToDB(){
            //save data
        }
    }
    class InvoicePrinter{
        private Invoice invoice;
        public void print(){
            // print the invoice
        }
    }
}
