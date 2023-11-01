package lv.javaguru.java1.student_sergejs_roslakovs.lesson_4_if_statement.homework.level4;

public class Stock {
    private String companyName;
    private int currentPrice;
    private int minPrice;
    private int maxPrice;

    public Stock(String companyName, int initialPrice) {
        this.companyName = companyName;
        this.currentPrice = initialPrice;
        this.minPrice = initialPrice;
        this.maxPrice = initialPrice;
    }

    public void updatePrice(int newPrice) {
        currentPrice = newPrice;

        if (newPrice < minPrice) {
            minPrice = newPrice;
        }

        if (newPrice > maxPrice) {
            maxPrice = newPrice;
        }
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getCurrentPrice() {
        return currentPrice;
    }

    public int getMinPrice() {
        return minPrice;
    }

    public int getMaxPrice() {
        return maxPrice;
    }


}
