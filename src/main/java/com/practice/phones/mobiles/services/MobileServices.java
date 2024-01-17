package com.practice.phones.mobiles.services;

import java.util.List;

import com.practice.phones.mobiles.entity.MobileData;

public interface MobileServices {
	
	public List<MobileData> getAllData();
	
	public MobileData getOneData(Long id);
	
	public MobileData getSave(MobileData ref1);
	
	public MobileData getByIdMobi(Long id);
	
	public void getDeletById(Long id);
}
