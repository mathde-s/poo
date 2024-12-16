package Encapsulamento;

public class Main {
    public static void main(String[] args) {
        Count countUm = new Count(12,2);
        Count countDois = new Count(30);

        System.out.println(countUm.soma());
        System.out.println(countDois.soma());

    }
}