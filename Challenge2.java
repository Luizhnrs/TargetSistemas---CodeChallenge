/* 2) Escreva um programa que verifique, em uma string, 
a existência da letra ‘a’, seja maiúscula ou minúscula, 
além de informar a quantidade de vezes em que ela ocorre. */

public class Challenge2 {
  public static void main(String[] args) {
    String text = "Java is better the best programming language";

    int count = countOccurrencesOfA(text);

    if (count > 0) {
        System.out.println("The letter 'a' appears " + count + " times in the text.");
    } else {
        System.out.println("The letter 'a' does not appear in the text.");
    }
}

public static int countOccurrencesOfA(String text) {
    int count = 0;
    
    // Converte a string para letras minúsculas para facilitar a contagem
    // Converts the string to lowercase letters for easy counting
    String lowerCaseText = text.toLowerCase();

    // Conta quantas vezes 'a' aparece na string
    // Count how many times 'a' appears in the string
    for (int i = 0; i < lowerCaseText.length(); i++) {
        if (lowerCaseText.charAt(i) == 'a') {
            count++;
        }
    }
    
    return count;
  }
}
