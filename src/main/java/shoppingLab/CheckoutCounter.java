package shoppingLab;

public class CheckoutCounter {

    public static ShopApp shopApp = new ShopApp();

    public static Clothing[] shoppingBag = new Clothing[1];
    public static Clothing[] employeeBag = new Clothing[1];
    public static Customer[] customers = new Customer[2];


    public static void main(String[] args) {

        Clothing jacket = new Clothing("Ripped Demin Jacket",59.99,'L');
        shoppingBag[0] = jacket;
        Customer customer = new Customer("Lebronnnnn James", shoppingBag,'L');

        Clothing hoodie = new Clothing("Green Vintage Hoodie",19.99,'s');
        employeeBag[0] = hoodie;
        Employee employee = new Employee("Lil Ray Ray",employeeBag,'M');

        customers[0] = customer;
        customers[1] = employee;

        String comeAgain = ":::::::::::::Thank you - Come Again!:::::::::::";
        for(int cust = 0; cust < customers.length; cust++){
            System.out.println(customers[cust].getName());
            if(customers[cust] == customer){
                System.out.println(customer.toString());
                System.out.println("Customer's size: " + customer.getSize());
                System.out.println("Fit? " + jacket.isAFit(customer));
                System.out.println("Total: " + shopApp.calcTotal(shoppingBag));
                System.out.println(comeAgain);

            }
            else{
                System.out.println(employee.toString());
                System.out.println("Employee's size: " + employee.getSize());
                System.out.println("Fit? " + hoodie.isAFit(employee));
                System.out.println("Total: " + shopApp.employeePriceAfterDisc(employee));
            }
        }

    }

}
