import javax.swing.*;

public class Matrizes {
    public static void main(String[] args){
        /* Escreva um algoritmo que solicite ao usuário a entrada de 4 notas para cada aluno, calcular a média
        dos alunos e exibir na tela. Ao final mostrar  média da turma.
        A média do aluno deve seguir a seguinte regra de negócio:
        Média >= 7,5 Aluno Aprovado
        Média <= 5,5 e < 7,5 Aluno em Recuperação
        Média < 5,5 Aluno Reprovado
         */

        //Vetores dos Alunos
        String[] alunos = {"Igor", "Vinicius", "Lucas"};

        //Matriz das notas
        float [][] notas = new float [3][4];

        //Para controlar o somatório das notas de cada aluno e calcular a média do aluno
        float somaNotas, mediaAluno;

        //Para armazenas o status do aluno e imprimir o boletim
        String statusAluno;

        //Informar as notas do aluno
        // Laço externo para associar aluno a nota
        for(int i = 0; i < 3; i++){
            System.out.println("Aluno: " + alunos[1]);
            //Laço interno para informar a nota de cada aluno
            somaNotas = 0;
            mediaAluno = 0;
            for(int j = 0; j < 4; j++){
                notas[i][j] = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota nº " + (j+1) + " " + alunos[i]));
                somaNotas = somaNotas + notas[i][j];
            }
            mediaAluno = somaNotas / 4;
            if(mediaAluno < 5.5){
                statusAluno = "REPROVADO";
            }else if (mediaAluno >= 5.5 && mediaAluno <= 7.5){
                statusAluno = "EM RECUPERAÇÃO";
            }else{
                statusAluno = "APROVADO;";
            }
            //IMPRESSÃO DO BOLETIM
            System.out.println(("\n**********BOLETIM**********"));
            System.out.println("Aluno: " + alunos[i]);
            System.out.println("Notas");
            for(int j1 = 0; j1 < 4; j1++){
                System.out.println((j1+1) + " - " + notas[i][j1]);
            }
            System.out.println("Média ..: " + mediaAluno + " - " + statusAluno);
        }
    }
}
