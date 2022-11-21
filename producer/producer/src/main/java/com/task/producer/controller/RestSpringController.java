package com.task.producer.controller;

import com.task.producer.model.Sms;
import com.task.producer.service.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestSpringController {

    @Autowired
    private Message message;

//    @GetMapping("/hello")
//    public String hello(){
//        return "message recieve";
//    }

    @PostMapping(value = "/call")
    private String getHelloClient(@RequestBody String product){

        String uri="http://localhost:8080/show";
        System.out.println(product);
        RestTemplate restTemplate= new RestTemplate();
        String result=restTemplate.getForObject(uri,String.class);
        return result;
    }

    @PostMapping(value = "/send")
    public ResponseEntity<?> sendMcg(@RequestBody Sms sms){

//        sendMessage.sendMcg(routeMcg);
        try{
            System.out.println("line 22");
            message.sendMcg(sms);
        }
        catch(Exception e){
            System.out.println("Failed to send mcg");
            return ResponseEntity.ok("Failure");

        }
        return ResponseEntity.ok("Successfuly Sent mcg");
    }

}
