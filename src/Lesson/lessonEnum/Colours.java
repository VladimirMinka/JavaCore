package Lesson.lessonEnum;

import Lesson.anonimClass.Pk;

public enum Colours {
    BLACK("черный"),
    BLUE("синий"),
    GREEN("зеленый"),
    RED("красный");

    private String nameRu;

    private Colours(String nameRu) {
        this.nameRu = nameRu;
    }

    public String getNameRu() {
        return nameRu;
    }
}
