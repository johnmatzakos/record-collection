package com.recordcollection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.recordcollection.domains.DomainObject;
import com.recordcollection.domains.Record;

import java.util.List;

/**
 * Created by Ioannis Matzakos on 26/03/2019.
 */

@Service
@Profile("map")
public class RecordServiceImpl extends AbstractMapService implements RecordService{
	
    @Override
    public List<DomainObject> listAll() {
        return super.listAll();
    }

    @Override
    public Record getById(Integer id) {
        return (Record) super.getById(id);
    }
	
    @Override
    public Record saveOrUpdate(Record domainObject) {
    	return (Record) super.saveOrUpdate(domainObject);
    }
    
    @Override
    public void delete(Integer id) {
    	super.delete(id);
    }
}