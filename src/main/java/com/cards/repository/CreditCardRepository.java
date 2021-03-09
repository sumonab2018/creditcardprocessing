package com.cards.repository;

import org.springframework.data.repository.CrudRepository;

import com.cards.model.CreditCard;

public interface CreditCardRepository extends CrudRepository<CreditCard,Integer> {

}
