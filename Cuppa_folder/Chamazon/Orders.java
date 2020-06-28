package com.company;
import java.util.Date;
public class Orders {
    private String number;
    private Date date_ordered;
    private Date shippedDate;
    private Address ship_to;
    public OrderStatus status;
    private double total;
    private LineItem[] lineItems;
    private int orderSize;
    private Payment[] payments;
    private int paymentSize;
    private static long idCounter = 0;

    /**Create unique sequential ID*/
    private static synchronized String createID(){
        return String.valueOf(idCounter++);
    }

    /**Create an instance of Order*/
    public Orders() {
        number = createID();
        date_ordered = new Date();
        status = OrderStatus.New;
        orderSize = 0;
        lineItems = new LineItem[100];
        payments = new Payment[100];
    }

    /**Add LineItem to this Order*/
    public void addLineItem(LineItem item){
        lineItems[orderSize] = item;
        orderSize++;
        total+=item.getTotal();
    }

    /**Add Payment to the order*/
    public void addPayment(Payment payment){
        payments[paymentSize]=payment;
        paymentSize++;

    }

    /**Convert passed Accounts Shopping Cart to an Order*/
    public void convertCartToOrder(Account account){
        Shopping_Cart cart = account.getCart();
        ship_to = account.getBilling_address();
        for(int i = 0; i < cart.getSize(); i++){
            addLineItem(cart.getItems()[i]);
        }
        cart.makeEmpty();
    }

    /**Get order number of this Order*/
    public String getNumber(){
        return number;
    }

    /**Get current status of the Order*/
    public OrderStatus getStatus(){
        return status;
    }

    /**Set that the order has been closed*/
    public void setClosed(){
        status = OrderStatus.Closed;
    }

    /**Show that the order is Delivered*/
    public  void setHold(){
        status = OrderStatus.Hold;
    }

    public void setShipped(){
        status = OrderStatus.Shipped;
    }


    public String toString(){
        String out = "Order Number " + number + "\nStatus: " + status + "\nShipping Address: "
                + ship_to + "\nTotal: " + total + "\n";

        String lineITEMS = "";
        for(int i = 0; i<orderSize; i++){
            lineITEMS += (lineItems[i] + "\n");
        }
        String paymentITEMS = "";
        if(paymentSize == 0){
            paymentITEMS += "None \n";
        }
        for(int i = 0; i < paymentSize; i++){
            paymentITEMS += (payments[i] +"\n");
        }

        return (out + lineITEMS + paymentITEMS);

    }
}

enum OrderStatus {
    New,
    Hold,
    Shipped,
    Delivered,
    Closed
}
