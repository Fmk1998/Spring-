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
	//测试dao
	@Autowired
	private BookDao bookDao;
	
	/**保存测试*/
	@Test
	public void testSave(){
		Book book = new Book();
		book.setName("如来神掌");
		book.setPrice(1998d);
		bookDao.save(book);
	}
	
	/**更新测试*/
	@Test
	public void testUpdate(){
		Book book = new Book();
		book.setId(1);
		book.setName("降龙十八掌");
		book.setPrice(298d);
		bookDao.update(book);
	}
	
	/**保存更新*/
	@Test
	public void testDelete(){
		Book book = new Book();
		book.setId(2);
		bookDao.delete(book);
	}
	
	/**使用主键ID查询测试*/
	@Test
	public void testFindById(){
		Integer id = 3;
		Book book = bookDao.findById(id);
		System.out.println(book);
	}
		
	/**查询测试*/
	@Test
	public void testFindAll(){
		List<Book> list = bookDao.findAll();
		System.out.println(list);
	}

	/**查询条件查询测试*/
	@Test
	public void testFindCondition(){
		Book book = new Book();
		book.setName("如来神掌");
		book.setPrice(1998d);
		List<Book> list = bookDao.findByCondition(book);
		System.out.println(list);
	}
}