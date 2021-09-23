
package Calculadora;

class Resultado {
    
    private double primervalor;
    private double segundovalor;

    public Resultado(int primervalor, int segundovalor){
    
        this.primervalor = primervalor;
        this.segundovalor = segundovalor;
    }     
    
    public double Suma(){
        double suma = this.primervalor + this.segundovalor;
        return suma;
    }
    
    public double Multiplicacion(){
        double multiplicacion = this.primervalor * this.segundovalor;
        return multiplicacion;
    }
    
    public double Potencia(){
        double potencia = Math.pow(this.primervalor,this.segundovalor);
        return potencia;
    }
    
    public double Dividir(){
        double dividir = this.primervalor / this.segundovalor;
        return dividir;
    }
    
    public double Porcentaje(){
        double porcentaje = (this.primervalor * 100/ this.segundovalor);
        return porcentaje;
    }
    
    public double Resta(){
        double resta = this.primervalor - this.segundovalor;
        return resta;
    }
    
    public double Modulo(){
        double modulo = this.primervalor % this.segundovalor;
        return modulo;
    }
    
    public double RaizCuadrada(){
        double raizCuadrada = Math.sqrt(this.primervalor);
        return raizCuadrada;
    }
    public double getPrimervalor(){
        return primervalor;
    }
    
    public double getSegundovalor(){
        return segundovalor;
    }
    public void setPrimerValor(double nuevoValor){
        this. primervalor = nuevoValor;
    }
    
    public void setSegundoValor(double nuevoValor){
        this.segundovalor = nuevoValor;
    }
}

