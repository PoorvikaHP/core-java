class CalculatorRunner {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        // -------- ADD --------
        calc.addofNumbers(10, 0);
        calc.addofNumbers(20, 0);

        calc.addofNumbers(5, 3);
        calc.addofNumbers(7, 2);

        calc.addofNumbers(1, 2, 3);
        calc.addofNumbers(4, 5, 6);

        calc.addofNumbers(1, 2, 3, 4);
        calc.addofNumbers(2, 3, 4, 5);

        calc.addofNumbers(1, 2, 3, 4, 5);
        calc.addofNumbers(5, 4, 3, 2, 1);

        calc.addofNumbers(1, 1, 1, 1, 1, 1);
        calc.addofNumbers(2, 2, 2, 2, 2, 2);

        calc.addofNumbers(1, 2, 3, 4, 5, 6, 7);
        calc.addofNumbers(7, 6, 5, 4, 3, 2, 1);

        calc.addofNumbers(1, 2, 3, 4, 5, 6, 7, 8);
        calc.addofNumbers(8, 7, 6, 5, 4, 3, 2, 1);

        calc.addofNumbers(1, 2, 3, 4, 5, 6, 7, 8, 9);
        calc.addofNumbers(9, 8, 7, 6, 5, 4, 3, 2, 1);

        calc.addofNumbers(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        calc.addofNumbers(10, 9, 8, 7, 6, 5, 4, 3, 2, 1);

        System.out.println("-------------------------------------------");

        // -------- SUB --------
        calc.substractionoFNumber(50, 0);
        calc.substractionoFNumber(100, 0);

        calc.substractionoFNumber(10, 5);
        calc.substractionoFNumber(20, 10);

        calc.substractionoFNumber(30, 10, 5);
        calc.substractionoFNumber(40, 20, 10);

        calc.substractionoFNumber(50, 10, 5, 5);
        calc.substractionoFNumber(60, 20, 10, 5);

        calc.substractionoFNumber(100, 10, 10, 10, 10);
        calc.substractionoFNumber(90, 5, 5, 5, 5);

        calc.substractionoFNumber(60, 5, 5, 5, 5, 5);
        calc.substractionoFNumber(70, 10, 10, 10, 10, 10);

        calc.substractionoFNumber(70, 5, 5, 5, 5, 5, 5);
        calc.substractionoFNumber(80, 10, 10, 10, 10, 10, 10);

        calc.substractionoFNumber(80, 5, 5, 5, 5, 5, 5, 5);
        calc.substractionoFNumber(90, 10, 10, 10, 10, 10, 10, 10);

        calc.substractionoFNumber(90, 5, 5, 5, 5, 5, 5, 5, 5);
        calc.substractionoFNumber(100, 10, 10, 10, 10, 10, 10, 10, 10);

        calc.substractionoFNumber(100, 5, 5, 5, 5, 5, 5, 5, 5, 5);
        calc.substractionoFNumber(110, 10, 10, 10, 10, 10, 10, 10, 10, 10);

        System.out.println("-------------------------------------------");

        // -------- MUL --------
        calc.multiplicationoFNumber(5, 1);
        calc.multiplicationoFNumber(6, 1);

        calc.multiplicationoFNumber(2, 3);
        calc.multiplicationoFNumber(4, 5);

        calc.multiplicationoFNumber(2, 3, 4);
        calc.multiplicationoFNumber(3, 4, 5);

        calc.multiplicationoFNumber(2, 2, 2, 2);
        calc.multiplicationoFNumber(3, 3, 3, 3);

        calc.multiplicationoFNumber(1, 2, 3, 4, 5);
        calc.multiplicationoFNumber(2, 3, 4, 5, 6);

        calc.multiplicationoFNumber(1, 1, 1, 1, 1, 1);
        calc.multiplicationoFNumber(2, 2, 2, 2, 2, 2);

        calc.multiplicationoFNumber(1, 2, 3, 4, 5, 6, 7);
        calc.multiplicationoFNumber(2, 3, 4, 5, 6, 7, 8);

        calc.multiplicationoFNumber(1, 2, 3, 4, 5, 6, 7, 8);
        calc.multiplicationoFNumber(2, 3, 4, 5, 6, 7, 8, 9);

        calc.multiplicationoFNumber(1, 2, 3, 4, 5, 6, 7, 8, 9);
        calc.multiplicationoFNumber(2, 3, 4, 5, 6, 7, 8, 9, 10);

        calc.multiplicationoFNumber(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        calc.multiplicationoFNumber(2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
    }
}