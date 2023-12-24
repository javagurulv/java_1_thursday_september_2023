package lv.javaguru.java1.teacher.lesson_14_project_property_insurance_calculator.step_24.insurance;

import java.util.List;

public class InsuredObject {

    private String name;
    private List<InsuredSubObject> subObjects;

    public InsuredObject(String name,
                         List<InsuredSubObject> subObjects) {
        this.name = name;
        this.subObjects = subObjects;
    }

    public String getName() {
        return name;
    }

    public List<InsuredSubObject> getSubObjects() {
        return subObjects;
    }
}
