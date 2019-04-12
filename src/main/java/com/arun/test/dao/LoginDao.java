package com.arun.test.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.arun.test.beans.*;

public class LoginDao {
	JdbcTemplate templatelogin;

	public void setTemplatelogin(JdbcTemplate templatelogin) {
		this.templatelogin = templatelogin;
	}

	public String validate(String username, String password) {
		System.out.println(username + " : " + password);
		String sql = "select usertype from login where username = '" + username + "'  and password =  '" + password
				+ "' ";
		System.out.println(sql);
		String username1 = "";
		try {
			username1 = (String) templatelogin.queryForObject(sql, String.class);
		} catch (Exception r) {
			System.out.println(r);
			username1 = "DNE";
		}

		System.out.println(username1);
		return username1;
	}
}
