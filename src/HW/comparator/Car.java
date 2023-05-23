package HW.comparator;

class Car implements Comparable<Car> {
    private int year; // год выпуска авто
    private String model;
    private Engine engine;

    public Car(int year, String model, int ls) {
        this.year = year;
        this.model = model;
        this.engine = new Engine(ls);
    }


    @Override
    public String toString() {
        return year + " " + model + "ls = " + engine.ls;
    }


    static class Engine {
        private int ls;

        public Engine(int ls) {
            this.ls = ls;
            System.out.println();
        }

        public int getLs() {
            return ls;
        }
    }

    @Override
    public int compareTo(Car o) {
        return Integer.compare(this.engine.getLs(), o.engine.getLs());
    }

    public Engine getEngine() {
        return engine;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }
}
