package Encapsulamento;

public class Count {
    private int primeiraParcela;
    private int segundaParcela;

    //construtor
    public Count(int number1, int number2){

        this.primeiraParcela = number1;
        this.segundaParcela = number2;
    }
    //sobrecarga
    public Count(int number1){

        this.primeiraParcela = number1;
        this.segundaParcela = 0;
    }
    public int soma(){
        int total = primeiraParcela + segundaParcela;
        return total;
    }

    //get e setters

    public int getPrimeiraParcela() {
        return primeiraParcela;
    }

    public void setPrimeiraParcela(int primeiraParcela) {
        this.primeiraParcela = primeiraParcela;
    }

    public int getSegundaParcela() {
        return segundaParcela;
    }

    public void setSegundaParcela(int segundaParcela) {
        this.segundaParcela = segundaParcela;
    }
}
