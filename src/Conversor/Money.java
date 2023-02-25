package Conversor;
public class Money extends Conversor{

    private double moneyPrice;
    private String moneyName;

    public Money(double value, String name){
        this.moneyPrice = value;
        this.moneyName = name;
    }

    public double getMoneyPrice() {
        return this.moneyPrice;
    }

    public String getMoneyName() {
        return this.moneyName;
    }

    public double converser(double count, Money money) {
        System.out.println(money.getMoneyName());
        return (count * this.moneyPrice) / money.getMoneyPrice();
    }

    public double noConverser(double count, Money money) {
        System.out.println(money.getMoneyName());
        return (count * this.moneyPrice) / money.getMoneyPrice();
    }

    @Override
    public double converser(double count, Conversor conversor) {
        if (conversor instanceof Money) {
            Money otherMoney = (Money) conversor;
            System.out.println(otherMoney.getMoneyName());
            return (count * this.moneyPrice) / otherMoney.getMoneyPrice();
        } else {
            throw new IllegalArgumentException("Conversor inválido para Money.");
        }
    }
    @Override
    public double noConverser(double count, Conversor conversor) {
        if (conversor instanceof Money) {
            Money otherMoney = (Money) conversor;
            System.out.println(otherMoney.getMoneyName());
            return (count * otherMoney.getMoneyPrice()) / this.moneyPrice;
        } else {
            throw new IllegalArgumentException("Conversor inválido para Money.");
        }
    }
}
