package br.com.recoleta.app.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserRegistrationDto {
	
	private String firstName;
	private String lastName;
	private String email;
	private String password;
<<<<<<< HEAD
	private String userType;

=======
	private String userType;  // Add this field for user type
>>>>>>> 31d422dbc403caee28ac0676ff0faac4ff76180f
}
