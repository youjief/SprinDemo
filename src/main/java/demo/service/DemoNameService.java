package demo.service;

import demo.po.DemoNamePO;

public interface DemoNameService {


    DemoNamePO getById(Long id);


    int add(DemoNamePO demoNamePO);
}


