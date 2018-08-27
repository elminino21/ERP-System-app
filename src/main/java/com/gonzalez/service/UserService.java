package com.gonzalez.service;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gonzalez.dto.UserDto;
import com.gonzalez.entities.PasswordReset;
import com.gonzalez.entities.User;
import com.gonzalez.entities.Verification;
import com.gonzalez.repository.UserRepository;
import com.gonzalez.repository.ValidationRepository;
import com.gonzalez.web.error.UserAlreadyExistException;

/**
 * 
 * @author elminino
 *
 */
@Service
@Transactional
public class UserService implements IUserSevirce {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ValidationRepository validationRepo;

	
	 public static final String TOKEN_INVALID = "invalidToken";
	 public static final String TOKEN_EXPIRED = "expired";
	 public static final String TOKEN_VALID = "valid";
     public static String QR_PREFIX = "https://chart.googleapis.com/chart?chs=200x200&chld=M%%7C0&cht=qr&chl=";
	 public static String APP_NAME = "ERP System";

	
	@Override
	public User registerNewUserAccount(UserDto accountDto) throws UserAlreadyExistException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUser(String verificationToken) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveRegisteredUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createVerificationTokenForUser(User user, String token) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Verification getVerificationToken(String VerificationToken) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Verification generateNewVerificationToken(String token) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createPasswordResetTokenForUser(User user, String token) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User findUserByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PasswordReset getPasswordResetToken(String token) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByPasswordResetToken(String token) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<User> getUserByID(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void changeUserPassword(User user, String password) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean checkIfValidOldPassword(User user, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String validateVerificationToken(String token) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String generateQRUrl(User user) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUser2FA(boolean use2fa) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getUsersFromSessionRegistry() {
		// TODO Auto-generated method stub
		return null;
	}

}
