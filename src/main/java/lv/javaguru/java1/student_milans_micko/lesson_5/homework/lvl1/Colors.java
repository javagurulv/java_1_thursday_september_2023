package lv.javaguru.java1.student_milans_micko.lesson_5.homework.lvl1;

public class Colors {

    //570 ... 589 - Желтый ("Yellow")
//590 ... 619 - Оранжевый ("Orange")
//620 ... 750 - Красный ("Red")
    String detect(int wavelenght) {
        String light = "";
        if (wavelenght >= 380 && wavelenght <=449) {
            light = "violet";
        } else if (wavelenght >=450 && wavelenght <=494) {
            light = "blue";
        }else if (wavelenght >=495 && wavelenght <=569) {
            light = "green";
        }else if (wavelenght >=570 && wavelenght <=589) {
            light = "yellow";
        } else if (wavelenght >=590 && wavelenght <=619) {
            light = "orange";
        } else if (wavelenght >=620 && wavelenght <=750) {
            light = "red";
        } else {
            light = "invisible light";
        }
        return light;
    }
}