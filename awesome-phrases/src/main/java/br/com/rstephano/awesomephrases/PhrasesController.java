package br.com.rstephano.awesomephrases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.discovery.EurekaClient;

@RestController
public class PhrasesController {

  @Autowired
  @Lazy
  private EurekaClient eurekaClient;

  @Value("${spring.application.name}")
  private String appName;

  @RequestMapping("/greeting")
  String greeting() {
    System.out.println("Chamou aqui!");
    return String.format("Hello from '%s'!", eurekaClient.getApplication(appName).getName());
  }

}
