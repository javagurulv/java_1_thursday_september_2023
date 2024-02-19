package lv.javaguru.java1.student_danil_sitiakov.lesson_10;

 class FraudDetectionResult {


     private boolean fraud;
     private String ruleName;

     public FraudDetectionResult(boolean fraud, String ruleName) {
         this.fraud = fraud;
         this.ruleName = ruleName;
     }

     public boolean isFraud() {
         return fraud;
     }

     public String getRuleName() {
         return ruleName;
     }

}
