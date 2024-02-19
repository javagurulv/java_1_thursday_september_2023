package lv.javaguru.java1.student_danil_sitiakov.lesson_16;

public class lotOfHelloWorld {
    public class HelloWorldThreads {
        public static void main(String[] args) {
            for (int i = 0; i < 5; i++) {
                Thread thread = new Thread(new HelloWorldRunnable());
                thread.start();
            }
        }

        static class HelloWorldRunnable implements Runnable {
            @Override
            public void run() {
                System.out.println("Hello World");
            }
        }
    }
}
