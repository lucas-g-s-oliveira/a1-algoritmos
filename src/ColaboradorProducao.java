public class ColaboradorProducao extends Colaborador{
    {tipo = "Produção";}
    double quantidadePecas ;
    double valorPorPeca ;
    double calcularProdutividade() {
    double produtividade  = quantidadePecas * valorPorPeca;
    return produtividade;
    }
    double calcularSalarioFinal() {
    double produtividade = calcularProdutividade();
    double salarioFinal = salarioBase + produtividade;
    return salarioFinal;
    }
}