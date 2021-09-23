package Calculadora;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //variables para solicitar datos al usuario
        Scanner reader = new Scanner(System.in);
        int respuesta;
        do{
            //Se muestra en pantalla opciones al usuario
            System.out.println("Bienvenido a Calculadora");
            System.out.println("Seleccione una de las siguientes opciones: ");
            System.out.println("1.  Suma");
            System.out.println("2.  Resta");
            System.out.println("3.  Multiplicación");
            System.out.println("4.  División");
            System.out.println("5.  Potencia");
            System.out.println("6.  Módulo");
            System.out.println("7.  Raíz Cuadrada");
            System.out.println("8.  Porcentaje");
            System.out.println("0.  Salir");
            System.out.println(">");
            respuesta = reader.nextInt();
            //Se realizan operaciones
            Resultado calculadora = new Resultado(0,0);
            switch (respuesta){
                case 1:
                    //Aquí se realiza la suma
                    System.out.println("¿Cuantas veces quiere sumar?");
                    int cantidad = reader.nextInt();
                    System.out.println("Ingrese un dígito");
                    double valor = reader.nextDouble();
                    calculadora.setPrimerValor(valor);
                    double resultadoSuma = 0;
                    for (int i = 0; i < cantidad - 1 ; i++ ){
                        System.out.println("Ingrese un dígito");
                        valor = reader.nextDouble();
                        calculadora.setSegundoValor(valor);
                        resultadoSuma = calculadora.Suma();
                        calculadora.setPrimerValor(resultadoSuma);
                    }
                    System.out.println("El resultado de la suma es: " + resultadoSuma);
                    break;
                case 2:
                    //Aquí se realiza la resta
                    System.out.println("¿Cuantas veces quiere restar?");
                    int cantidadResta = reader.nextInt();
                    System.out.println("Ingrese un dígito");
                    double valorResta = reader.nextDouble();
                    calculadora.setPrimerValor(valorResta);
                    double resultadoResta = 0;
                    for (int i = 0; i < cantidadResta - 1 ; i++ ){
                        System.out.println("Ingrese un dígito");
                        valorResta = reader.nextDouble();
                        calculadora.setSegundoValor(valorResta);
                        resultadoResta = calculadora.Resta();
                        calculadora.setPrimerValor(resultadoResta);
                    }
                    System.out.println("El resultado de la resta es: " + resultadoResta);
                    break;
                case 3:
                    //Aquí se realiza la multiplicación
                    System.out.println("¿Cuantas veces quiere multiplicar?");
                    int cantidadMultiplicacion = reader.nextInt();
                    System.out.println("Ingrese un dígito");
                    double valorMultiplicacion = reader.nextDouble();
                    calculadora.setPrimerValor(valorMultiplicacion);
                    double resultadoMultiplicacion = 0;
                    for (int i = 0; i < cantidadMultiplicacion - 1 ; i++ ){
                        System.out.println("Ingrese un dígito");
                        valor = reader.nextDouble();
                        calculadora.setSegundoValor(valorMultiplicacion);
                        resultadoMultiplicacion = calculadora.Multiplicacion();
                        calculadora.setPrimerValor(resultadoMultiplicacion);
                    }
                    System.out.println("El resultado de la suma es: " + resultadoMultiplicacion);
                    break;
                case 4:
                    //Aquí se realiza la divisón
                    double dividendo,divisor;
                    System.out.println("Ingrese el dividendo");
                    dividendo = reader.nextDouble();
                    System.out.println("Ingrese el divisor");
                    divisor = reader.nextDouble();
                    calculadora.setPrimerValor(dividendo);
                    calculadora.setSegundoValor(divisor);
                    double resultadoDivision = calculadora.Dividir();
                    System.out.println("El resultado de la división es: " + resultadoDivision);
                    break;
                case 5:
                    //Aquí se realiza la potencia
                    double base,exponente;
                    System.out.println("Ingrese la base");
                    base = reader.nextDouble();
                    System.out.println("Ingrese el exponente");
                    exponente = reader.nextDouble();
                    calculadora.setPrimerValor(base);
                    calculadora.setSegundoValor(exponente);
                    double resultadoPotencia = calculadora.Potencia();
                    System.out.println("El resultado de la potencia es: " + resultadoPotencia);
                    break;
                case 6:
                    //Aquí se realiza el módulo
                    double dividendoModulo,divisorModulo;
                    System.out.println("Ingrese el dividendo");
                    dividendo = reader.nextDouble();
                    System.out.println("Ingrese el divisor");
                    divisor = reader.nextDouble();
                    calculadora.setPrimerValor(dividendo);
                    calculadora.setSegundoValor(divisor);
                    double resultadoModulo = calculadora.Modulo();
                    System.out.println("El módulo es: " + resultadoModulo);
                    break;
                case 7:
                    //Aquí se realiza la raíz cuadrada
                    double baseRaiz;
                    System.out.println("Ingrese la base");
                    base = reader.nextDouble();
                    calculadora.setPrimerValor(base);
                    calculadora.setSegundoValor(0);
                    double resultadoRaizCuadrada = calculadora.RaizCuadrada();
                    System.out.println("La raíz cuadrada es: " + resultadoRaizCuadrada);
                    break;
                case 8:
                    //Aquí se realiza el porcentaje
                    double porcentajeAConocer,total;
                    System.out.println("Ingrese el valor que representa el 100% ");
                    total = reader.nextDouble();
                    System.out.println("Ingrese el valor al que quiere conocer el porcentaje");
                    porcentajeAConocer = reader.nextDouble();
                    calculadora.setPrimerValor(porcentajeAConocer);
                    calculadora.setSegundoValor(total);
                    double resultadoPorcentaje = calculadora.Porcentaje();
                    System.out.println("El porcentaje es: " + resultadoPorcentaje);
                    break;
                default:
                    System.out.println("Ingrese una opción válida");
                    break;
            }
        }while(respuesta != 0);
    }
}


