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
            System.out.println("parabéns voce cadastrou seu colaborador n "+i+" cuja matricula e: "+ y.matricula + " e o nome é: " +y.nome+" cuja o tipo e: "+y.tipo);
            
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
            lista.add(j);
            i++;
            System.out.println("parabéns voce cadastrou seu colaborador n "+i+" cuja matricula e: "+ j.matricula + " e o nome é: " +j.nome+" cuja o tipo e: "+j.tipo+" o valor das vendas foi: "+j.valorVendas);
        }
    
        } while(resposta != 0);
}
}