class Employee {
    protected String empName;
    protected int empId;
    protected String address;
    protected String mailId;
    protected long mobileNo;
    protected double basicPay;

    public Employee(String empName, int empId, String address, String mailId, long mobileNo, double basicPay) {
        this.empName = empName;
        this.empId = empId;
        this.address = address;
        this.mailId = mailId;
        this.mobileNo = mobileNo;
        this.basicPay = basicPay;
    }

    public void generatePaySlip() {
        double da = 0.97 * basicPay;
        double hra = 0.10 * basicPay;
        double pf = 0.12 * basicPay;
        double staffClubFund = 0.001 * basicPay;

        double grossSalary = basicPay + da + hra;
        double netSalary = grossSalary - pf - staffClubFund;

        System.out.println("Employee Name: " + empName);
        System.out.println("Employee ID: " + empId);
        System.out.println("Address: " + address);
        System.out.println("Mail ID: " + mailId);
        System.out.println("Mobile Number: " + mobileNo);
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("Dearness Allowance (DA): " + da);
        System.out.println("House Rent Allowance (HRA): " + hra);
        System.out.println("Provident Fund (PF): " + pf);
        System.out.println("Staff Club Fund: " + staffClubFund);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Net Salary: " + netSalary);
        System.out.println("------------------------------");
    }
}

class Programmer extends Employee {
    public Programmer(String empName, int empId, String address, String mailId, long mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

class AssistantProfessor extends Employee {
    public AssistantProfessor(String empName, int empId, String address, String mailId, long mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

class AssociateProfessor extends Employee {
    public AssociateProfessor(String empName, int empId, String address, String mailId, long mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

class Professor extends Employee {
    public Professor(String empName, int empId, String address, String mailId, long mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

public class PayrollSystem {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Alam", 101, "123 Kalabagan", "kamal232@gmail.com", 9876543210L,50000.0);
        programmer.generatePaySlip();

        AssistantProfessor assistantProfessor = new AssistantProfessor("Babul", 201, "456 Central Ave", "babul434@gmail.com", 9876543211L, 60000.0);
        assistantProfessor.generatePaySlip();

        AssociateProfessor associateProfessor = new AssociateProfessor("Halim", 301, "789 Newmarket", "halim989@gmail.com", 9876543212L, 70000.0);
        associateProfessor.generatePaySlip();

        Professor professor = new Professor("Ekram Mollah", 401, "Uttora", "ekram.m@gmail.com", 9876543213L, 80000.0);
        professor.generatePaySlip();
    }
}