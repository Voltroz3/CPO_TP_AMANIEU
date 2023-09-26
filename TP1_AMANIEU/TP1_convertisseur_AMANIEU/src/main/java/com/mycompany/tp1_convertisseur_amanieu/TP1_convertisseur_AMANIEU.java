/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp1_convertisseur_amanieu;

import java.util.Scanner;

/**
 *
 * 
 */
public class TP1_convertisseur_AMANIEU {

    public static void main(String[] args) {
        


        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez une valeur réelle de température : ");
        double temperature = scanner.nextDouble();

        System.out.println("Vous avez saisi la température : " + temperature + " degrés Celsius");

        double temperatureKelvin = celsiusVersKelvin(temperature);
        double temperatureFahrenheit = celsiusVersFahrenheit(temperature);

        System.out.println("La température en Kelvin est : " + temperatureKelvin);
        System.out.println("La température en Fahrenheit est : " + temperatureFahrenheit);

        System.out.println("\nMenu de conversion :");
        System.out.println("1) De Celcius vers Kelvin");
        System.out.println("2) De Kelvin vers Celcius");
        System.out.println("3) De Fahrenheit vers Celsius");
        System.out.println("4) De Celsius vers Fahrenheit");
        System.out.println("5) De Kelvin vers Fahrenheit");
        System.out.println("6) De Fahrenheit vers Kelvin");
        System.out.print("Choisissez une option : ");

        int choix = scanner.nextInt();

        switch (choix) {
            case 1:
                System.out.println("La conversion est : " + celsiusVersKelvin(temperature) + " degrés Kelvin");
                break;
            case 2:
                System.out.println("La conversion est : " + kelvinVersCelsius(temperature) + " degrés Celsius");
                break;
            case 3:
                System.out.println("La conversion est : " + fahrenheitVersCelsius(temperature) + " degrés Celsius");
                break;
            case 4:
                System.out.println("La conversion est : " + celsiusVersFahrenheit(temperature) + " degrés Fahrenheit");
                break;
            case 5:
                System.out.println("La conversion est : " + kelvinVersFahrenheit(temperature) + " degrés Fahrenheit");
                break;
            case 6:
                System.out.println("La conversion est : " + fahrenheitVersKelvin(temperature) + " degrés Kelvin");
                break;
            default:
                System.out.println("Option invalide.");
        }

        scanner.close();
    }

    public static double celsiusVersKelvin(double temperatureCelsius) {
        return temperatureCelsius + 273.15;
    }

    public static double kelvinVersCelsius(double temperatureKelvin) {
        return temperatureKelvin - 273.15;
    }

    public static double fahrenheitVersCelsius(double temperatureFahrenheit) {
        return (temperatureFahrenheit - 32) * 5 / 9;
    }

    public static double celsiusVersFahrenheit(double temperatureCelsius) {
        return (temperatureCelsius * 9 / 5) + 32;
    }

    public static double kelvinVersFahrenheit(double temperatureKelvin) {
        double temperatureCelsius = kelvinVersCelsius(temperatureKelvin);
        return celsiusVersFahrenheit(temperatureCelsius);
    }

    public static double fahrenheitVersKelvin(double temperatureFahrenheit) {
        double temperatureCelsius = fahrenheitVersCelsius(temperatureFahrenheit);
        return celsiusVersKelvin(temperatureCelsius);
    





    }
}


   


