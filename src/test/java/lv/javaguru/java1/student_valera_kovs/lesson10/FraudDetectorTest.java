package lv.javaguru.java1.student_valera_kovs.lesson10;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudDetectorTest {

 @Test
 public void testCase1() {
  Trader trader = new Trader("Pokemon", "Madride", "Spain");
  Transaction transaction = new Transaction(trader, 1000);
  FraudDetector fraudDetector = new FraudDetector();
  boolean result = fraudDetector.isFraud(transaction);
  assertEquals(result, true);
 }

 @Test
 public void testCase2() {
  Trader trader = new Trader("Alex", "Madride", "Spain");
  Transaction transaction = new Transaction(trader, 10000);
  FraudDetector fraudDetector = new FraudDetector();
  boolean result = fraudDetector.isFraud(transaction);
  assertEquals(result, false);

 }

 @Test
 public void testCase3() {
  Trader trader = new Trader("Alex", "Madride", "Spain");
  Transaction transaction = new Transaction(trader, 2200000);
  FraudDetector fraudDetector = new FraudDetector();
  boolean result = fraudDetector.isFraud(transaction);
  assertEquals(result, true);

 }
  @Test
  public void testCase4() {
   Trader trader = new Trader("Alex", "Madride", "Spain");
   Transaction transaction = new Transaction(trader, 104);
   FraudDetector fraudDetector = new FraudDetector();
   boolean result = fraudDetector.isFraud(transaction);
   assertEquals(result, true);
  }

  @Test
  public void testCase5() {
   Trader trader = new Trader("Alex", "Kingston", "Jamaica");
   Transaction transaction = new Transaction(trader, 104);
   FraudDetector fraudDetector = new FraudDetector();
   boolean result = fraudDetector.isFraud(transaction);
   assertEquals(result, true);
  }

  @Test
  public void testCase6() {
   Trader trader = new Trader("Alex", "Berlin", "Germany");
   Transaction transaction = new Transaction(trader, 1001);
   FraudDetector fraudDetector = new FraudDetector();
   boolean result = fraudDetector.isFraud(transaction);
   assertEquals(result, true);
  }

  @Test
  public void testCase7() {
   Trader trader = new Trader("Alex", "Madride", "Spain");
   Transaction transaction = new Transaction(trader, 100);
   FraudDetector fraudDetector = new FraudDetector();
   boolean result = fraudDetector.isFraud(transaction);
   assertEquals(result, true);
  }

 }

