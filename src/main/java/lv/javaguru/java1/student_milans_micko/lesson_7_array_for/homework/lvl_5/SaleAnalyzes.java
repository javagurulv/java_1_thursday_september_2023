package lv.javaguru.java1.student_milans_micko.lesson_7_array_for.homework.lvl_5;

import java.util.Arrays;

class SaleAnalyzes {
    public String bestSellingProduct(Sale[] saleRecords) {
        int bestSell = 0;
        var name = "";
        for (Sale saleRecord : saleRecords) {
            if (bestSell < saleRecord.getUnitCount()) {
                bestSell = saleRecord.getUnitCount();
                name = saleRecord.getProduct();
            }
        }
        return name;
    }

    public String biggestTurnoverProd(Sale[] saleRecords) {
        double turnoverResult = 0;
        String name = "";
        for (Sale saleRecord : saleRecords) {
            var temp = saleRecord.getUnitCount() * saleRecord.getPricePerUnit();
            if (turnoverResult < temp) {
                turnoverResult = temp;
                name = saleRecord.getProduct();
            }
        }
        return name;
    }
}
