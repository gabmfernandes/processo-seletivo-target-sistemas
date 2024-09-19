package questao2;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonnaci(7));
    }

    //Estou considerando a posição do primeiro termo como 1
    static int fibonnaci(int n){
        if( n == 0){
            System.out.println("Posição inexistente na sequência");
            return -1;
        }
        if( n==1 ){
            return 0;
        }else if (n == 2){
            return 1;
        }
        int fibo = fibonnaci(n-2) + fibonnaci(n-1);
        return fibo;
    }
}
