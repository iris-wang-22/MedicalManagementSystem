package com.tosit.yl.dao;

import com.tosit.yl.entity.Opma;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/6/30.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class OpmaDaoTest {
    @Resource
    private OpmaDao opmadao;
    @Test
    public void queryByUserId() {
        int id = 1;
        Opma opma = opmadao.queryByUserId(id);
        System.out.println(opma);
        // System.out.println(opma.toString());
    }
    @Test
    public void queryAll(){
        List<Opma> opmas = opmadao.queryAll(0,100);
        for(Opma opma:opmas){
            System.out.println(opma);
        }
    }
    @Test
    public void update(){
        Opma opma=new Opma();
        opma.setUserId(12345);
        opma.setOpId(1212);
        opmadao.update(opma);
        queryAll();
    }
    @Test
    public void insert(){
        Opma opma=new Opma();
        opma.setUserId(12345);
        opma.setOpId(1212);
        opmadao.insert(opma);
        queryAll();
    }
    @Test
    public void deleteByUserId(){
        Opma opma=new Opma();
        opma.setOpId(3);
        opmadao.deleteByOpId(3);
    }

}
