package com.cards.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cards.model.CreditCard;
import com.cards.repository.CreditCardRepository;

public class CreditCardServiceImpl implements CreditCardService {

	@Autowired
	private CreditCardRepository creditCardRepository;

	@Override
	public CreditCard addCreditCard(CreditCard creditCard) {
		return creditCardRepository.save(creditCard);

	}

	@Override
	public List<CreditCard> getAllCreditCards() {

		List<CreditCard> foundCards = new ArrayList<>();
		creditCardRepository.findAll().forEach(foundCards::add);
		return foundCards;
	}

}
