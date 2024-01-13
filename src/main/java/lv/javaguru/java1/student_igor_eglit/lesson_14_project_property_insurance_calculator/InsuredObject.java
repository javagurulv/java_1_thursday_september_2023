package lv.javaguru.java1.student_igor_eglit.lesson_14_project_property_insurance_calculator;

import java.util.Arrays;

class InsuredObject {
    private String objectName;
    private SubObject[] subobject;

    public InsuredObject(String objectName, SubObject ...subobject) {
        this.objectName = objectName;
        this.subobject = subobject;
    }

    public String getObjectName() {
        return objectName;
    }

    public SubObject[] getSubobject() {
        return subobject;
    }

    @Override
    public String toString() {
        return "objectName= " + objectName + '\'' +
                ", subobject= " + Arrays.toString(subobject);
    }
}
