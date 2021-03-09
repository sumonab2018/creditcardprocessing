package com.cards.service;

import java.util.List;
import com.cards.model.CreditCard;
import org.springframework.stereotype.Service;

@Service
public interface CreditCardService {
	
	public CreditCard addCreditCard(CreditCard creditCard);
	
	public List<CreditCard> getAllCreditCards();

}
