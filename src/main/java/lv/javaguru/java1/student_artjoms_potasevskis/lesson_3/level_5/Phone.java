package lv.javaguru.java1.student_artjoms_potasevskis.lesson_3.level_5;

class Phone {

    private String model;

    Phone(String newModel) {
        this.model = newModel;
    }

    String getModel() {
        return this.model;
    }

}

class PhoneDemo {

    public static void main(String[] args) {
        Phone myPhone = new Phone("Huawei");
        String phoneModel = myPhone.getModel();
        System.out.println("Phone model = " + phoneModel);
    }




}
