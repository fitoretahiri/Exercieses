package problem4;

public class Money {
    private int money;

    public Money(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void addMoney(int addedMoney) {
        this.money = this.money + addedMoney;
    }
}
