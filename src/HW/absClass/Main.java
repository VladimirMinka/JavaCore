package HW.absClass;

public class Main {
    public static void main(String[] args) {
        Telephone telephone = new Telephone("Nokia",7000);
        telephone.infoBattery();
        System.out.println(telephone.getMemoryCard().getMb());
    }
}
