/**
 * 
 */
package br.com.iti.backendchallenge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.iti.backendchallenge.service.PasswordService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author tiago
 * @date 2021-02-10
 */
@RestController
@Api(value = "Password")
@RequestMapping(value = "/password")
public class PasswordController {

	@Autowired
	private PasswordService passwordService;

	@GetMapping(value = "/validate/{password}")
	@ApiOperation(value = "Check a password is valid")
	public @ResponseBody ResponseEntity<Boolean> isPasswordValid(@PathVariable String password) {
		boolean valid = passwordService.isPasswordValid(password);
		if (valid) {
			return new ResponseEntity<Boolean>(valid, HttpStatus.OK);
		} else {
			return new ResponseEntity<Boolean>(valid, HttpStatus.OK);
		}
	}

}
