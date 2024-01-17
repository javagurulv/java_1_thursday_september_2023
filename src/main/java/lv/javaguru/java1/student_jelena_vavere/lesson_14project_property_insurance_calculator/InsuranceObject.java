package lv.javaguru.java1.student_jelena_vavere.lesson_14project_property_insurance_calculator;

import java.util.List;

public class InsuranceObject {

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
