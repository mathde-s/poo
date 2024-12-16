public class Count {
    private int primeiraParcela;
    private int segundaParcela;

    public Count(int number1, int number2){

        this.primeiraParcela = number1;
        this.segundaParcela = number2;
    }
    public int soma(){
        int total = primeiraParcela + segundaParcela;
        return total;
    }
}
