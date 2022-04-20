public class RaizQuadrada extends Operacoes {


    public RaizQuadrada(String simbolos, double v1,String operação){
        super(simbolos,v1,operação);

    }

    public double execucaoCalculos(Double v1,String simbolos){
        this.v1=v1;
        this.simbolos=simbolos;

        return Math.sqrt(v1);
    }
    public double result(){
        double execuçãoCalculo = execucaoCalculos(v1,simbolos);
        this.result=execuçãoCalculo;
        return result;
    }
}
