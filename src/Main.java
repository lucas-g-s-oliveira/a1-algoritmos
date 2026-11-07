public class Main {
    public static void main(String [] args){
        Colaborador c = new Colaborador();
        System.out.println(c.calcularSalarioFinal());
        ColaboradorComissionado n = new ColaboradorComissionado();
        System.out.println(n.calcularSalarioFinal());
    }
}