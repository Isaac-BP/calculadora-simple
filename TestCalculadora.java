public class TestCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        System.out.println("Sumar de 2 parametros:");
        System.out.println(calc.sumar(20, 10));
        System.out.println("Sumar de 3 parametros:");
        System.out.println(calc.sumar(20, 10, 5));
        System.out.println("Sumar de 4 parametros:");
        System.out.println(calc.sumar(50, 100, 25, 75));

        System.out.println("Resta de 2 parametros");
        System.out.println(calc.restar(20, 10));
        System.out.println("Resta de 3 parametros");
        System.out.println(calc.restar(20, 10, 5));
        System.out.println("Resta de 3 parametros");
        System.out.println(calc.restar(50, 100, 25, 75));

        System.out.println("Multiplicacion de 2 parametros");
        System.out.println(calc.multiplicar(20, 10));
        System.out.println("Multiplicacion de 3 parametros");
        System.out.println(calc.multiplicar(20, 10, 5));
        System.out.println("Multiplicacion de 3 parametros");
        System.out.println(calc.multiplicar(50, 100, 25, 75));

        System.out.println("Division de 2 parametros");
        System.out.println(calc.dividir(200, 50));
        System.out.println("Division de 3 parametros");
        System.out.println(calc.dividir(200, 50, 5));
        System.out.println("Division de 4 parametros");
        System.out.println(calc.dividir(500, 20, 10, 2));
    }
    
}
