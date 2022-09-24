package com.example.demo;

import com.example.demo.Dao.IStudentDao;
import com.example.demo.Entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class StudentDaoTest {
    @Autowired
    private IStudentDao sDao;


    @Test
    public void insertStudent(){
        Student stu = new Student();
        stu.setAge(18);
        stu.setName("asd");
        stu.setPassword("123456");
        stu.setSex(true);
        sDao.save(stu);

    }
    @Test
    public void findStudent(){
        List<Student> stuList = sDao.findAll();
        System.out.println(stuList.size());
    }

    @Test
    public void loginTest(){
        Student stu = sDao.findStudentByNameAndPassword("小明","123456");
        System.out.println(stu.getName());
    }

    @Test
    public void updateNameById(){
        Integer result = sDao.UpdateStudentNameById("小明3",3l);
        System.out.println(result);
    }
}
