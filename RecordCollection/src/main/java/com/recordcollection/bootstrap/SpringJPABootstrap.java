package com.recordcollection.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.recordcollection.domains.Record;
import com.recordcollection.services.RecordService;

@Component
public class SpringJPABootstrap implements ApplicationListener<ContextRefreshedEvent>{
	
	private RecordService recordService;

    @Autowired
    public void setRecordService(RecordService recordService) {
        this.recordService = recordService;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        loadRecords();

    }
    
    public void loadRecords(){

        Record record1 = new Record();
        record1.setArtist("Rory Gallagher");
        record1.setAlbum("Tatoo");
        record1.setYear(1973);
        recordService.saveOrUpdate(record1);

        Record record2 = new Record();
        record2.setArtist("Pink Floyd");
        record2.setAlbum("The Dark Side Of The Moon");
        record2.setYear(1973);
        recordService.saveOrUpdate(record2);

        Record record3 = new Record();
        record3.setArtist("Thin Lizzy");
        record3.setAlbum("Thunder And Lightning");
        record3.setYear(1983);
        recordService.saveOrUpdate(record3);

        Record record4 = new Record();
        record4.setArtist("Dire Straits");
        record4.setAlbum("Dire Straits");
        record4.setYear(1978);
        recordService.saveOrUpdate(record4);

    }
}