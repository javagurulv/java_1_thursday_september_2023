package lv.javaguru.java1.student_igor_eglit.lesson_7_array_for.homework.level_6_senior;

class StockCalculator {
    public double sumAssetValue(Stock[] stockPortfolio) {
        double sum = 0;
        for (int i = 0; i < stockPortfolio.length; i++) {
            Stock value = stockPortfolio[i];
            sum += value.getAssetValue();
        }
        return sum;
    }

    public double averagePortfolioReturn(Stock[] stockPortfolio) {
        double average = 0;
        if (stockPortfolio.length != 0) {
            //Stock averageReturn = stockPortfolio[stockPortfolio.length];
            average = totalPortfolioReturn(stockPortfolio) / stockPortfolio.length;
        }else {
            System.out.println("No stocks in portfolio");
        }
        return average;
    }
    public double totalPortfolioReturn(Stock[] stockPortfolio){
        double sum = 0;
        for (int i = 0; i < stockPortfolio.length; i++) {
            Stock totalReturn = stockPortfolio[i];
            sum+=totalReturn.getAssetValue()*(totalReturn.getReturnInPercents()/100);
        }
        return sum;
    }
}
