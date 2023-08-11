package Divisa;



public class ConversorDivisas {

    private double valor;
    private int divisaPrincipal;
    private int divisaFinal;
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

    public int getDivisaFinal() {
        return divisaFinal;
    }

    public void setDivisaFinal(int divisaFinal) {
        this.divisaFinal = divisaFinal;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public double conversion() {
        if ( divisaPrincipal == 0 && divisaFinal == 1 
                  ) {
            resultado = valor * 538.50;
        }else if (divisaPrincipal == 1 && divisaFinal == 2){
            resultado = valor * 0.79;
        }else if (divisaPrincipal == 0 && divisaFinal == 0){
            resultado = valor ;
        }
        return resultado;
    }

} // fin class ConversorDivisas
