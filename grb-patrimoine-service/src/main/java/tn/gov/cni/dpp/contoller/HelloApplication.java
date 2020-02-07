package tn.gov.cni.dpp.contoller;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApplication {
	private static Logger log = LoggerFactory.getLogger(HelloApplication.class);
	@Value("${server.port}")
	private int port;

	@RequestMapping(value = "/greeting")
	public String greet() {
		log.info("Access /greeting");
		List<String> greetings = Arrays.asList("Hi there", "Greetings", "Salutations");
		Random rand = new Random();
		int randomNum = rand.nextInt(greetings.size());
		System.out.println(port);
		return greetings.get(randomNum);
	}

	@RequestMapping(value = "/")
	public String home() {
		log.info("Access /");
		return "Hi!"+port;
	}

}