package demo.service.impl;

import demo.mapper.DemoNamePOMapper;
import demo.po.DemoNamePO;
import demo.service.DemoNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoNameServiceImpl implements DemoNameService {

    @Autowired
    private DemoNamePOMapper demoNamePOMapper;

    @Override
    public DemoNamePO getById(Long id) {
        return demoNamePOMapper.selectByPrimaryKey(id);
    }

    @Override
    public int add(DemoNamePO demoNamePO) {
        return demoNamePOMapper.insert(demoNamePO);
    }
}
