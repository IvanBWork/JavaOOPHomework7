package Domain;

import Interfaces.iCalculator;
import Services.ComplexNumber;

/**
 * Класс, представляющий калькулятор для работы с комплексными числами.
 */
public class CalculatorComplexNumber implements iCalculator {
    private ComplexNumber result;

    /**
     * Конструктор класса CalculatorComplexNumber:
     * По умолчанию - устанавливает начальное значение результата в 0.
     */
    public CalculatorComplexNumber() { this.result = new ComplexNumber(0, 0); }

    /**
     * Метод сложения.
     * @param arg Комплексное число для сложения.
     * @return результат сложения комплексных чисел.
     */
    @Override
    public iCalculator sum(ComplexNumber arg) {
        double realPart = this.result.getReal() + arg.getReal();
        double imaginaryPart = this.result.getImaginary() + arg.getImaginary();
        this.result = new ComplexNumber(realPart, imaginaryPart);
        return this;
    }

    /**
     * Метод умножения.
     * @param arg Комплексное число для умножения.
     * @return результат умножения комплексных чисел.
     */
    @Override
    public iCalculator multi(ComplexNumber arg) {
        double realPart = this.result.getReal() * arg.getReal()
                - this.result.getImaginary() * arg.getImaginary();

        double imaginaryPart =this.result.getReal() * arg.getImaginary()
                + this.result.getImaginary() * arg.getReal();

        this.result = new ComplexNumber(realPart, imaginaryPart);
        return this;
    }

    /**
     * Метод деления.
     * @param arg Комплексное число для деления.
     * @return результат деления комплексных чисел.
     */
    @Override
    public iCalculator division(ComplexNumber arg) {
        double denominator = arg.getReal() * arg.getReal() + arg.getImaginary() * arg.getImaginary();

        double realPart = (this.result.getReal() * arg.getReal()
                + this.result.getImaginary() *arg.getImaginary())/denominator ;

        double imaginaryPart = ( this.result.getImaginary()
                * arg.getReal() - this.result.getReal()*arg.getImaginary())/denominator;

        this.result = new ComplexNumber(realPart, imaginaryPart);
        return this;
    }

    /**
     * Метод вычитания.
     * @param arg Комплексное число для вычитания.
     * @return результат вычитания комплексных чисел.
     */
    @Override
    public iCalculator subtract(ComplexNumber arg) {
        double realPart = this.result.getReal() - arg.getReal();
        double imaginaryPart = this.result.getImaginary() - arg.getImaginary();
        this.result = new ComplexNumber(realPart, imaginaryPart);
        return this;
    }

    /**
     * Метод для получения результата операций в виде комплексного числа.
     * @return Результат операций в виде объекта ComplexNumber.
     */
    @Override
    public ComplexNumber getResult() {
        return this.result;
    }
}