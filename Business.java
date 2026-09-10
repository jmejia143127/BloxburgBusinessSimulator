import java.util.ArrayList;

public class Business
{
    private String name;
    private String owner;
    private double funds;

    private static int totalBusinesses = 0;

    public static final double TAX_RATE = 0.1;
    public static final double STANDARD_WAGE = 15.0;

    private ArrayList<Employee> employees;

    // Constructor with business name only
    public Business(String name)
    {
        this(name, "Unknown", 0.0);
    }

    // Constructor with business name and starting funds
    public Business(String name, double startingFunds)
    {
        this(name, "Unknown", startingFunds);
    }

    // Constructor with all business information
    public Business(String name, String owner, double startingFunds)
    {
        this.name = name;
        this.owner = owner;
        this.funds = startingFunds;
        this.employees = new ArrayList<Employee>();
        totalBusinesses++;
    }

    // Getters and setters
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getOwner()
    {
        return owner;
    }

    public void setOwner(String owner)
    {
        this.owner = owner;
    }

    public double getFunds()
    {
        return funds;
    }

    public void setFunds(double funds)
    {
        this.funds = funds;
    }

    public static int getTotalBusinesses()
    {
        return totalBusinesses;
    }

    // Hire an employee with a custom salary
    public void hireEmployee(String name, String role, double salary)
    {
        Employee employee = new Employee(name, role, salary);
        employees.add(employee);
    }

    // Overloaded method that uses the standard wage
    public void hireEmployee(String name, String role)
    {
        hireEmployee(name, role, STANDARD_WAGE);
    }

    // Pay employee salaries
    public void paySalaries()
    {
        for (Employee employee : employees)
        {
            funds -= employee.getSalary();
        }
    }

    // Apply taxes
    public void payTaxes()
    {
        funds -= funds * TAX_RATE;
    }

    // Display employees
    public void displayEmployees()
    {
        for (Employee employee : employees)
        {
            System.out.println(
                "Employee: " + employee.getName() +
                " | Role: " + employee.getRole() +
                " | Salary: $" + employee.getSalary() + "/hour"
            );
        }
    }

    // Nested Employee class
    public class Employee
    {
        private String name;
        private String role;
        private double salary;

        public Employee(String name, String role, double salary)
        {
            this.name = name;
            this.role = role;
            this.salary = salary;
        }

        public String getName()
        {
            return name;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        public String getRole()
        {
            return role;
        }

        public void setRole(String role)
        {
            this.role = role;
        }

        public double getSalary()
        {
            return salary;
        }

        public void setSalary(double salary)
        {
            this.salary = salary;
        }
    }
}
