package fr.lernejo.logger;

public class ConsoleLogger implements Logger {
    void log(String message) {
        System.out.prinln(message);
    }
}