public class ColaboradorComissionado extends Colaborador {
    { tipo = "Comissionado";}
    double valorVendas;
    double percentualComissao;
    double comissao;
    double calcularComissao() {
        comissao = (valorVendas * percentualComissao) / 100 ;
        return comissao;
    }
    double calcularSalarioFinal() {
        ColaboradorComissionado y = new ColaboradorComissionado();
        comissao = y.calcularComissao();
        double salarioFinal = salarioBase + comissao;
        return salarioFinal;
    }
}