package questao4;

public class DistribuidoraEstado {
    private String estado;
    private double faturamento;

    private double percentualSobreTotal;

    public DistribuidoraEstado(String estado, double faturamento) {
        this.estado = estado;
        this.faturamento = faturamento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(double faturamento) {
        this.faturamento = faturamento;
    }

    public double getPercentualSobreTotal() {
        return percentualSobreTotal;
    }

    public void setPercentualSobreTotal(double percentualSobreTotal) {
        this.percentualSobreTotal = percentualSobreTotal;
    }
}
