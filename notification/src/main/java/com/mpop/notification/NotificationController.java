package com.mpop.notification;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notification")
@Slf4j
public class NotificationController {

    @PostMapping("/email")
    public ResponseEntity<Void> sendEmail(@Validated @RequestBody EmailRequestPayload emailRequest) {
        log.info("Sending email to {}", emailRequest.getReceiverEmail());

        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
