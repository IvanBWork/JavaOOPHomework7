package Services;

import Interfaces.iCalculator;

/**
 * Класс Декоратор для калькулятора, который добавляет логирование операций.
 */
public class Decorator implements iCalculator {
    private iCalculator calculator;
    private Logger logger;

    /**
     * Конструктор класса Decorator:
     * @param calculator Калькулятор, который будет декорирован.
     * @param logger Логер для записи операций.
     */
    public Decorator(iCalculator calculator, Logger logger) {
        this.calculator = calculator;
        this.logger = logger;
    }

    /**
     * Метод сложения с логированием.
     * @param arg Комплексное число для сложения.
     * @return результат сложения комплексных чисел.
     */
    @Override
    public iCalculator sum(ComplexNumber arg) {
        ComplexNumber firstArg = calculator.getResult();
        logger.log(String.format("Первое значение калькулятора: %f + %fi." +
                        " Начало вызова метода sum с параметром: %f + %fi",
                firstArg.getReal(), firstArg.getImaginary(), arg.getReal(), arg.getImaginary()));

        iCalculator result = calculator.sum(arg);
        logger.log("Вызов метода sum произошёл.");
        return result;
    }

    /**
     * Метод умножения с логированием.
     * @param arg Комплексное число для умножения.
     * @return результат умножения комплексных чисел.
     */
    @Override
    public iCalculator multi(ComplexNumber arg) {
        ComplexNumber firstArg = calculator.getResult();
        logger.log(String.format("Первое значение калькулятора: %f + %fi." +
                        " Начало вызова метода multi с параметром: %f + %fi",
                firstArg.getReal(), firstArg.getImaginary(), arg.getReal(), arg.getImaginary()));

        iCalculator result = calculator.multi(arg);
        logger.log("Вызов метода multi произошёл.");
        return result;
    }

    /**
     * Метод деления с логированием.
     * @param arg Комплексное число для деления.
     * @return результат деления комплексных чисел.
     */
    @Override
    public iCalculator division(ComplexNumber arg) {
        ComplexNumber firstArg = calculator.getResult();
        logger.log(String.format("Первое значение калькулятора: %f + %fi." +
                        " Начало вызова метода division с параметром: %f + %fi",
                firstArg.getReal(), firstArg.getImaginary(), arg.getReal(), arg.getImaginary()));

        iCalculator result = calculator.division(arg);
        logger.log("Вызов метода division произошёл.");
        return result;
    }

    /**
     * Метод вычитания с логированием.
     * @param arg Комплексное число для вычитания.
     * @return результат вычитания комплексных чисел.
     */
    @Override
    public iCalculator subtract(ComplexNumber arg) {
        ComplexNumber firstArg = calculator.getResult();
        logger.log(String.format("Первое значение калькулятора: %f + %fi." +
                        " Начало вызова метода subtract с параметром: %f + %fi",
                firstArg.getReal(), firstArg.getImaginary(), arg.getReal(), arg.getImaginary()));

        iCalculator result = calculator.subtract(arg);
        logger.log("Вызов метода subtract произошёл.");
        return result;
    }

    /**
     * Метод для получения результата операций в виде комплексного числа с логированием.
     * @return Результат операций в виде объекта ComplexNumber.
     */
    @Override
    public ComplexNumber getResult() {
        ComplexNumber result = calculator.getResult();
        logger.log(String.format("Получение результата: %f + %fi", result.getReal(), result.getImaginary()));
        return result;
    }
}