package ex_14_Queue;

import java.util.ArrayDeque;

public class Queue002 {
    public static void main(String[] args) {
        ArrayDeque<Integer> deck=new ArrayDeque<>();
        deck.push(15);
        deck.push(10);
        deck.add(1);
        deck.add(2);
        deck.add(3);
        System.out.println(deck);

    }
}
