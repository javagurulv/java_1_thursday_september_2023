package lv.javaguru.java1.teacher.lesson_5_methods.homework.solutions.level_1_intern.task_2;

class LightColorDetectorDemo {

    public static void main(String[] args) {
        LightColorDetector detector = new LightColorDetector();
        System.out.println("400 = " + detector.detect(400));
        System.out.println("480 = " + detector.detect(480));
        System.out.println("500 = " + detector.detect(500));
        System.out.println("550 = " + detector.detect(550));
        System.out.println("600 = " + detector.detect(600));
        System.out.println("650 = " + detector.detect(650));
        System.out.println("800 = " + detector.detect(800));
    }

}
