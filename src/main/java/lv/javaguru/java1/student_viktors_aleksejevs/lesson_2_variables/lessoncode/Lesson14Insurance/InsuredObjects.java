package lv.javaguru.java1.student_viktors_aleksejevs.lesson_2_variables.lessoncode.Lesson14Insurance;

import java.util.List;

public class InsuredObjects {
private String name;
private List<SubObjects> subObjectslist;

    public InsuredObjects(String name,
                          List<SubObjects> subObjectslist) {
        this.name = name;
        this.subObjectslist = subObjectslist;
    }

    public String getName() {
        return name;
    }

    public List<SubObjects> getSubObjectslist() {
        return subObjectslist;
    }
}
