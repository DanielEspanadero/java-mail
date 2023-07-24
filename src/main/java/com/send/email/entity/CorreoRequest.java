package com.send.email.entity;

public class CorreoRequest {
    private String destinatario;
    private String asunto;

    // Agrega constructor, getters y setters
    // Constructor
    public CorreoRequest() {
    }

    // Getters y setters
    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }
}

