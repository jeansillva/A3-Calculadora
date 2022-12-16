public class Profissional {
    private String nome;
    private double salarioMensal;
    private double hDD;

    private int diasUteis = 20;

    public int getDiasUteis() {
        return diasUteis;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public double getHDD() {
        return hDD;
    }

    public Profissional(String nome, double salarioMensal, double hDD) {
        this.nome = nome;
        this.salarioMensal = salarioMensal;
        this.hDD = hDD;

    }

    public double CalcularValorHora(double salarioMensal, double hDD) {
        double vh = salarioMensal / (20 * hDD);
        return vh;
    }
}