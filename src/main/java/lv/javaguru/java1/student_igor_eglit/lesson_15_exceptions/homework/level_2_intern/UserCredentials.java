package lv.javaguru.java1.student_igor_eglit.lesson_15_exceptions.homework.level_2_intern;

import java.util.List;

class UserCredentials {
    private List<Role> roles;

    public UserCredentials(List<Role> roles) {
        this.roles = roles;
    }

    public List<Role> getRoles() {
        return roles;
    }
}
