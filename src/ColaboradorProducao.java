public class ColaboradorProducao extends Colaborador{
    double quantidadePecas = 4.0;
    double valorPorPeca = 2.0;
    double calcularProdutividade() {
    double produtividade  = quantidadePecas * valorPorPeca;
    return produtividade;
    }
    double calcularSalarioFinal() {
    ColaboradorProducao n = new ColaboradorProducao();
    double produtividade = calcularProdutividade();
    double salarioFinal = salarioBase + produtividade;
    return salarioFinal;
    }
}