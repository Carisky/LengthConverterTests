package org.example;

import org.example.LengthConverter.LengthConverter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение длины: ");
        double length = scanner.nextDouble();

        System.out.println("Выберите единицу измерения (1 - миллиметры, 2 - сантиметры, 3 - дециметры, 4 - метры, 5 - километры): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Результат: " + LengthConverter.convertMillimeters(1.0));
                break;
            case 2:
                System.out.println("Результат: " + LengthConverter.convertCentimeters(1.0));
                break;
            case 3:
                System.out.println("Результат: " + LengthConverter.convertDecimeters(1.0));
                break;
            case 4:
                System.out.println("Результат: " + LengthConverter.convertMeters(1.0));
                break;
            case 5:
                System.out.println("Результат: " + LengthConverter.convertKilometers(1000.0));
                break;
            default:
                System.out.println("Неправильный выбор.");
        }
    }
}