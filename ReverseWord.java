import java.util.Scanner;

class Stack {
    private char stk[];
    private int top;

    public Stack(int size) {
        stk = new char[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == stk.length - 1;
    }

    public void push(char item) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + item);
        } else {
            stk[++top] = item;
        }
    }

    public char pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop");
            return '\0'; // Return null character in case of an error
        } else {
            return stk[top--];
        }
    }
}

public class ReverseWord {
    public static void main(String[] args) {
        // Read a word from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String inputWord = scanner.nextLine();

        // Reverse the word using a stack
        String reversedWord = reverseWord(inputWord);

        // Display the reversed word
        System.out.println("Reversed word: " + reversedWord);
    }

    private static String reverseWord(String inputWord) {
        int wordLength = inputWord.length();
        Stack stack = new Stack(wordLength);

        // Push each character onto the stack
        for (int i = 0; i < wordLength; i++) {
            char currentChar = inputWord.charAt(i);
            stack.push(currentChar);
        }

        // Pop each character from the stack to reverse the order
        StringBuilder reversedWord = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedWord.append(stack.pop());
        }

        return reversedWord.toString();
    }
}
