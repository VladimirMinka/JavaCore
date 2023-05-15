package HW.interfaces;

public class Main {
    public static void main(String[] args) {
        Cashier cashier = new Cashier();
        cashier.post();

        WorkOfBank admin = new WorkOfBank() {
            @Override
            public void post() {
                System.out.println("Должность - администратора");
            }
        };
        WorkOfBank consultant = new WorkOfBank() {
            @Override
            public void post() {
                System.out.println("Должность - консультант");
            }
        };


        WorkOfBank inter = ()->{
            System.out.println("должность стажер");
        };

        admin.post();
        consultant.post();
        inter.post();
    }


}

