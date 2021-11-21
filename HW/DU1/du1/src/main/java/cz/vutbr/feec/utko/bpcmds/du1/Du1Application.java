package cz.vutbr.feec.utko.bpcmds.du1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@SpringBootApplication
@RestController
public class Du1Application {

	public static void main(String[] args) {
		SpringApplication.run(Du1Application.class, args);
	}

	@GetMapping("/index")
	public String nick(@RequestParam(value = "jmeno", defaultValue = "") String name) {

		ArrayList<String> jmena = new ArrayList<String>();
		jmena.add("Bob");
		jmena.add("Alice");
		jmena.add("Eva");
		jmena.add("Alena");
		jmena.add("Marek");

		if (name != "")
		{
			jmena.add(name);
		}
		String formatedString = jmena.toString()
				.replace(",", "")
				.replace("[", "")
				.replace("]", "")
				.trim();
		return formatedString;
	}
}


