package shoppingLab;

public class ShopApp {

    public double calcTotal(Clothing[] items){

        double total = 0;
        for(int item = 0; item < items.length; item++){
            total += items[item].getPrice();
        }
        return total;

    }
    public char measure(Customer customerName){

       char custSize = customerName.getSize();
       return custSize;
    }

    public double employeePriceAfterDisc(Employee employeeName){

        Clothing[] empItems = employeeName.getClothingItems();

        double total = 0;
        for(int item = 0; item < empItems.length; item++){
            total += empItems[item].getPrice();
        }
        return total = total - (total * employeeName.getDiscount());

    }
}
