package com.devsuperior.sendemail.services;

import com.devsuperior.sendemail.dto.EmailDTO;

public interface EmailService {
    void sendEmail(EmailDTO dto);
}
