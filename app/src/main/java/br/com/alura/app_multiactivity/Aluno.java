package br.com.alura.app_multiactivity;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;
    private int frequencia;

    public Aluno(String nome, double nota1, double nota2, int frequencia) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.frequencia = frequencia;
    }


    public String getNome() {
        return nome;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public int getFrequencia() {
        return frequencia;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }

}
