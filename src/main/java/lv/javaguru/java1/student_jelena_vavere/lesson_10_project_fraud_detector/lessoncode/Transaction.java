package lv.javaguru.java1.student_jelena_vavere.lesson_10_project_fraud_detector.lessoncode;

    class Transaction {
        private int amount;
        private Trader trader;

        public int getAmount() {
            return amount;
        }

        public Trader getTrader() {
            return trader;
        }

        public Transaction(int amount, Trader trader) {
            this.amount = amount;
            this.trader = trader;

        }

    }


