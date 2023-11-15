package lv.javaguru.java1.student_milans_micko.lesson_6_unit_testing.homework.lvl5;

class ColourWaveDetector {

    //testcase1: 400 ; expected result: Violet
    //testcase1: 470 ; expected result: Blue
    //testcase1: 500 ; expected result: Green
    //testcase1: 580 ; expected result: Yellow
    //testcase1: 611 ; expected result: Orange
    //testcase1: 635 ; expected result: Red
    //testcase1: -300 ; expected result: Invisible Light

    public String colourWave (int wave) {
        if (wave >= 380 && wave <= 449 ) {
            return "Violet";
        } else if (wave >= 450 && wave <= 494 ) {
            return "Blue";
        } else if (wave >= 495 && wave <= 569 ) {
            return "Green";
        } else if (wave >= 570 && wave <= 589 ) {
            return "Yellow";
        } else if (wave >= 590 && wave <= 619 ) {
            return "Orange";
        } else if (wave >= 620 && wave <= 750 ) {
            return "Red";
        } else { return "Invisible Light"; }
    }

}
