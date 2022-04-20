
public class Operacoes {
    String operação;
    double v1, v2, result;
    String simbolos;

    public Operacoes(String simbolos,double v1,String operação){
        this.simbolos= simbolos;
        this.v1=v1;
        this.operação=operação;
    }

    public Operacoes(String operação, double v1, double v2, String simbolos) {
        this.operação = operação;
        this.v1 = v1;
        this.v2 = v2;
        this.simbolos = simbolos;
    }

    public String toString(){
        if (operação != "Raiz Quadrada"){
            return "\n" + v1 + simbolos(simbolos) + v2 + "=" + result + "\n";
        }
        else{
            return "\n" + simbolos + v1 + "=" + result + "\n";
        }
    }

    public double result() {
        double execucaoCalculos = execucaoCalculos();
        this.result = execucaoCalculos;
        return result;

    }
    public String simbolos (String tipoOperação){
        switch (tipoOperação){
            case "Soma" -> {
                simbolos="+";
                return simbolos;
            }
            case "Subtração" ->{
                simbolos="-";
                return simbolos;
            }
            case "Divisão" ->{
                simbolos="/";
                return simbolos;
            }
            case "Multiplicação"->{
                simbolos="*";
                return simbolos;
            }
            case "Raiz Quadrada" -> {
                simbolos= "√";
                return simbolos;
            }
            default -> {
                simbolos="?";
                return simbolos;
            }
        }
    }

    public double execucaoCalculos() {
        switch (operação) {
            case "Soma" -> {
                return v1 + v2;
            }
            case "Subtração" -> {
                return v1 - v2;
            }
            case "Divisão" -> {
                return v1 / v2;
            }
            case "Multiplicação" -> {
                return v1 * v2;
            }
            case "Raiz Quadrada" -> {
                RaizQuadrada raiz = new RaizQuadrada(simbolos,v1,operação);

                return raiz.execucaoCalculos(v1,simbolos);
            }
            default -> {
                return 0;
            }
        }
    }
}







