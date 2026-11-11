class GeradorFolha {
    
    int i2;
    double salarioFinal;
    double salarioTotal = 0;
    
    double gerarTotalSalarios (ArrayList<Colaborador> lista)) { 
    int tamanhoLista = lista.size();
    for (i2 = 0; i2 < tamanhoLista; i2++) {
    System.out.println("Matricula: "+lista.get(i2).matricula);
    System.out.println("Nome: "+lista.get(i2).nome);
    System.out.println("Tipo: "+lista.get(i2).tipo);
    System.out.println("Salario base: "+lista.get(i2).salarioBase); 
               salarioFinal = lista.get(i2).calcularSalarioFinal();
               salarioTotal = (salarioTotal + salarioFinal);
               if (salarioFinal > 2000) {
               System.out.println("Comissão: "+ (salarioFinal-2000));
               
              }
              }
              }
}