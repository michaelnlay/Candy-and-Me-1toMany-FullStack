package com.ml.fullcrud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ml.fullcrud.models.Owner;
import com.ml.fullcrud.repositories.OwnerRepository;

@Service
public class OwnerService {

	 private final OwnerRepository ownerRepo;
	 
	    //CONSTRUCTOR===============================================
	    
	    public OwnerService(OwnerRepository ownerRepo) {
			super();
			this.ownerRepo = ownerRepo;
		}
	    
	    //Find all the Owners
	    public List<Owner>allOwners(){
	    	return ownerRepo.findAll();
	    }
	    
	    //Create an Owner
	    public Owner createOwner(Owner owner) {
	    	return ownerRepo.save(owner);
	    }
	 
	  //FIND ONE Owner FROM REPO
	    public Owner findOwner(Long id) {
	    	Optional<Owner> optOwner = ownerRepo.findById(id);
	    	if(optOwner.isPresent()) {
	    		return optOwner.get();
	    		
	    	}else {
	    			return null;
	    		}
	    	}
	 
	 
	 
	  
}
