package Conversor;

public abstract class  Conversor {
    private String name;
    private double valor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public abstract double converser(double count, Conversor conversor);

    public abstract double noConverser(double count, Conversor conversor);

}
