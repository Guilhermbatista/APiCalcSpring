package com.apiWeb.courseApi;

//import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.apiWeb.courseApi.entities.Matematica;
import com.apiWeb.courseApi.entities.SimpleMath;
import com.apiWeb.courseApi.exceptions.UnsupportedMathOperationException;

@RestController
public class MathController {

	// private final AtomicLong counter = new AtomicLong();

	private SimpleMath simpleMath = new SimpleMath();

	@RequestMapping(value = "/sum/{n1}/{n2}", method = RequestMethod.GET)
	public Double sum(@PathVariable(value = "n1") String n1, @PathVariable(value = "n2") String n2) throws Exception {

		if (!Matematica.IsNumeric(n1) || !Matematica.IsNumeric(n2)) {
			throw new UnsupportedMathOperationException("Please set a numeric value");
		}

		return simpleMath.sum(Matematica.convertToDouble(n1), Matematica.convertToDouble(n2));
	}

	@RequestMapping(value = "/sub/{n1}/{n2}", method = RequestMethod.GET)
	public Double sub(@PathVariable(value = "n1") String n1, @PathVariable(value = "n2") String n2) throws Exception {

		if (!Matematica.IsNumeric(n1) || !Matematica.IsNumeric(n2)) {
			throw new UnsupportedMathOperationException("Please set a numeric value");
		}

		return simpleMath.subtraction(Matematica.convertToDouble(n1), Matematica.convertToDouble(n2));
	}

	@RequestMapping(value = "/multi/{n1}/{n2}", method = RequestMethod.GET)
	public Double multi(@PathVariable(value = "n1") String n1, @PathVariable(value = "n2") String n2) throws Exception {

		if (!Matematica.IsNumeric(n1) || !Matematica.IsNumeric(n2)) {
			throw new UnsupportedMathOperationException("Please set a numeric value");
		}

		return simpleMath.multiplication(Matematica.convertToDouble(n1), Matematica.convertToDouble(n2));
	}

	@RequestMapping(value = "/div/{n1}/{n2}", method = RequestMethod.GET)
	public Double div(@PathVariable(value = "n1") String n1, @PathVariable(value = "n2") String n2) throws Exception {

		if (!Matematica.IsNumeric(n1) || !Matematica.IsNumeric(n2)) {
			throw new UnsupportedMathOperationException("Please set a numeric value");
		}

		return simpleMath.division(Matematica.convertToDouble(n1), Matematica.convertToDouble(n2));
	}

	@RequestMapping(value = "/media/{n1}/{n2}", method = RequestMethod.GET)
	public Double media(@PathVariable(value = "n1") String n1, @PathVariable(value = "n2") String n2) throws Exception {

		if (!Matematica.IsNumeric(n1) || !Matematica.IsNumeric(n2)) {
			throw new UnsupportedMathOperationException("Please set a numeric value");
		}

		return simpleMath.mean(Matematica.convertToDouble(n1), Matematica.convertToDouble(n2));
	}

	@RequestMapping(value = "/raiz/{n1}", method = RequestMethod.GET)
	public Double raiz(@PathVariable(value = "n1") String n1) throws Exception {

		if (!Matematica.IsNumeric(n1)) {
			throw new UnsupportedMathOperationException("Please set a numeric value");
		}

		return simpleMath.squareRoot(Matematica.convertToDouble(n1));
	}

}
