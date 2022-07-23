package kapil.docker.ci.test.dockerimagetest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(value = "/docker")
@Slf4j
public class TestController {

	@GetMapping(value = "/")
	public ResponseEntity<String> test() {
		log.debug("inside test()");
		return new ResponseEntity<String>("Test Success 3.0", HttpStatus.OK);
	}

}