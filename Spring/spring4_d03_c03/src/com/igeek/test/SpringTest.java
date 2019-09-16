package com.igeek.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.igeek.dao.BookDao;
import com.igeek.domain.Book;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class SpringTest {
	//����dao
	@Autowired
	private BookDao bookDao;
	
	/**�������*/
	@Test
	public void testSave(){
		Book book = new Book();
		book.setName("��������");
		book.setPrice(1998d);
		bookDao.save(book);
	}
	
	/**���²���*/
	@Test
	public void testUpdate(){
		Book book = new Book();
		book.setId(1);
		book.setName("����ʮ����");
		book.setPrice(298d);
		bookDao.update(book);
	}
	
	/**�������*/
	@Test
	public void testDelete(){
		Book book = new Book();
		book.setId(2);
		bookDao.delete(book);
	}
	
	/**ʹ������ID��ѯ����*/
	@Test
	public void testFindById(){
		Integer id = 3;
		Book book = bookDao.findById(id);
		System.out.println(book);
	}
		
	/**��ѯ����*/
	@Test
	public void testFindAll(){
		List<Book> list = bookDao.findAll();
		System.out.println(list);
	}

	/**��ѯ������ѯ����*/
	@Test
	public void testFindCondition(){
		Book book = new Book();
		book.setName("��������");
		book.setPrice(1998d);
		List<Book> list = bookDao.findByCondition(book);
		System.out.println(list);
	}
}