package solid.opencloseprinciple;

public class OpenClosePrinciple {
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

    //open close principle before
//    class InvoiceDao{
//        Invoice invoice;
//
//        public InvoiceDao(Invoice invoice) {
//            this.invoice = invoice;
//        }
//        public void saveToDB(){
//            //save data
//        }
//        // i need to add one more funtionality so before open close i will add here only
//        public void saveToFile(String filename){
//            // save the file to database
//        }
//    }
     // we have to use interface so we can extend to new
    interface InvoiceDao{
        public void save(Invoice invoice);
    }
    class DatabaseInvoiceDao implements InvoiceDao{
        @Override
        public void save(Invoice invoice) {
            // code for database
        }
    }
    class FileInvoiceDao implements InvoiceDao{
        @Override
        public void save(Invoice invoice) {
            // code for file
        }
    }

}


