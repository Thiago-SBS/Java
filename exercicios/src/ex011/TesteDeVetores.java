package ex011;

public class TesteDeVetores {
    public static void main(String[] args) {
        int []n = {3,2,8,7,5,4};

        System.out.println("Total de casas de N é " + n.length);

        for (int c=0; c<=n.length-1; c++) {
            System.out.println("Na posição " + c + " temos o valor " + n[c]);
        }
    }
}
