package lv.javaguru.java1.student_igor_eglit.lesson_14_project_property_insurance_calculator;

class Object {
    private String objectName;
    private SubObject[] subobject;

    public Object(String objectName, SubObject ...subobject) {
        this.objectName = objectName;
        this.subobject = subobject;
    }

    public String getObjectName() {
        return objectName;
    }

    public SubObject[] getSubobject() {
        return subobject;
    }
}
