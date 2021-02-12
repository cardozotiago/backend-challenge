/**
 * 
 */
package br.com.iti.backendchallenge.service.impl;

import org.springframework.stereotype.Service;

import br.com.iti.backendchallenge.service.PasswordService;

/**
 * @author tiago
 * @date 2021-02-10
 */
@Service
public class PasswordServiceImpl implements PasswordService {

	@Override
	public Boolean isPasswordValid(String password) {

		String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{9,}$";
		String replacedPassword = password.replaceAll(" ", "+");
		if (password.matches(regex)) {
			for (int i = 0; i < password.length(); i++) {
				for (int j = i + 1; j < password.length(); j++) {
					if (password.charAt(i) == (password.charAt(j))) {
						return false;
					}
				}
			}
		} else {
			return false;
		}
		if (password.equals(replacedPassword)) {
			return true;
		} else {
			return false;
		}
	}

}
