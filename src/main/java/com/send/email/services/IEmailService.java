package com.send.email.services;

import com.send.email.entity.CorreoRequest;

public interface IEmailService {
    void enviarCorreo(CorreoRequest correoRequest);
}
