package com.tensquare.base.service;

import com.tensquare.base.dao.LabelDao;
import com.tensquare.base.entity.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import util.IdWorker;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class LabelService {

    @Autowired
    private LabelDao labelDao;
    @Autowired
    private IdWorker idWorker;

    public List<Label> findAll(){
        return labelDao.findAll();
    }

    public Label findById(String id) {
        return labelDao.findById(id).orElse(null);
    }

    public void save(Label label){
        label.setId(idWorker.nextId() + "");
        labelDao.save(label);
    }

    public void update(Label label){
        labelDao.save(label);
    }

    public void delete(String id){
        labelDao.deleteById(id);
    }
}
