package Lesson.typeClass;

public class Auto {
    private String model;
    private Engine engine;


    public Auto(String model, int ls) {
        this.model = model;
        engine = new Engine(ls);
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    private class Engine {
        int ls;

        public Engine(int ls) {
            this.ls = ls;
           // System.out.println(model);
        }

    }


}
