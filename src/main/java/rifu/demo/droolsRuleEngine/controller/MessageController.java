package rifu.demo.droolsRuleEngine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import rifu.demo.droolsRuleEngine.pojo.Message;
import rifu.demo.droolsRuleEngine.service.MessageService;

@RestController()
@Controller("message")
public class MessageController {
    @Autowired
    MessageService messageService;

    @PostMapping
    public ResponseEntity messageIn(@RequestBody Message message) {
        messageService.processMessage(message);
        return new ResponseEntity(message, HttpStatus.OK);
    }
}
