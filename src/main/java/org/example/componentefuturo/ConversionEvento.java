package org.example.componentefuturo;

import javafx.event.Event;
import javafx.event.EventType;

public class ConversionEvento extends Event {

    public static final EventType<ConversionEvento> CONVERSION_COMPLETADA =
            new EventType<>(Event.ANY, "conversion realizada correctamente");

    private final double euros;
    private final double dolares;

    public ConversionEvento(EventType<? extends Event> eventType, double euros, double dolares) {
        super(eventType);
        this.euros = euros;
        this.dolares = dolares;
    }

    public double getEuros() {
        return euros;
    }

    public double getDolares() {
        return dolares;
    }
}