package lv.javaguru.java1.student_danil_sitiakov.lesson_14;

import java.util.List;

class InsuranceObject {
    private List<SubObject> subObjects;

    private String name;

    public InsuranceObject(String name, List<SubObject> subObjects) {
        this.name = name;
        this.subObjects = subObjects;
    }

    public String getName() {
        return name;
    }

    public List<SubObject> getSubObjects() {
        return subObjects;
    }
}
