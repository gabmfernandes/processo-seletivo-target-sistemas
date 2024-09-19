package questao3;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Manipulando o json para fazer os cálculos
        // Utilizei a biblioteca GSON para fazer a desserialização do JSON

        String json = "[{\"dia\":1,\"valor\":22174.1664},{\"dia\":2,\"valor\":24537.6698}," +
                "{\"dia\":3,\"valor\":26139.6134},{\"dia\":4,\"valor\":0.0},{\"dia\":5,\"valor\":0.0},{\"dia\":6," +
                "\"valor\":26742.6612},{\"dia\":7,\"valor\":0.0},{\"dia\":8,\"valor\":42889.2258},{\"dia\":9," +
                "\"valor\":46251.174},{\"dia\":10,\"valor\":11191.4722},{\"dia\":11,\"valor\":0.0},{\"dia\":12," +
                "\"valor\":0.0},{\"dia\":13,\"valor\":3847.4823},{\"dia\":14,\"valor\":373.7838},{\"dia\":15," +
                "\"valor\":2659.7563},{\"dia\":16,\"valor\":48924.2448},{\"dia\":17,\"valor\":18419.2614}," +
                "{\"dia\":18,\"valor\":0.0},{\"dia\":19,\"valor\":0.0},{\"dia\":20,\"valor\":35240.1826}," +
                "{\"dia\":21,\"valor\":43829.1667},{\"dia\":22,\"valor\":18235.6852},{\"dia\":23," +
                "\"valor\":4355.0662},{\"dia\":24,\"valor\":13327.1025},{\"dia\":25,\"valor\":0.0}," +
                "{\"dia\":26,\"valor\":0.0},{\"dia\":27,\"valor\":25681.8318},{\"dia\":28,\"valor\":1718.1221}," +
                "{\"dia\":29,\"valor\":13220.495},{\"dia\":30,\"valor\":8414.61}]";


        Gson gson = new Gson();

        List<Faturamento> faturamentoList = gson.fromJson(json,new TypeToken<List<Faturamento>>(){}.getType());

        /*  • O menor valor de faturamento ocorrido em um dia do mês;
            • O maior valor de faturamento ocorrido em um dia do mês;
            • Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.*/

        double maior = 0;
        double menor = 0;
        double soma = 0;
        double mediaMensal = 0;
        int contDiasValorAcimaZero = 0;

        for (Faturamento dia: faturamentoList) {
            if(dia.getValor() != 0){
                contDiasValorAcimaZero++;
                soma += dia.getValor();
            }

            if (dia.getValor() < menor){
                menor = dia.getValor();
            }else if(dia.getValor() > maior){
                maior = dia.getValor();
            }
        }

        mediaMensal = soma / contDiasValorAcimaZero;

        int diasFaturamentoSupMediaMensal = 0;
        for (Faturamento dia: faturamentoList) {
            if(dia.getValor() > mediaMensal){
                diasFaturamentoSupMediaMensal++;
            }
        }

        //valor considerando o zero, pois foi pedido para desconsiderar o zero somente no cálculo da média
        System.out.println("Menor valor de faturamento: "+menor);
        System.out.println("Maior valor de faturamento: "+maior);

        System.out.printf("Quantidade de dias com valores superiores à média mensal de %.2f : %d",mediaMensal,
                diasFaturamentoSupMediaMensal);

    }
}
