package HW.absClass;

public class Telephone {
    private String model;
    private int price;
    private MemoryCard memoryCard;

    public MemoryCard getMemoryCard() {
        return memoryCard;
    }

    public Telephone(String model, int price) {
        this.model = model;
        this.price = price;
        memoryCard = new MemoryCard(1024);

    }

      class MemoryCard {
        private int mb;

        public int getMb() {
            return mb;
        }

        public MemoryCard(int mb) {
            this.mb = mb;
        }
    }

    public void infoBattery(){
        class Battery{
            double d;

            public Battery(double d) {
                this.d = d;
            }

            public void printInfo(){
                System.out.println(d + " mah");
            }
        }
        Battery battery = new Battery(4500);
        battery.printInfo();
    }


}
