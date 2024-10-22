package org.zkoss.simple;

import org.springframework.stereotype.Repository;

/**
 * Dummy DAO class sample.
 * @author Hawk
 *
 */
@Repository
public class RegistrationDao {

	public void add(User user){
		System.out.printf("User %s is added\n", user.getName());
	}
}
