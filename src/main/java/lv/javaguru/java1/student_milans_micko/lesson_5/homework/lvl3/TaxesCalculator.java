package lv.javaguru.java1.student_milans_micko.lesson_5.homework.lvl3;

//        В стране действует прогрессивная ставка налога:
//        - до 10к евро - налог 30%;
//        - от 10к до 50к евро - налог 40%;
//        - свыше 50к евро - налог 50%.
public class TaxesCalculator {
    double lowTax(int price) {
        return price > 0 && price < 10000 ? price * 0.3 : midTax(price);
    }

    double midTax(int price) {
        return price > 10000 && price < 50000 ? price * 0.4 : highTax(price);
    }

    double highTax(int price) {
        return price * 0.5;
    }
}