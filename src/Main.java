import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        ArrayList <Colaborador> lista = new ArrayList<>(); 
        int i=0;
        int resposta = 00;
        do {
        MenuPrincipal c = new MenuPrincipal();
        System.out.println(c.criarMenu());
        System.out.print("digite uma opção: ");
        resposta = sc.nextInt();
        if (resposta == 1){
            ColaboradorPadrao y = new ColaboradorPadrao();
            System.out.println("1 - Cadastrar Colaborador Padrão");
            System.out.println("Digite o numero da matricula: ");
            y.matricula = sc.nextInt();
            sc.nextLine();
            System.out.println("Digite o nome do colaborador: ");
            y.nome = sc.nextLine();
            lista.add(y);
            i++;
            System.out.println("parabéns voce cadastrou seu colaborador n "+i+" cuja matricula e: "+ y.matricula + " e o nome é: " +y.nome+" cuja o tipo e: "+y.tipo+" e cuja o salario é "+y.salarioBase);
            
        }
        else if (resposta == 2){
            ColaboradorComissionado j = new ColaboradorComissionado();
            System.out.println("2 - Cadastrar Colaborador Comissionado"); 
            System.out.println("Digite o numero da matricula: ");
            j.matricula = sc.nextInt();
            sc.nextLine();
            System.out.println("Digite o nome do colaborador: ");
            j.nome = sc.nextLine();
            System.out.println("Digite o valor das vendas: ");
            j.valorVendas = sc.nextDouble();
            System.out.println("Digite a porcentagem da comissao: ");
            j.percentualComissao = sc.nextDouble();
            j.calcularComissao();
            lista.add(j);
            i++;
            System.out.println("parabéns voce cadastrou seu colaborador n "+i+" cuja matricula e: "+ j.matricula + " e o nome é: " +j.nome+" cuja o tipo e: "+j.tipo+" o valor das vendas foi: "+j.valorVendas+ " e de comissao foi: " + j.comissao + " e salario foi: "+j.calcularSalarioFinal());
        }
        else if (resposta == 3){
           ColaboradorProducao w = new ColaboradorProducao();
           System.out.println("Digite o numero da matricula: ");
           w.matricula = sc.nextInt();
           sc.nextLine();
           System.out.println("Digite o nome do colaborador: ");
           w.nome = sc.nextLine();
           System.out.println("Digite quantas peças ele produziu: ");
           w.quantidadePecas  = sc.nextDouble();
           System.out.println("Digite o valor por peça: ");
           w.valorPorPeca  = sc.nextDouble();
           lista.add(w);
           i++;
           System.out.println("parabéns voce cadastrou seu colaborador n "+i+" cuja matricula e: "+ w.matricula + " e o nome é: " +w.nome+" cuja o tipo e: "+w.tipo + "o salario dele ficou: "+w.calcularSalarioFinal());
           
        }
    
        else if (resposta == 4){
            if (i == 0){ 
                System.out.println("nenhum colaborador cadastrado na folha!!!");
            }
            else {
              int tamanhoLista = lista.size();
              int i2;
              double salarioFinal;
              for (i2 = 0; i2 < tamanhoLista; i2++) {
               System.out.println("Matricula: "+lista.get(i2).matricula);
               System.out.println("Nome: "+lista.get(i2).nome);
               System.out.println("Tipo: "+lista.get(i2).tipo);
               System.out.println("Salario base: "+lista.get(i2).salarioBase); 
               salarioFinal = lista.get(i2).calcularSalarioFinal();
               if (salarioFinal > 2000) {
               System.out.println("Comissão: "+ (salarioFinal-2000));
               }
              }
            }
        }
        else if ( resposta != 0 ) {
        System.out.println("DIGITE UM COMANDO VÁLIDO");
        }
        int continuar = 0;
        while (continuar != 6 && resposta != 0){
        System.out.println("Digite 6 para continuar: ");
        continuar = sc.nextInt();
        }
        } while(resposta != 0);
        if (resposta  == 0) {
            System.out.println("programa encerrado");
                }
}
}