package lv.javaguru.java1.student_artjoms_potasevskis.lesson_14;

import java.util.List;

class InsuranceObject {

    private String name;

    private List<SubObject> subObjects;


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
