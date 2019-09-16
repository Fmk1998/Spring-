package com.igeek.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.igeek.domain.Book;

public class BookRowMapper implements RowMapper<Book>{
	//����1���Զ�����ѯ�����Ľ����������
	//�����ǣ���װ�õ����ݶ���
	@Override
	public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
		Book book = new Book();
		//ȡ��ǰָ��Ľ����
		book.setId(rs.getInt(1));
		book.setName(rs.getString(2));
		book.setPrice(rs.getDouble(3));
		return book;
	}
}
