/*

Implemente um projeto no qual serão inseridos números de forma ordenada,
e que atenda as especificações a seguir: 
 
Passo 1: Insira os números [1, 2, 3, 4 e 5] em uma lista - com 5 células; 
Passo 2: Remova todos os dados da lista e insira-os em uma Pilha - com 5 células.
        Deve-se sempre remover os dados da célula inicial da lista; 
Passo 3: Remova os dados da Pilha e insira-os em uma Fila - com 10 células); 
Passo 4: Insira os números [6, 7, 8, 9 e 10] na lista; 
Passo 5: Repita os passos 2 e 3. 
Passo 6: Exiba todos os números que foram inseridos na fila. 
 
Analise a ordem dos números exibidos e verifique se estão na mesma forma que foram inseridos.
Se a exibição foi diferente, justifique o ocorrido.
 
O programa desenvolvido pelo aluno e a sua justificativa deverá ser postado em um ambiente virtual.
Esse programa será avaliado pelo tutor responsável pela disciplina.


RESPOSTA: Os números são exibidos na ordem [5, 4, 3, 2, 1, 10, 9, 8, 7, 6]

A justificativa se dá pela forma como os dados são inseridos e recuperados em cada uma das
estruturas de dados utilizada. Na lista, os elementos podem ser inseridos e recuperados
em qualquer ordem, mas em geral são inseridos ao fim da lista e recuperados do primeiro ao último.

Na pilha, que é uma estrutura do tipo LIFO (Last in - First out), os elementos são sempre inseridos
no topo da pilha (primeira célula) e recuperados de cima pra baixo, como sugere o nome LIFO.
Ou seja, último a entrar é o primeiro a sair, de forma análoga a uma pilha de objetos.

Já a fila é uma estrutura do tipo FIFO (First in - First out), ou seja, o primeiro a entrar é o
primeiro a sair, de forma análoga a uma fila de pessoas para atendimento em uma cabine.

Sendo assim, quando transferimos os números [1, 2, 3, 4, 5] da lista para a pilha, eles preservam sua ordem.
Porém, quando saem e entram na fila, a ordem é invertida [5, 4, 3, 2, 1] visto que a pilha é LIFO.

Repetimos o processo com [6, 7, 8, 9, 10], que por sua vez acabam em ordem invertida na fila
exatamente da mesma forma.

Sendo a fila FIFO, e a ordem de entrada ter sido [5, 4, 3, 2, 1] seguidos de [10, 9, 8, 7, 6],
é exatamente essa a ordem em que os números saem da fila e são exibidos na tela:
[5, 4, 3, 2, 1, 10, 9, 8, 7, 6]


*/

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
            fila.addFirst(pilha.pop());
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