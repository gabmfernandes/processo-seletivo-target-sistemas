package questao4;

public class Main {
    public static void main(String[] args) {

        /*• SP – R$67.836,43
        • RJ – R$36.678,66
        • MG – R$29.229,88
        • ES – R$27.165,48
        • Outros – R$19.849,53 */

        DistribuidoraEstado sp = new DistribuidoraEstado("SP",67836.43);
        DistribuidoraEstado rj = new DistribuidoraEstado("RJ",36678.66);
        DistribuidoraEstado mg = new DistribuidoraEstado("MG",29229.88);
        DistribuidoraEstado es = new DistribuidoraEstado("ES",27165.48);
        DistribuidoraEstado outros = new DistribuidoraEstado("Outros",19849.53);

        double faturamentoTotal = sp.getFaturamento()+rj.getFaturamento()+mg.getFaturamento()+
                es.getFaturamento()+outros.getFaturamento();

        sp.setPercentualSobreTotal(sp.getFaturamento()/faturamentoTotal*100);
        rj.setPercentualSobreTotal(rj.getFaturamento()/faturamentoTotal*100);
        mg.setPercentualSobreTotal(mg.getFaturamento()/faturamentoTotal*100);
        es.setPercentualSobreTotal(es.getFaturamento()/faturamentoTotal*100);
        outros.setPercentualSobreTotal(outros.getFaturamento()/faturamentoTotal*100);

        System.out.printf("%s - %.2f%%\n",sp.getEstado(),sp.getPercentualSobreTotal());
        System.out.printf("%s - %.2f%%\n",rj.getEstado(),rj.getPercentualSobreTotal());
        System.out.printf("%s - %.2f%%\n",mg.getEstado(),mg.getPercentualSobreTotal());
        System.out.printf("%s - %.2f%%\n",es.getEstado(),es.getPercentualSobreTotal());
        System.out.printf("%s - %.2f%%",outros.getEstado(),outros.getPercentualSobreTotal());






    }
}
