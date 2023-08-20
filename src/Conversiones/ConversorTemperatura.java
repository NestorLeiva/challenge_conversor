package Conversiones;

public class ConversorTemperatura {

    private double valor;
    private double resultado;
    private int temperaturaPrincipal;
    private int temperaturaSecundaria;

    public ConversorTemperatura() {
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public int getTemperaturaPrincipal() {
        return temperaturaPrincipal;
    }

    public void setTemperaturaPrincipal(int temperaturaPrincipal) {
        this.temperaturaPrincipal = temperaturaPrincipal;
    }

    public int getTemperaturaSecundaria() {
        return temperaturaSecundaria;
    }

    public void setTemperaturaSecundaria(int temperaturaSecundaria) {
        this.temperaturaSecundaria = temperaturaSecundaria;
    }

    public double convertirTemperatura() { //Celsius // Fahrenheit // kelvin
        switch (temperaturaPrincipal) {
            case 0: // Celsius
                switch (temperaturaSecundaria) {
                    case 0: //Celsius
                        resultado = valor;
                        break;
                    case 1: // Fahrenheit
                        resultado = valor * 1.8 + 32;
                        break;
                    case 2: // kelvin
                        resultado = valor + 273.15;
                        break;
                } // fin switch temperaturaSecundaria
                break;
            case 1: // Fahrenheit 
                switch (temperaturaSecundaria) {
                    case 0: //Celsius
                        resultado = ((valor - 32)/ 1.8) ;
                        break;
                    case 1: // Fahrenheit
                        resultado = valor ;    
                        break;
                    case 2: // kelvin
                        resultado = (0.55555555556 *(valor -32)+273.15 ); 

                        //K = 5/9 (ºF – 32) + 273.15
                        break;
                } // fin switch temperaturaSecundaria
                break;
            case 2: // kelvin
                switch (temperaturaSecundaria) {
                    case 0: //Celsius
                        resultado = valor - 273.15; //K – 273.15
                        break;
                    case 1: // Fahrenheit
                        resultado = (1.8*(valor-273.15)+32); // ºF = 1.8(K – 273.15) + 32
                        break;
                    case 2: // kelvin
                        resultado = valor ;
                        break;
                } // fin switch temperaturaSecundaria
                break;
        }// fin Switch temperaturaPrincipal

        return resultado;
    }

}
