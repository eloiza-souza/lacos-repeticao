public class Main {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5};

        System.out.println("Imprime números de um vetor utilizando for");
        for(int i=0; i <vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }

        System.out.println("\nImprime números de um vetor utilizando while");
        int j = 0;
        while (j < vetor.length){
            System.out.print(vetor[j] + " ");
            j++;
        }

    }
}