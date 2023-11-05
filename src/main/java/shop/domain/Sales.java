package shop.domain;

public class Sales {
    private String name;
    private int todayBuy;
    private int monthBuy;
    private int totalBuy;

    public Sales(String name, int todayBuy, int monthBuy, int totalBuy) {
        this.name = name;
        this.todayBuy = todayBuy;
        this.monthBuy = monthBuy;
        this.totalBuy = totalBuy;
    }

    public Sales() {
    }

    public String getName() {
        return name;
    }

    public int getTodayBuy() {
        return todayBuy;
    }

    public int getMonthBuy() {
        return monthBuy;
    }

    public int getTotalBuy() {
        return totalBuy;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTodayBuy(int todayBuy) {
        this.todayBuy = todayBuy;
    }

    public void setMonthBuy(int monthBuy) {
        this.monthBuy = monthBuy;
    }

    public void setTotalBuy(int totalBuy) {
        this.totalBuy = totalBuy;
    }

    @Override
    public String toString() {
        return "Sales{" +
                "name='" + name + '\'' +
                ", todayBuy=" + todayBuy +
                ", monthBuy=" + monthBuy +
                ", totalBuy=" + totalBuy +
                '}';
    }
}
