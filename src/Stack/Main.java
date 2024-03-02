package Stack;

import Stack.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack(4);
        myStack.getTop();
        myStack.getHeight();
        myStack.push(5);
        myStack.pop();
        myStack.printStack();
    }
}