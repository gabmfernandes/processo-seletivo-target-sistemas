package questao5;

public class InverteString {
    public static void main(String[] args) {
        String texto = "abraco";

        System.out.println(inverteString(texto));
    }

    static String inverteString(String texto){
        String textoInvertido = "";
        for (int i = texto.length()-1; i >= 0; i--) {
            textoInvertido = textoInvertido + texto.charAt(i);
        }
        return textoInvertido;
    }
}
