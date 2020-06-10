package trabalho.lp;

/**
 * @author Felipe Rocha     RA: 1140781923040
 * @author Otavio Barros    RA: 1140781923014
 * @author Karina Cotrin    RA: 1140781913049
 * @author Nicholas Scalon  RA: 11407819
 */

import java.util.Scanner;
import java.util.Arrays;

public class TrabalhoLP {
    private static double A[], B[], C[];

    public static void main(String[] args) {
        // Preparação
        int opcao = 0;
        // Repetição (para menus cíclicos)
        do {
            // Menu (1a etapa)
            exibirOpcoesMenu();
            // Menu (2a etapa)
            opcao = capturarOpcao();
            // Menu (3a etapa)
            // Executar (realizar) uma ação conforme a opção selecionada
            switch (opcao){
            case 1: // executar opção 1: definir tamanho dos arrays
                executarDefinirTamanho();
                break;
            case 2: // executar opção 2: ler array A
                executarLerArray(A);
                break;
            case 3: // executar opção 3: ler array B
                executarLerArray(B);
                break;
            case 4: // executar opção 4: somar arrays
                executarSomarArrays();
                break;
            case 5: // executar opção 5: subtrair arrays
                executarSubtraiArrays();
                break;
            case 6: // executar opção 6: multiplicar arrays
                executarMultiplicarArrays();
                break;
            case 7: // executar opção 7: dividir arrays
                executarDividirArrays();
                break;
            case 8: // executar opção 8: trocar arrays
                executarTrocaArrays();
                break;
            case 9: // executar opção 9: despedir
                executarDespedir();
                break;
            default:
                System.out.println("Opcao invalida!!!");
            }
            System.out.println("==========");
        } while (opcao != 9); // repete enquanto não for opção de finalização
    }
    
    private static void exibirOpcoesMenu() {
        // Exibir uma lista de opções
        System.out.println("Escolha uma opcao:");
        System.out.println("1.Definir tamanho dos arrays");
        System.out.println("2.Ler array A");
        System.out.println("3.Ler array B");
        System.out.println("4.Somar arrays: C[]=A[]+B[]");
        System.out.println("5.Subtriar arrays: C[]=A[]-B[]");
        System.out.println("6.Multiplicar arrays: C[]=A[]*B[]");
        System.out.println("7.Dividir arrays: C[]=A[]/B[]");
        System.out.println("8.Trocar os valores dos arrays: ");
        System.out.println("");
        System.out.println("9.Sair");
        return; // sem valor de retorno, porque função é void!
    }
    
    private static int capturarOpcao() {
        // Capturar (ler) opção do usuário
        System.out.print("Digite (o numero) de sua opcao: ");
        Scanner sc = new Scanner(System.in);
        int opcao = sc.nextInt();
        sc.nextLine(); // limpar a entrada, após leitura de números        
        return opcao; // com valor de retorno, porque função é int!
    }
    
    private static void executarDefinirTamanho() {
        // Capturar (ler) tamanho dos arrays
        System.out.print("Digite o tamanho dos arrays: ");
        Scanner sc = new Scanner(System.in);
        int tamanho = sc.nextInt();
        sc.nextLine(); // limpar a entrada, após leitura de números        
        // criar os arrays com o tamanho certo
        A = new double[tamanho];
        B = new double[tamanho];
        C = new double[tamanho];
        return; // sem valor de retorno, porque função é void!
    }
    
    private static void executarLerArray(double array[]) {
        // executar leitura do array
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Valor da posicao ["+i+"]? ");
            array[i] = sc.nextDouble();
        }
        // return sem valor de retorno pode ser implícito, porque é void!
    }
    
    private static void executarDespedir() {
        // executar opção 9
        System.out.println("Tchau!");
        // return sem valor de retorno pode ser implícito, porque é void!
    }
    
    private static void executarSomarArrays() {
        // executar somar arrays
        for (int i = 0; i < C.length; i++) {
            C[i] = A[i] + B[i];
        }
        System.out.println("A: " + Arrays.toString(A));
        System.out.println("B: " + Arrays.toString(B));
        System.out.println("C: " + Arrays.toString(C));
        // return sem valor de retorno pode ser implícito, porque é void!
    }

    private static void executarSubtraiArrays() {
        //executar subtração de arrays
        for (int i = 0; i < C.length; i++) {
            C[i] = A[i] - B[i];
        }
        System.out.println("A: " + Arrays.toString(A));
        System.out.println("B: " + Arrays.toString(B));
        System.out.println("C: " + Arrays.toString(C));
        // return sem valor de retorno pode ser implícito, porque é void!
    }

    private static void executarMultiplicarArrays() {
        //executar multiplicação de arrays
        for (int i = 0; i < C.length; i++) {
            C[i] = A[i] * B[i];
        }
        System.out.println("A: " + Arrays.toString(A));
        System.out.println("B: " + Arrays.toString(B));
        System.out.println("C: " + Arrays.toString(C));
        // return sem valor de retorno pode ser implícito, porque é void!
    }

    private static void executarDividirArrays() {
        //executar divisão de arrays
        for (int i = 0; i < C.length; i++) {
            C[i] = A[i] / B[i];
        }
        System.out.println("A: " + Arrays.toString(A));
        System.out.println("B: " + Arrays.toString(B));
        System.out.println("C: " + Arrays.toString(C));
        // return sem valor de retorno pode ser implícito, porque é void!
    }

    private static void executarTrocaArrays() {
        //executa a troca dos arrays
        for (int i = 0; i < C.length; i++) {
            C[i] = A[i];
            A[i] = B[i];
            B[i] = C[i];

        }
        System.out.println("Troca dos valores do Array A pelo Array B: ");
        System.out.println("A: " + Arrays.toString(B));
        System.out.println("B: " + Arrays.toString(C));
    }
    
}
