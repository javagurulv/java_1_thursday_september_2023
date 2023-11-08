package lv.javaguru.java1.student_valera_kovs.lesson5.lvl2;

class homework1 {


    public void isLeap(int year) {
        boolean isLeap = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeap = true;
                } else if (year % 400 != 0) {
                    isLeap = true;
                }
            }

        }

    }
}

