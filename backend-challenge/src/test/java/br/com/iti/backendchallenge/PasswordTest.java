/**
 * 
 */
package br.com.iti.backendchallenge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.iti.backendchallenge.service.PasswordService;

/**
 * @author tiago
 * @date 2021-02-11
 */
@SpringBootTest
public class PasswordTest {

	@Autowired
	private PasswordService passwordService;

	@Test
	public void validatePasswordBlank() {
		String password = "Abcf+186 i";
		Assertions.assertFalse(passwordService.isPasswordValid(password));
	}

	@Test
	public void validatePasswordMinLengh() {
		String password = "foguE+189";
		Assertions.assertTrue(passwordService.isPasswordValid(password));
	}

	@Test
	public void validatePasswordAtLeastOneDigit() {
		String password = "mnHpqty#r1";
		Assertions.assertTrue(passwordService.isPasswordValid(password));
	}

	@Test
	public void validatePasswordAtLeastOneLetterLowerCase() {
		String password = "bcdF19208?";
		Assertions.assertTrue(passwordService.isPasswordValid(password));
	}

	@Test
	public void validatePasswordAtLeastOneLetterUpperCase() {
		String password = "bRasil8*97";
		Assertions.assertTrue(passwordService.isPasswordValid(password));
	}

	@Test
	public void validatePasswordWithoutSpecialCharacter() {
		String password = "pWd8765ae2f";
		Assertions.assertFalse(passwordService.isPasswordValid(password));
	}

	@Test
	public void validatePasswordAtLeastOneSpecialCharacter() {
		String password = "pWd8765ae#f";
		Assertions.assertTrue(passwordService.isPasswordValid(password));
	}

	@Test
	public void validatePasswordWithoutRepeatedCharacter() {
		String password = "pwF8765adf";
		Assertions.assertFalse(passwordService.isPasswordValid(password));
	}

}
