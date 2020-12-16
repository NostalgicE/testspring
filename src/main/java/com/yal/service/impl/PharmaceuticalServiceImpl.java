package com.yal.service.impl;

import com.yal.dao.PharmaceuticalMapper;
import com.yal.pojo.Pharmaceutical;
import com.yal.service.PharmaceuticalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PharmaceuticalServiceImpl implements PharmaceuticalService {

    @Autowired
    PharmaceuticalMapper pharmaceuticalMapper;

    @Override
    public Pharmaceutical selectByPrimaryKey(Integer id) {
        return pharmaceuticalMapper.selectByPrimaryKey(id);
    }
}
