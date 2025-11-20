package Tendemloop.com;
class Calculator {
    double a;
    double b;
    String op;

    Calculator(double a, double b, String op) {
        this.a = a;
        this.b = b;
        this.op = op;
    }

    double calculate() {
        if (op.equals("add")) {
            return a + b;
        } else if (op.equals("sub")) {
            return a - b;
        } else if (op.equals("mul")) {
            return a * b;
        } else if (op.equals("div")) {
            return a / b;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Calculator c = new Calculator(10, 5, "add");
        System.out.println("Result = " + c.calculate());
    }
}
