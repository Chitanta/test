package com.briup.test;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.briup.mappers.StudentMapper;
import com.briup.pojo.Student;
import com.briup.utils.MyBatisSqlSessionFactory;

public class StudentMapperTest {

	@Test
	public void insertTest() {

		try {
			// 加载配置文件
			InputStream is = Resources
					.getResourceAsStream("mybatis-config.xml");

			// 生成SqlSessionFactory工厂类对象
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
					.build(is);
			// 通过工厂类对象，创建SqlSession
			// 用来动态生成映射接口的实现类
			SqlSession sqlSession = sqlSessionFactory.openSession();
			// 执行操作

			// 创建接口的实现类对象
			StudentMapper studentMapper = sqlSession
					.getMapper(StudentMapper.class);
			Student s = new Student(2, "tom2", "123@briup.com", new Date());
			studentMapper.insertStudent(s);
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public void test() {
		Object o = new Student(1, "tom", "456@briup.com", new Date());
		String fName = "name";
		Class<? extends Object> class1 = o.getClass();
		String methodName = "get" + fName.substring(0, 1).toUpperCase()
				+ fName.substring(1, fName.length());
		System.out.println(methodName);

		try {
			// 获取到对应的方法
			Method method = class1.getMethod(methodName);
			Object oo = method.invoke(o);
			System.out.println(oo);
		} catch (NoSuchMethodException e) {

			e.printStackTrace();
		} catch (SecurityException e) {

			e.printStackTrace();
		} catch (IllegalAccessException e) {

			e.printStackTrace();
		} catch (IllegalArgumentException e) {

			e.printStackTrace();
		} catch (InvocationTargetException e) {

			e.printStackTrace();
		}
	}

	@Test
	public void testFindStundetById() {
		// 获取sqlsession对象
		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		// 执行操作
		// 创建接口实现类对象
		StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
		Student stu = studentMapper.findStudentById(2);
		System.out.println(stu);
	}
	
	public void testDeleteStudent() {
		// 获取sqlsession对象
		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		
		//执行操作
		// 创建接口实现类的对象
		StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
		studentMapper.deleteStudent(1);
		sqlSession.commit();
	}
}
