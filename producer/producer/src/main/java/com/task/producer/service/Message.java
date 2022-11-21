package com.task.producer.service;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.task.producer.model.Sms;
import com.task.producer.utils.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class Message {

    public String sendMcg(Sms sms) {
        Logger log = LoggerFactory.getLogger(Message.class);

        try {
            System.out.println("service class line 28");
            System.out.println("Body "+sms);
            String body = "{" +
                    "\"msisdn\" : " + "\"" + sms.getMsisdn()+ "\" ,"+
                    "\"smsId\" : " + "\"" + sms.getSmsId()+ "\" ,"+
            "\"shortcode\" : " + "\"" + sms.getShortcode()+ "\" ,"+
            "\"smsData\" : " + "\"" + sms.getSmsData()+ "\" ," +
            "\"connectionPointId\" : "  + sms.getConnectionPointId()+ " }";
            System.out.println("Request Body "  +body);
            HttpResponse<String> response1 = Unirest.post(Constants.MCGURL)
                    .header("Content-Type", "application/json")
                    .body(body)
                            .asString();

            System.out.println(response1.getBody());
            System.out.println("service class line 36");
            log.info("Response From mcg for msisdn is   " +  sms.getMsisdn());


        } catch (Exception e) {
            log.info("Exception Sending message: "+e.getMessage() +" for id "+ sms.getMsisdn());

            e.printStackTrace();
            return "error occured";
        }
        return "Success";
    }
}
