package com.gonzalez.service;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Optional;

import com.gonzalez.dto.ItemDto;
import com.gonzalez.entities.Item;
import com.gonzalez.entities.PasswordReset;
import com.gonzalez.entities.User;
import com.gonzalez.entities.Verification;
import com.gonzalez.web.error.ItemAlreadyExitsException;

public interface IItemService {
	
	Item registerNewItem(ItemDto itemDto) throws ItemAlreadyExitsException;

	Item getUser(String verificationToken);

    void saveItem(Item item);

    void deleteItemr(User item);

    void createVerificationTokenForUser(User user, String token);

    Verification getVerificationToken(String VerificationToken);

    Verification generateNewVerificationToken(String token);

  

    User findItemByPart(String item);

    

    Optional<Item> getItemByID(long id);

    String validateVerificationToken(String token);



}
