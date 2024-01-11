package lv.javaguru.java1.teacher.lesson_15_exceptions.lessoncode.bankapi;

class Client {

    private Long id;
    private String fullName;
    private String personCode;

    public Client(Long id, String fullName, String personCode) {
        this.id = id;
        this.fullName = fullName;
        this.personCode = personCode;
    }

    public Long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPersonCode() {
        return personCode;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", personCode='" + personCode + '\'' +
                '}';
    }
}
