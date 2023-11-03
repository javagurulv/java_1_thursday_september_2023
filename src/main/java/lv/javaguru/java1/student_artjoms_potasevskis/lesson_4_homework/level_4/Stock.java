package lv.javaguru.java1.student_artjoms_potasevskis.lesson_4_homework.level_4;

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

    public void updatePrice(int newPrice) {
        this.currentPrice = newPrice;
        if (this.minPrice > newPrice) {
            this.minPrice = newPrice;
        }
        if (this.maxPrice < newPrice) {
            this.maxPrice = newPrice;
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




