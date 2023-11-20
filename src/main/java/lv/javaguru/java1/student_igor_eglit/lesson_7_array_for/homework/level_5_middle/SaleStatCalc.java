package lv.javaguru.java1.student_igor_eglit.lesson_7_array_for.homework.level_5_middle;


class SaleStatCalc {
    public String bestSellingProduct(Sale[] saleRecords) {
        int bestSell = 0;
        var name = "";
        for (int i = 0; i < saleRecords.length; i++) {
            Sale count = saleRecords[i];
            Sale productName = saleRecords[i];
            if (bestSell < count.getUnitCount()) {
                bestSell = count.getUnitCount();
                name = productName.getProduct();
            }
        }
        return name;
    }

    public String biggestTurnoverProd(Sale[] saleRecords) {

        double turnoverResult = 0;
        String name = "";
        for (int i = 1; i < saleRecords.length; i++) {
            Sale count = saleRecords[i];
            Sale price = saleRecords[i];
            Sale productName = saleRecords[i];
            var temp = count.getUnitCount() * price.getPricePerUnit();
            if (turnoverResult < temp) {
                turnoverResult = temp;
                name = productName.getProduct();
            }
        }
        return name;
    }

}

