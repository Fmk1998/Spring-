package com.igeek.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.igeek.domain.Book;

public class BookRowMapper implements RowMapper<Book>{
	//参数1：自动将查询出来的结果集传进来
	//返回是：封装好的数据对象
	@Override
	public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
		Book book = new Book();
		//取当前指针的结果集
		book.setId(rs.getInt(1));
		book.setName(rs.getString(2));
		book.setPrice(rs.getDouble(3));
		return book;
	}
}
