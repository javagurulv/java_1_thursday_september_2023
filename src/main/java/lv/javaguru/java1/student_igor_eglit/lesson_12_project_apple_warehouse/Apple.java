package lv.javaguru.java1.student_igor_eglit.lesson_12_project_apple_warehouse;

import java.util.Objects;

class Apple {
    String appleColor;

    public Apple(String appleColor) {
        this.appleColor = appleColor;

    }
    public String getAppleColor() {
        return appleColor;
    }
//    @Override
//    public boolean equals(Object obj) {
//        if (obj instanceof Apple) {
//            Apple other = (Apple) obj;
//            return this.appleColor.equals(other.appleColor) && Objects.equals(this.getAppleColor(), other.getAppleColor());
//        }
//        return false;
//    }


}
