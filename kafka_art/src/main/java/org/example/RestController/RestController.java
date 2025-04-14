package org.example.RestController;

import org.example.RequestDTO.ProcessIdDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.UUID;


@org.springframework.web.bind.annotation.RestController
public class RestController {

    private final Logger log = LoggerFactory.getLogger(RestController.class);




    @PostMapping("/post_process")
    public String hello(@RequestBody ProcessIdDTO processIdDTO) {

        UUID uuid = UUID.randomUUID();

        log.info("{} [POST] /post_process <--", uuid);
        log.info(processIdDTO.getProcess());
        log.info("{} [POST] /post_process -->", uuid);
        log.info(processIdDTO.getProcess());
        return "[INFO]: " + processIdDTO.getProcess();
    }
}
