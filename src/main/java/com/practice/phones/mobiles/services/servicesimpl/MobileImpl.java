package com.practice.phones.mobiles.services.servicesimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.practice.phones.mobiles.entity.MobileData;
import com.practice.phones.mobiles.repository.MobileRepo;
import com.practice.phones.mobiles.services.MobileServices;


@Service
public class MobileImpl implements MobileServices {
	
	
	private MobileRepo ref;
	
	
	
	public MobileImpl(MobileRepo ref) {
		super();
		this.ref = ref;
	}

	@Override
	public List<MobileData> getAllData() {
		// TODO Auto-generated method stub
		
		
		
		return this.ref.findAll();
	}

	
	@Override
	public MobileData getOneData(Long id) {
		// TODO Auto-generated method stub
		
		Optional<MobileData> obj = this.ref.findById(id);
		
		MobileData  mb = obj.get();
		
		return mb;
	}

	@Override
	public MobileData getSave(MobileData ref1) {
		// TODO Auto-generated method stub
		return ref.save(ref1);
	}
	
	@Override
	public MobileData getByIdMobi(Long id) {
		
		MobileData obj = ref.findById(id).get();
		
		return obj;
	}

	@Override
	public void getDeletById(Long id) {
		// TODO Auto-generated method stub
		
		ref.deleteById(id);
		
	}

}
