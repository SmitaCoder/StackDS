package stackImplUsingArray;

import java.util.EmptyStackException;

public class EmployeeStackArray {

    private Employee[] stack;
    private int top;

    public EmployeeStackArray(int capacity){
        stack=new Employee[capacity];
    }
    public void push(Employee employee){
        if(top == stack.length) {
            //Resize the array first then push the element on top
            Employee[] newArray = new Employee[2 * stack.length];
            System.arraycopy(stack,0,newArray,0,stack.length);
            stack=newArray;
        }
        stack[top++]=employee;
    }

    public Employee pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        Employee emp = stack[--top];
        stack[top] = null;
        return emp;
    }

    public Employee peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return stack[top-1];
    }

    public int size(){
        return top;
    }

    public boolean isEmpty(){
        if(top == 0)
            return true;
        else
            return false;
    }

    public void printStack(){
        for(int i=top-1;i>=0;i--){
            System.out.println(stack[i]);
        }
    }
}
