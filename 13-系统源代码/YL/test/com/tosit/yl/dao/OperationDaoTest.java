package com.tosit.yl.dao;

import com.tosit.yl.entity.Operation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/6/30.
 */
public class OperationDaoTest {

        @Resource
        private OperationDao operationDao;
        @Test
        public void queryById() {
            int id = 1;
            Operation operation= operationDao.queryById(id);
            System.out.println(operation);
            // System.out.println(operation.toString());
        }
        @Test
        public void queryAll(){
            List<Operation> operations= operationDao.queryAll(0,100);
            for(Operation operation:operations){
                System.out.println(operation);
            }
        }
        @Test
        public void update(){
            Operation operation=new Operation();
            operation.setOpId(1);
            operation.setMrId(2);
            operation.setOpType("剖腹产手术");
            operation.setOpTime(new Date());
            operation.setOpPlace("1-101");
            operation.setOpStatue(0);
            operationDao.update(operation);
            queryAll();
        }
        @Test
        public void deleteById(){
            Operation operation=new Operation();
            operation.setOpId(123);
            operationDao.deleteById(123);
        }
        public void insert(){
            Operation operation=new Operation();
            operation.setOpId(1);
            operation.setMrId(2);
            operation.setOpType("剖腹产手术");
            operation.setOpTime(new Date());
            operation.setOpPlace("1-101");
            operation.setOpStatue(0);
            operationDao.insert(operation);
            queryAll();
        }
    }


