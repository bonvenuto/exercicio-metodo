public class Teste {
    public static void main(String[] args) {

//  Calculadora
        int testeUm = 2;
        int testeDois = 4;
        int resultadoInt = Metodos.multiplicar(2, 4);
        System.out.println("Multiplicação: " + resultadoInt);
        double resultadoDouble = Metodos.dividir(2, 4);
        System.out.println("Divisão: " + resultadoDouble);
        resultadoInt = Metodos.somar(2, 4);
        System.out.println("Soma: " + resultadoInt);
        resultadoInt = Metodos.subtrair(2, 4);
        System.out.println("Subtração: " + resultadoInt);

//  Horário

        String mensagemHora = Metodos.checagemHora(2);
        System.out.println(mensagemHora);
        mensagemHora = Metodos.checagemHora(11);
        System.out.println(mensagemHora);
        mensagemHora = Metodos.checagemHora(12);
        System.out.println(mensagemHora);
        mensagemHora = Metodos.checagemHora(15);
        System.out.println(mensagemHora);
        mensagemHora = Metodos.checagemHora(18);
        System.out.println(mensagemHora);
        mensagemHora = Metodos.checagemHora(22);
        System.out.println(mensagemHora);

        double area;
        area = Metodos.calcularArea(2);
        System.out.println("Área do quadrado: " + area);
        area = Metodos.calcularArea(2, 4);
        System.out.println("Área do retângulo: " + area);
        area = Metodos.calcularArea(2, 4, 3);
        System.out.println("Área do trapézio: " + area);


    }
}
