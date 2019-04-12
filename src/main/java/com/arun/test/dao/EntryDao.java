package com.arun.test.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.arun.test.beans.Entry;

public class EntryDao {
	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int save(Entry p) {
		System.out.println(p.getTextentry() + p.getImagepath());
		String sql = "insert into guestentry(text, imagepath, status) values('" + p.getTextentry() + "','" + p.getImagepath()
				+ "', 'P')";
		return template.update(sql);
	}

	public int approve(int id) {
		String sql = "update guestentry set status='A' where id=" + id + "";
		System.out.println(sql);
		return template.update(sql);
	}

	public int reject(int id) {
		String sql = "update guestentry set status='R' where id= " + id + "";
		System.out.println(sql);
		return template.update(sql);
	}

	public int delete(int id) {
		String sql = "delete from guestentry where id=" + id + "";
		return template.update(sql);
	}

	public List<Entry> getEntries() {
		return template.query("select * from guestentry where status = 'P'", new RowMapper<Entry>() {
			public Entry mapRow(ResultSet rs, int row) throws SQLException {
				Entry e = new Entry();
				System.out.print(rs.getInt(1));
				e.setId(rs.getInt(1));
				System.out.print(rs.getString(2));
				e.setTextentry(rs.getString(2));
				System.out.print(rs.getString(3));
				e.setImagepath(rs.getString(3));
				System.out.print(rs.getString(4));
				e.setStatus(rs.getString(4));
				return e;
			}
		});
	}
	
	public List<Entry> getAREntries() {
		return template.query("select * from guestentry where status != 'P'", new RowMapper<Entry>() {
			public Entry mapRow(ResultSet rs, int row) throws SQLException {
				Entry e = new Entry();
				System.out.print(rs.getInt(1));
				e.setId(rs.getInt(1));
				System.out.print(rs.getString(2));
				e.setTextentry(rs.getString(2));
				System.out.print(rs.getString(3));
				e.setImagepath(rs.getString(3));
				System.out.print(rs.getString(4));
				e.setStatus(rs.getString(4));
				return e;
			}
		});
	}
}