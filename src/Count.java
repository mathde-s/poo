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
}
