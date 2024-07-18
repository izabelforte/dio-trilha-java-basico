package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {

        // analisarCandidato(1900.0);
        // analisarCandidato(2200.0);
        // analisarCandidato(2000.0);
        // selecaoCandidatos();
        // imprimirSelecionados();
        String[] candidatos = { "Felipe", "Marcia", "Julia", "Paulo", "Augusto" };
        for (String candidato : candidatos) {
            LigarCandidato(candidato);

        }
    }

    // exemplo de como imprimir os elementos de um vetor
    static void imprimirSelecionados() {
        String[] candidatos = { "Felipe", "Marcia", "Julia", "Paulo", "Augusto" };
        System.out.println("Imprimindo a lista de candidatos, informando o seu indice");

        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("O candidato de nº" + (i + 1) + " é: " + candidatos[i]);
        }
        System.out.println("Forma abreviada de iteração foreach");
        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    // metodo para selecionar os candidatos de um array de forma aleatória
    static void selecaoCandidatos() {
        // Array com lista de candidatos
        String[] candidatos = { "Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela",
                "Daniela", "Jorge" };

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + " solicitou este valor de salario " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println(" O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    // metodo para informar um valor aleatorio entre 1800 e 2200
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    // metodo para analisar os candidatos (reutilização de código)
    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta");
        } else {
            System.out.println("Aguardando os demais candidatos");
        }
    }

    // metodo auxiliar
    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void LigarCandidato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("contato realizado com sucesso!");
        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.println("conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa");
        }else
            System.out.println("Não conseguimos contato com " + candidato + ", número máximo de tentativas atingido");
    }
}
