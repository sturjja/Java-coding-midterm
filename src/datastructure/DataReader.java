package datastructure;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.Stack;
public class DataReader {

	public static void main(String[] args) {}}
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.*
		 */
//		String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";
//		try (BufferedReader reader = new BufferedReader(new FileReader(textFile))) {
//
//			LinkedList<String> linkedList = new LinkedList<String>();
//			Stack<String> stack = new Stack<String>();
//
//			String line;
//			while ((line = reader.readLine()) != null) {
//
//				String[] words = line.split(" ");
//				for (String word : words) {
//					linkedList.add(word);
//					stack.push(word);
//				}
//			}
//			System.out.println("Retrieving words from LinkedList in FIFO order:");
//			for (String word : linkedList) {
//				System.out.print(word + " ");
//			}
//			System.out.println();
//
//
//			System.out.println("Retrieving words from Stack in FILO order:");
//			while (!Stack.isEmpty()) {
//				System.out.print(Stack.pop() + " ");
//			}
//			System.out.println();
//
//
//			System.out.println("Demonstrating Stack methods: ");
//			System.out.println("Pushing 'baseball' onto the Stack...");
//			Stack.push("baseball");
//			System.out.println("Pushing 'basketball' onto the Stack...");
//			Stack.push("basketball");
//			System.out.println("Pushing 'football' onto the Stack...");
//			Stack.push("football");
//			System.out.println("The Stack is now: " + stack);
//			System.out.println("Peeking at the top of the Stack: " + stack.peek());
//			System.out.println("Searching for 'banana' in the Stack (returns index from top): " + Stack.search("basketball"));
//			System.out.println("Popping the top element off the Stack: " + stack.pop());
//			System.out.println("The Stack is now: " + stack);
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//	}
