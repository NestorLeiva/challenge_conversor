package Conversiones;

public class ConversorDivisas {

    private double valor;
    private int divisaPrincipal;
    private int divisaSecundaria;
    private double resultado = 0;

    public ConversorDivisas() {
    }

    public int getDivisaSecundaria() {
        return divisaSecundaria;
    }

    public void setDivisaSecundaria(int divisaSecundaria) {
        this.divisaSecundaria = divisaSecundaria;
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
        /* por medio del 2 Switch anidados se hace la conversion de cada tipo de divisa 
        en el 1 Switch estas las divisas del comboBox 1... 
        en el 2 Switch estan las divisas del comboBox 2 ... 
        en cada Switch de divisaPrincipal se anida el segundo Switch para asi realizar la operacion 
        y hacer un return con el valor de la operacion
        los valores de cada Divisa fueron obtenidos el dia 19/8/2023
        */
        switch (divisaPrincipal) {
            case 0: // CRC
                switch (divisaSecundaria) {
                    case 0: // CRC
                        resultado = valor;
                        break;
                    case 1: // USD
                        resultado = valor * 0.0019;
                        break;
                    case 2:// libra esterlina
                        resultado = valor * 0.0015;
                        break;
                    case 3: // yen japones
                        resultado = valor * 0.27;
                        break;
                    case 4: // won sur coreano
                        resultado = valor * 2.52;
                        break;
                } // fin divisaSecundaria
                break;
            case 1: // USD
                switch (divisaSecundaria) {
                    case 0: // CRC
                        resultado = valor * 532.25;
                        break;
                    case 1: // USD
                        resultado = valor;
                        break;
                    case 2:// libra esterlina
                        resultado = valor * 0.79;
                        break;
                    case 3: // yen japones
                        resultado = valor * 145.42;
                        break;
                    case 4: // won sur coreano
                        resultado = valor * 1340.16;
                        break;
                } // fin divisaSecundaria
                break;
            case 2: // Libra Esterlina
                switch (divisaSecundaria) {
                    case 0: // CRC
                        resultado = valor * 677.77;
                        break;
                    case 1: // USD
                        resultado = valor* 1.27;
                        break;
                    case 2:// libra esterlina
                        resultado = valor ;
                        break;
                    case 3: // yen japones
                        resultado = valor * 185.41;
                        break;
                    case 4: // won sur coreano
                        resultado = valor * 1706.57;
                        break;
                } // fin divisaSecundaria
                break;
            case 3 : // yen Japones
                switch (divisaSecundaria) {
                    case 0: // CRC
                        resultado = valor * 3.666;
                        break;
                    case 1: // USD
                        resultado = valor * 0.0069;
                        break;
                    case 2:// libra esterlina
                        resultado = valor * 0.0054;
                        break;
                    case 3: // yen japones
                        resultado = valor;
                        break;
                    case 4: // won sur coreano
                        resultado = valor * 9.22;
                        break;
                } // fin divisaSecundaria
                break;
            case 4: // won sur Coreano
                switch (divisaSecundaria) {
                    case 0: // CRC
                        resultado = valor * 0.40;
                        break;
                    case 1: // USD
                        resultado = valor * 0.00075;
                        break;
                    case 2:// libra esterlina
                        resultado = valor * 0.00059;
                        break;
                    case 3: // yen japones
                        resultado = valor * 0.11;
                        break;
                    case 4: // won sur coreano
                        resultado = valor ;
                        break;
                } // fin divisaSecundaria
                break;

        }// fin divisaPrincipal
        return resultado;
    }

} // fin class ConversorDivisas
