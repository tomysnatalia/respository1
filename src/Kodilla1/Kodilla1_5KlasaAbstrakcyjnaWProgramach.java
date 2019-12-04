
interface Employee {

    double calculateSalary();

}

class FixedSalaryEmployee implements Employee {

    private double salary;

    public FixedSalaryEmployee(double salary) {
        this.salary = salary;
    }

    public double calculateSalary() {
        return this.salary;
    }
}


class SalaryEmployeePlusBonus implements Employee {

    private double bonus;
    private double salary;


    public SalaryEmployeePlusBonus(double bonus, double salary) {
        this.bonus = bonus;
        this.salary = salary;
    }

    public double calculateSalary() {
        return (this.salary * this.bonus) + this.salary;
    }
}

class HourlySalaryEmployee implements Employee {

    private double hours;
    private double hourlyPay;

    public HourlySalaryEmployee(double hours, double hourlyPay) {
        this.hours = hours;
        this.hourlyPay = hourlyPay;
    }

    public double calculateSalary() {
        return this.hourlyPay * this.hours;
    }

}

class ProductsSalaryEmployee implements Employee {
    private double priceForProduct;
    private double numberOfProducts;

    public ProductsSalaryEmployee(double priceForProduct, double numberOfProducts) {
        this.priceForProduct = priceForProduct;
        this.numberOfProducts = numberOfProducts;
    }

    public double calculateSalary() {
        return this.priceForProduct * this.numberOfProducts;
    }
}

// Payout
abstract class SalaryPayout {

    private Employee employee;

    public SalaryPayout(Employee employee) {
        this.employee = employee;
    }

    protected abstract void payout();

    public void processPayout() {
        System.out.println("Creating payout for: " + this.employee.calculateSalary() + " PLN");
        this.payout();
        System.out.println("Payout has been completed!");
    }

}

class SalaryPayoutProcessor extends SalaryPayout {

    public SalaryPayoutProcessor(Employee employee) {
        super(employee);
    }

    protected void payout() {
        System.out.println("Sending money to employee");
    }

}

class Application3 {

    public static void main(String args[]) {

        FixedSalaryEmployee employee = new FixedSalaryEmployee(2000);
        HourlySalaryEmployee employee1 = new HourlySalaryEmployee(40, 19);
        ProductsSalaryEmployee employee2 = new ProductsSalaryEmployee(150, 12);
        SalaryEmployeePlusBonus employee3 = new SalaryEmployeePlusBonus(0.2,2000);

        SalaryPayoutProcessor processor = new SalaryPayoutProcessor(employee3);
        processor.processPayout();

    }

}