package com.simple.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.simple.command.ScoreVO;

@Repository("scoreDAO")
public class ScoreDAOImpl implements ScoreDAO {
	
	@Autowired
	private DataSource dataSource;

	@Override
	public void regist(ScoreVO vo) {
		// JDBC기본문법으로 insert ->
		// Connection conn = DriverManager.getConnection()
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		
		try {
			// insert
			String sql = "insert into score values(score_seq.nextval, ?, ?, ?, ?)"; 
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getKor());
			pstmt.setString(3, vo.getEng());
			pstmt.setString(4, vo.getMath());
			
			pstmt.execute();
			System.out.println("성공?");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) conn.close();
				if(pstmt != null) pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
		
		
		
	}

	
	
	
}
