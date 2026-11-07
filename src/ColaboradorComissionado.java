public class ColaboradorComissionado extends Colaborador {
    double valorVendas = 300;
    double percentualComissao = 30;
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