package com.igeek.dao;

import java.util.List;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.igeek.domain.Book;

//图书操作的dao层
//JdbcDaoSupport简化JdbcTemplate的代码开发。
public class BookDao extends JdbcDaoSupport {
	
	//注入jdbctempate
//	private JdbcTemplate jdbcTemplate;
//	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
//		this.jdbcTemplate = jdbcTemplate;
//	}

	//保存图书
	public void save(Book book){
		String sql="insert into book values(null,?,?)";
		//调用jdbctemplate
//		jdbcTemplate.update(sql, book.getName(),book.getPrice());
		super.getJdbcTemplate().update(sql, book.getName(),book.getPrice());
	}
	
	//更新
	public void update(Book book){
		String sql="update book set name =? ,price =? where id =?";
		super.getJdbcTemplate().update(sql, book.getName(),book.getPrice(),book.getId());
	}
	
	//删除
	public void delete(Book book){
		super.getJdbcTemplate().update("delete from book where id =?", book.getId());
	}
	
	//根据id查询一个
	public Book findById(Integer id){
		return super.getJdbcTemplate().queryForObject("select * from book where id =?",  new BookRowMapper(),id);
    }
	
	//查询所有
	public List<Book> findAll(){
		return super.getJdbcTemplate().query("select * from book", new BookRowMapper());
	}
			
	//复杂条件查询列表
	public List<Book> findByCondition(Book book){
        return super.getJdbcTemplate().query("select * from book where name like ? and price =?", new BookRowMapper(), "%"+book.getName()+"%",book.getPrice());
		
	}	

}