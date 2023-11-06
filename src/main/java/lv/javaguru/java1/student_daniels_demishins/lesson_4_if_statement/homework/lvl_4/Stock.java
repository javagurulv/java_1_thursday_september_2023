package lv.javaguru.java1.student_daniels_demishins.lesson_4_if_statement.homework.lvl_4;

class Stock {

    private String company;
    private int currentPrice;
    private int minPrice;
    private int maxPrice;

    public Stock(String company, int currentPrice) {
        this.company = company;
        this.currentPrice = currentPrice;
        this.minPrice = currentPrice;
        this.maxPrice = currentPrice;
    }

    void updatePrice(int newPrice) {
        this.currentPrice = newPrice;
        if (currentPrice < minPrice) {
            minPrice =currentPrice;
        } else if (currentPrice > maxPrice) {
            maxPrice =currentPrice;
        }
    }

    public String getCompany() {
        return company;
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