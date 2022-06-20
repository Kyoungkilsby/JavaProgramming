package day18_garbageCollection;

public class TestPizzaObject_WarmUp {
    public static void main(String[] args) {

       Pizza pizza1 = new Pizza();
      // Pizza1.size= 'M';
        pizza1.setInfo('l',3,3);

       Pizza pizza2 = new Pizza();
       pizza2.size = 'l';
        System.out.println(pizza1);

        System.out.println("_______________________");
    double total =0;
        for (int i = 0; i < 20; i++) {
            Pizza small = new Pizza();
            small.setInfo('s',2,2);
            total += small.calcCost();

            Pizza medium = new Pizza();
            medium.setInfo('M',3,3);
            total += medium.calcCost();

            Pizza large = new Pizza();
            large.setInfo('l',4,5);
            total += large.calcCost();
        }
        System.out.println(total);


    }

}
