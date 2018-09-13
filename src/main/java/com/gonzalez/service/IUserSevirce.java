package com.gonzalez.service;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Optional;

import com.gonzalez.dto.UserDto;
import com.gonzalez.entities.PasswordReset;
import com.gonzalez.entities.User;
import com.gonzalez.entities.Verification;
import com.gonzalez.web.error.UserAlreadyExistException;

public interface IUserSevirce {
	
	
	
	User registerNewUserAccount(UserDto accountDto) throws UserAlreadyExistException;

    User getUser(String verificationToken);

    void saveRegisteredUser(User user);

    void deleteUser(User user);

    void createVerificationTokenForUser(User user, String token);

    Verification getVerificationToken(String VerificationToken);

    Verification generateNewVerificationToken(String token);

    void createPasswordResetTokenForUser(User user, String token);

    User findUserByEmail(String email);

    PasswordReset getPasswordResetToken(String token);

    User getUserByPasswordResetToken(String token);

    Optional<User> getUserByID(long id);

    void changeUserPassword(User user, String password);

    boolean checkIfValidOldPassword(User user, String password);

    String validateVerificationToken(String token);


    List<String> getUsersFromSessionRegistry();

}
