package com.send.email.services;

import com.send.email.services.models.CorreoRequest;

public interface IEmailService {
    void enviarCorreo(CorreoRequest correoRequest);
}
