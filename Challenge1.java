/* 1) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 
e o próximo valor sempre será a soma dos 2 valores anteriores 
(exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), 
escreva um programa na linguagem que desejar onde, informado um número, 
ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado 
pertence ou não a sequência. */

public class Challenge1 {
  public static void main(String[] args) {
    int number = 21;

    System.out.println("Calculating Fibonacci sequence up to " + number + ":");
    if (isFibonacci(number)) {
        System.out.println("The number " + number + " belongs to the Fibonacci sequence.");
    } else {
        System.out.println("The number " + number + " does not belong to the Fibonacci sequence.");
    }
}

public static boolean isFibonacci(int number) {
    if (number == 0) {
        System.out.println("0");
        return true;
    }
    if (number == 1) {
        System.out.println("0, 1");
        return true;
    }

    int previous = 0;
    int current = 1;
    
    System.out.print(previous + ", " + current);

    while (current < number) {
        int next = previous + current;
        previous = current;
        current = next;
        System.out.print(", " + current);
    }

    System.out.println();

    return current == number;
  }
}