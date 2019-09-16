package com.igeek.dao;

import java.util.List;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.igeek.domain.Book;

//ͼ�������dao��
//JdbcDaoSupport��JdbcTemplate�Ĵ��뿪����
public class BookDao extends JdbcDaoSupport {
	
	//ע��jdbctempate
//	private JdbcTemplate jdbcTemplate;
//	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
//		this.jdbcTemplate = jdbcTemplate;
//	}

	//����ͼ��
	public void save(Book book){
		String sql="insert into book values(null,?,?)";
		//����jdbctemplate
//		jdbcTemplate.update(sql, book.getName(),book.getPrice());
		super.getJdbcTemplate().update(sql, book.getName(),book.getPrice());
	}
	
	//����
	public void update(Book book){
		String sql="update book set name =? ,price =? where id =?";
		super.getJdbcTemplate().update(sql, book.getName(),book.getPrice(),book.getId());
	}
	
	//ɾ��
	public void delete(Book book){
		super.getJdbcTemplate().update("delete from book where id =?", book.getId());
	}
	
	//����id��ѯһ��
	public Book findById(Integer id){
		return super.getJdbcTemplate().queryForObject("select * from book where id =?",  new BookRowMapper(),id);
    }
	
	//��ѯ����
	public List<Book> findAll(){
		return super.getJdbcTemplate().query("select * from book", new BookRowMapper());
	}
			
	//����������ѯ�б�
	public List<Book> findByCondition(Book book){
        return super.getJdbcTemplate().query("select * from book where name like ? and price =?", new BookRowMapper(), "%"+book.getName()+"%",book.getPrice());
		
	}	

}