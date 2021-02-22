package stackImplUsingArray;

public class Main {
    public static void main(String ars[]){
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        EmployeeStackArray stack = new EmployeeStackArray(10);
        stack.push(janeJones);
        stack.push(johnDoe);
        stack.push(marySmith);

        stack.printStack();

        System.out.println("Peek at stakc : "+stack.peek());
        System.out.println("Pop at stack : "+stack.pop());
        System.out.println("Peek at stakc after pop : "+stack.peek());
    }
}
