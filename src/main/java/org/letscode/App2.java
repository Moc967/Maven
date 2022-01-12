package org.letscode;
import java.util.Scanner;

public class App2 {

    private static final OrigemEscolaEnum ORIGEMESCOLAPADRAO = OrigemEscolaEnum.PRIVADA;
    private static final int QUANTIDADE_ATIVIDADE=3;

    public static void main(String[] args) {

        try(Scanner ler = new Scanner(System.in)){
            // Pedir o nome do aluno
            System.out.println("Nome do aluno");
            String alunoNome = ler.next();
            //Perguntar de onde ele vem
            OrigemEscolaEnum origemEscolaEnum = extrairOrigemEscola(ler);
            // Calcular o somatório das notas (média arit)
            double mediaAluno =  obterMediaAluno(ler, getMediaAtividadeAluno(ler));

            System.out.printf("A média do aluno %s de origem %s é %.2f %n %s",
                    alunoNome,origemEscolaEnum.getNomeOrigem(),mediaAluno,
                    isAprovado(origemEscolaEnum, mediaAluno)?" aprovado":"reprovado" );
        }

    }

    private static boolean isAprovado(OrigemEscolaEnum origemEscolaEnum, double mediaAluno) {
        return mediaAluno >= origemEscolaEnum.getMedia();
    }

    private static double obterMediaAluno(Scanner ler, double mediaAtividadeAluno){
        // Pedir a nota da prova
        System.out.println("Nota da prova");
        double notaProvaAluno = ler.nextDouble();
        // Pedir a nota de participação
        System.out.println("Nota da participação");
        double notaParticipacaoAluno = ler.nextDouble();
        // Calcular a media
        return (2*mediaAtividadeAluno + 3*notaProvaAluno + notaParticipacaoAluno)/6;



    }
    private static OrigemEscolaEnum extrairOrigemEscola(Scanner ler) {
        System.out.println("Origem da escola");
        for (OrigemEscolaEnum origem: OrigemEscolaEnum.values()) {
            System.out.printf("%s (%s) %s "
                    ,origem.getNomeOrigem(),origem.getCodigo(),origem.equals(ORIGEMESCOLAPADRAO)?"Padrão":"");
        }

        return OrigemEscolaEnum.valueOfCodigo(ler.next());

    }

    // Pedir as notas das atividades
    private static double coletarNotas(Scanner ler) {

        double somatorioNota=0.0;
        for (int i = 1; i <= QUANTIDADE_ATIVIDADE; i++) {
            somatorioNota+=getNota(ler, (i));
        }
        return somatorioNota;
    }

    private static double getMediaAtividadeAluno(Scanner scanner) {
        double somatorioNota = coletarNotas(scanner);
        return somatorioNota / QUANTIDADE_ATIVIDADE;
    }

    private static double getNota(Scanner scanner, int nAtividade){
        System.out.printf("Nota da atividade %d %n",nAtividade);
        return scanner.nextDouble();
    }
}
