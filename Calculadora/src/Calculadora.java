
import javax.swing.JOptionPane;

public class Calculadora {
    public static void main(String[] args) {
        SalvaResultado salvaResultado = new SalvaResultado();

        int verificador;
        double v1,v2;
        String tipoOperacao;

        do {
            Object[] operações = {"Soma", "Subtração", "Divisão", "Multiplicação","Raiz Quadrada"};
            tipoOperacao = (String) JOptionPane.showInputDialog(null,"Escolha um item", "Calculadora", JOptionPane.INFORMATION_MESSAGE, null, operações, operações[0]); //

            String vs1 = JOptionPane.showInputDialog(null,"Digite o primeiro valor: ","Calculadora", JOptionPane.QUESTION_MESSAGE);
            v1 = Double.parseDouble(vs1);
            if (tipoOperacao != "Raiz Quadrada") {
                String vs2 = JOptionPane.showInputDialog(null, "Digite o segundo valor: ", "Calculadora", JOptionPane.QUESTION_MESSAGE);
                v2 = Double.parseDouble(vs2);
                Operacoes op = new Operacoes(tipoOperacao, v1, v2, tipoOperacao);
                JOptionPane.showMessageDialog(null, "O Resultado é: " + op.result(), "RESULTADO", JOptionPane.INFORMATION_MESSAGE);
                salvaResultado.operacoes.add(op);


            } else {
                Operacoes op = new Operacoes(tipoOperacao,v1,tipoOperacao);
                op.simbolos(tipoOperacao);
                RaizQuadrada raiz = new RaizQuadrada(tipoOperacao,v1,tipoOperacao);

                JOptionPane.showMessageDialog(null, "O Resultado é: " + raiz.result(), "RESULTADO", JOptionPane.INFORMATION_MESSAGE);

                salvaResultado.operacoes.add(op);

            }
            verificador = JOptionPane.showConfirmDialog(null, "Deseja fazer mais uma operação?", "Calculadora", JOptionPane.YES_NO_OPTION);

        }while (verificador == 0);

        JOptionPane.showMessageDialog(null, "Histórico das Contas - " + salvaResultado.operacoes.toString(), "HISTÓRIO DOS RESULTADOS", JOptionPane.INFORMATION_MESSAGE);

    }
}

