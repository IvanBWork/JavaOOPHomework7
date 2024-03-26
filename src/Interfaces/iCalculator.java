package Interfaces;

import Services.ComplexNumber;

/**
 * Интерфейс калькулятора комплексных чисел.
 */
public interface iCalculator {
    /**
     * Метод сложения.
     * @param arg комплексное число для сложения.
     */
    iCalculator sum(ComplexNumber arg);

    /**
     * Метод умножения.
     * @param arg комплексное число для умножения.
     */
    iCalculator multi(ComplexNumber arg);

    /**
     * Метод деления.
     * @param arg комплексное число для деления.
     */
    iCalculator division(ComplexNumber arg);

    /**
     * Метод вычитания.
     * @param arg комплексное число для вычитания.
     */
    iCalculator subtract(ComplexNumber arg);

    /**
     * Метод получения вычислений.
     */
    ComplexNumber getResult();
}
