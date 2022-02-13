package com.Ashok.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Ashok.bean.Contact;

@RestController
public class ContactServiceImpl  {
    
	/*@Autowired
	private ContactRepository repository;
	*/
	@GetMapping("/stu")
	public Contact saveContact() {
		Contact c=new Contact();
		c.setContactId(101);
		c.setContactName("vijay");
		c.setContactNumber("52525252");
		c.setContactEmail("abc@gmail.com");
		
		/*Optional<ContactEntity> findbyid=repository.findById(c.getContactId());
		
		if(findbyid!=null) {
		
			entity=findbyid.get();
			
			}
		else {
			
			entity=new ContactEntity();
		}*/
		/*entity=new ContactEntity();
		BeanUtils.copyProperties(c, entity);
		ContactEntity SaveEntity=repository.save(entity);*/
		return c;
	}

	
	/*public List<Contact> getAllContact() {
		List<ContactEntity> getcontact=repository.findAll();
		
		List<Contact> list=new ArrayList<>();
		for (ContactEntity contactEntity : getcontact) {
			Contact c1=new Contact();
			BeanUtils.copyProperties(contactEntity, c1);
			list.add(c1);
		}
		return list;
	}
	
	
	public Contact getContactById(Integer cid) {
	Optional<ContactEntity> entity=	repository.findById(cid);
	if(entity.isPres
	ent()) {
		ContactEntity entity2=entity.get();
		System.out.println(entity2);
		Contact c2=new Contact();
		BeanUtils.copyProperties(entity2, c2);
		return c2;
	}
		return null;
	}
	
	
	public boolean deleteContant(Integer cid) {
		repository.deleteById(cid);
		return true;
	}*/

	
	
}
