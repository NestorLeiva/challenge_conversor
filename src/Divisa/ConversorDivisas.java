package Divisa;

public class ConversorDivisas {

    private double valor;
    private int divisaPrincipal;
    private double resultado;

    public ConversorDivisas() {
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getDivisaPrincipal() {
        return divisaPrincipal;
    }

    public void setDivisaPrincipal(int divisaPrincipal) {
        this.divisaPrincipal = divisaPrincipal;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public double conversion() {

        if (divisaPrincipal == 1){
        resultado = valor * 535.09;
        } else if (divisaPrincipal == 2){
        resultado = valor * 0.0015;
        }else if (divisaPrincipal == 3 ){
        resultado = valor * 0.27;
        } else if (divisaPrincipal == 4){
        resultado = valor * 2.49;
        }
        return resultado;
    }

} // fin class ConversorDivisas
