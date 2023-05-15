package HW.enums;

public enum Day {
    MONDAY("пн"),
    TUESDAY("вт"),
    WEDNESDAY(""),
    THURSDAY(""),
    FRIDAY(""),
    SATURDAY(""),
    SUNDAY("");

    private String name;

    Day(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isWeekend() {
       return this == SATURDAY || this == SUNDAY;
    }

}

