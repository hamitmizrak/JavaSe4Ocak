package com.ecodation.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.ecodation.dto.RegisterDto;
import com.ecodation.util.IDbConnection;

public class RegisterDao implements IDbConnection<RegisterDto>{

	@Override
	public void create(RegisterDto registerDto) {
		try(Connection connection=getConnection()) {
			//insert admin2(user_email,user_password) values("info@deneme.com","123456789")
			String sql="insert admin2(user_email,user_password) values(?,?)";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, registerDto.getUserEmail());
			preparedStatement.setString(2, registerDto.getUserPassword());
			int row=preparedStatement.executeUpdate();
			if(row>0) {
				System.out.println("RegisterDto Başarılı bir şekilde eklendi");
			}else {
				System.out.println("RegisterDto ekleme sırasında bir hata meydana geldi.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void update(RegisterDto registerDto) {
		try(Connection connection=getConnection()) {
			//insert admin2(user_email,user_password) values("info@deneme.com","123456789")
			String sql="update admin2 set user_email=?,user_password=? where id="+registerDto.getId();
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, registerDto.getUserEmail());
			preparedStatement.setString(2, registerDto.getUserPassword());
			int row=preparedStatement.executeUpdate();
			if(row>0) {
				System.out.println("RegisterDto Başarılı bir şekilde güncellendi");
			}else {
				System.out.println("RegisterDto güncelleme sırasında bir hata meydana geldi.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete(long id) {
		try(Connection connection=getConnection()) {
			String sql="delete from  admin2  where id=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setLong(1, id);
			int row=preparedStatement.executeUpdate();
			if(row>0) {
				System.out.println("RegisterDto Başarılı bir şekilde silindi");
			}else {
				System.out.println("RegisterDto silindi sırasında bir hata meydana geldi.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public ArrayList<RegisterDto> list() {
		RegisterDto dto;
		ArrayList<RegisterDto> list=new ArrayList<RegisterDto>();
		try(Connection connection=getConnection()) {
			String sql="select * from admin2";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				dto=new RegisterDto();
				dto.setId(resultSet.getLong("id"));
				dto.setUserEmail(resultSet.getString("user_email"));
				dto.setUserPassword(resultSet.getString("user_password"));
				list.add(dto);
			}
			System.out.println("RegisterDto Başarılı bir şekilde listelendi");
		}catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	//user search
	public boolean searchUser(String userName,String userPassword) {
		RegisterDto dto;
		try(Connection connection=getConnection()) {
			String sql="select * from admin2 where user_email=? and user_password=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, userName);
			preparedStatement.setString(2, userPassword);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				dto=new RegisterDto();
				dto.setId(resultSet.getLong("id"));
				dto.setUserEmail(resultSet.getString("user_email"));
				dto.setUserPassword(resultSet.getString("user_password"));
				return true;
			}
			System.out.println("RegisterDto Başarılı bir şekilde listelendi");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
