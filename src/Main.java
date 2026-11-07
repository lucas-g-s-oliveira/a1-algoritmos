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
            System.out.println("parabéns voce cadastrou seu colaborador n "+i+" cuja matricula e: "+ lista.get(i-1).matricula + " e o nome é: " +lista.get(i-1).nome+" cuja o tipo e: "+lista.get(i-1).tipo);
            
        }
        
    
        } while(resposta != 0);
}
}