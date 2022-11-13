public class Metodos {
    public static int multiplicar(int primeiroNumero, int segundoNumero){
        return primeiroNumero*segundoNumero;
    }
    public static double dividir(double primeiroNumero, double segundoNumero){
        return primeiroNumero/segundoNumero;
    }
    public static int somar(int primeiroNumero, int segundoNumero){
        return primeiroNumero+segundoNumero;
    }
    public static int subtrair(int primeiroNumero, int segundoNumero){
        return primeiroNumero-segundoNumero;
    }

    public static String checagemHora(double hora){
        if(hora <= 12) return "Bom dia!";
        else if(hora <=18) return "Boa tarde!";
        else return "Boa noite!";
    }

    public static double calcularArea(double lado){
        return lado * lado;
    }
    public static double calcularArea(double lado, double altura){
        return lado * altura;
    }
    public static double calcularArea(double baseMaior, double altura, double baseMenor){
        return (baseMaior+baseMenor)*altura/2;
    }
}
