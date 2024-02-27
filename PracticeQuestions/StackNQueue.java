package PracticeQuestions;

import java.util.Queue;
import java.util.Stack;
import java.util.*;

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class StackNQueue {
    // Determine if a String is a palindrome
    public boolean isPali(String s) {
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Populate stack and queue with characters from the string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            stack.push(c);
            queue.offer(c);
        }

        // Compare characters from stack and queue
        while (!stack.isEmpty() && !queue.isEmpty()) {
            char c1 = stack.pop();
            char c2 = queue.poll();
            if (c1 != c2) {
                return false; // Characters do not match, not a palindrome
            }
        }

        // If both stack and queue are empty, all characters matched
        // and the string is a palindrome
        return stack.isEmpty() && queue.isEmpty();
    }

    public static void main(String[] args) {
        StackNQueue solution = new StackNQueue();
        String s1 = "racecar";
        String s2 = "hello";
        System.out.println(s1 + " is a palindrome: " + solution.isPali(s1));
        System.out.println(s2 + " is a palindrome: " + solution.isPali(s2));
    }
}
