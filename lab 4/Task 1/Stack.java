class Stack
{
 private int arr[];
 private int top;
 private int capacity;

 Stack(int size)
 { arr = new int[size];
 capacity = size;
 top = -1;}

 public void push(int x) {
    if (isFull()) {
        System.out.println("Stack Overflow! Cannot push " + x);
        return;}
    arr[++top] = x;}

 public int pop() {
    if (isEmpty()) {
        System.out.println("Stack Underflow! Cannot pop.");
        return -1;}
    return arr[top--];}

public int peek() {
    if (isEmpty()) {
        System.out.println("Stack is empty. Cannot peek.");
        return -1;}
    return arr[top];}

 public int top() {
    if (isEmpty()) {
        System.out.println("Stack is empty. Cannot get top element.");
        return -1; }
    return arr[top];}

public int size() {
    return capacity; }

public Boolean isEmpty() {
    return top == -1; }

 public Boolean isFull() {
    return top == capacity - 1;}
 public static void main (String[] args){

 Stack stack = new Stack(3);
 stack.push(1);
 stack.push(2);
 stack.pop();
 stack.pop();
 stack.push(3);
 System.out.println("Top element is: " + stack.peek());
 System.out.println("Stack size is " + stack.size());
 stack.pop();
 
 if (stack.isEmpty())
 System.out.println("Stack Is Empty");
 else
 System.out.println("Stack Is Not Empty"); } }