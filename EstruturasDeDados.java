import java.util.LinkedList;

public class EstruturasDeDados {
    public static void main(String[] args) {

        // Utilizando LinkedList pois implementa todas as funções que precisamos
        LinkedList<Integer> lista = new LinkedList<>();
        LinkedList<Integer> pilha = new LinkedList<>();    
        LinkedList<Integer> fila = new LinkedList<>();

        // Preenchendo a lista com [1, 2, 3, 4, 5]
        for(int i = 1; i <=5; i++) {
            lista.add(i);
        }

        // Transferindo os dados da lista para a pilha
        for(int i = 0; i < 5; i++) {
            pilha.push(lista.pollFirst());
        }

        // e da pilha para a fila
        for(int i = 0; i < 5; i++) {
            fila.addFirst(pilha.pollFirst());
        }

        // Adicionando [6, 7, 8, 9, 10] na lista
        for(int i = 6; i <=10; i++) {
            lista.add(i);
        }

        // Trasferindo para pilha
        for(int i = 0; i < 5; i++) {
            pilha.push(lista.pollFirst());
        }

        // e para a fila
        for(int i = 0; i < 5; i++) {
            fila.addFirst(pilha.pollFirst());
        }
        
        // Imprimindo na tela os elementos da fila
        for(int i = 0; i < 10; i++) {
            System.out.println(fila.pollLast());
        }

        






    }

}