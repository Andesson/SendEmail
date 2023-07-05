package com.ald.email.models;

import com.ald.email.enums.StatusEmail;
import jakarta.mail.Message;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Table(name = "T_EMAIL")
public class EmailModel implements Serializable {

    private static final long serialVersion = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID emailId;
    private String ownerRef;
    private String emailFrom;
    private String emailTo;
    private String subject;
    @Column(columnDefinition = "TEXT") // CAMPO COM MAIS DE 255 CHARACTERS
    private String text;
    private LocalDateTime sendDateEmail;
    private StatusEmail statusEmail;
    private String messageException;

}
