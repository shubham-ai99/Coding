package String;

public class ToStringExample {
private String name;
private int age;

public ToStringExample(String name,int age){
        this.name=name;
        this.age=age;
        }

@Override
public String toString(){
        return"Employee [name="+name+", age="+age+"]";
        }

public static void main(String[]args){
    ToStringExample emp=new ToStringExample("Shubh",25);

        // Print the object's string representation
        System.out.println(emp.toString()); // Output: Employee [name=John, age=30]

        // The toString() method is automatically called when an object is concatenated with a string
        String empString="Employee details: "+emp;
        System.out.println(empString); // Output: Employee details: Employee [name=Shubh, age=25]
        }
}
