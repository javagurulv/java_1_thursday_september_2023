package lv.javaguru.java1.student_andrejs_picilevics.lesson_4.homework.Level_4;

class Stock {
    private String companyName;
    private int currentPrice;
    private int minPrice;
    private int maxPrice;

    public Stock(String companyName, int currentPrice) {
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        this.minPrice = currentPrice;
        this.maxPrice = currentPrice;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getCurrentPrice() {
        return currentPrice;
    }

    public void updatePrice(int newCurrentPrice) {
        this.currentPrice = newCurrentPrice;

        if (currentPrice > this.maxPrice) {
            this.maxPrice = currentPrice;
        }
        if (currentPrice < this.minPrice) {
            this.minPrice = currentPrice;
        }
    }


    public int getMinPrice() {
        return minPrice;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

}
