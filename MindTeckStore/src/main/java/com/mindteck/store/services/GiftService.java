package com.mindteck.store.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.mindteck.store.repositories.GiftRepository;
import main.java.com.mindteck.store.model.product.Gift;

@Service("giftService")
public class GiftService {
	@Autowired
	GiftRepository giftRepository;	

	// Get Gift by id
	@Transactional
	public Gift getGiftById(Integer id){		
		Gift Gift = giftRepository.getGiftById(id);
		return Gift;
	}		
		
	// Get all Gifts
	@Transactional
	public List<Gift> getAllGifts(){		
		List<Gift> giftList = giftRepository.getAllGifts();
		return giftList;
	}
		
	// Add Gift
	@Transactional
	public boolean add(Gift gift){
		giftRepository.save(gift);
		return true;
	}
	
	// Update Gift
	@Transactional
	public boolean update(Gift gift) {	
		giftRepository.update(gift);
		return true;
	}
			
	// Delete Gift
	@Transactional
	public boolean deleteById(Integer id) {  
		 giftRepository.deleteById(id);
		 return true;
	}  
}