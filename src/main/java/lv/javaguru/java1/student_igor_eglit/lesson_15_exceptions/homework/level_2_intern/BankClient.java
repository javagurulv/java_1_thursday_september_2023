package lv.javaguru.java1.student_igor_eglit.lesson_15_exceptions.homework.level_2_intern;

class BankClient {
    private String uid;      // уникальный идентификатор клиента
    private String fullName;

    public BankClient(String uid, String fullName) {
        this.uid = uid;
        this.fullName = fullName;
    }

    public String getUid() {
        return uid;
    }

    public String getFullName() {
        return fullName;
    }
}
