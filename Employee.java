package OOPS;
import java.util.Scanner;

public class Employee
{
    String name;
    int age;
    double salary;

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Employee e = new Employee();
        int ch;

        do
        {
            System.out.println("\n1. Create");
            System.out.println("2. Display");
            System.out.println("3. Raise Salary");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            ch = sc.nextInt();
            sc.nextLine();

            switch(ch)
            {
                case 1:
                    System.out.print("Enter your name: ");
                    e.name = sc.nextLine();

                    System.out.print("Enter your age: ");
                    e.age = sc.nextInt();

                    System.out.print("Enter salary: ");
                    e.salary = sc.nextDouble();
                    break;

                case 2:
                    System.out.println("Name: " + e.name);
                    System.out.println("Age: " + e.age);
                    System.out.println("Salary: " + e.salary);
                    break;

                case 3:
                    System.out.print("Enter raise percentage: ");
                    double p = sc.nextDouble();

                    e.salary = e.salary + (e.salary * p / 100);

                    System.out.println("New Salary: " + e.salary);
                    break;

                case 4:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while(ch != 4);

        sc.close();
    }
}