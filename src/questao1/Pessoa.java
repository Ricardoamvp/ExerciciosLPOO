package questao1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pessoa {

    private String nome;
    private LocalDate dataNasc;
    private double altura;

    public Pessoa(String nome, LocalDate dataNasc, double altura) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.altura = altura;
    }

    public void info() {
        System.out.println("Nome: " + nome + "\nData de nascimento: " + dataNasc.format(DateTimeFormatter.ofPattern("dd/MM/YYYY")) + "\nAltura: " + altura + " metros");
    }

    public int idade() {
        if(LocalDate.now().isAfter(dataNasc)){
            return LocalDate.now().getYear() - dataNasc.getYear() - 1;
        } else {
            return LocalDate.now().getYear() - dataNasc.getYear();
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
