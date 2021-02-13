package HastaneOtamasyonu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class LoginRegisterDao implements IDbConnectionInterface<LoginRegisterDto> {

	@Override
	public void create(LoginRegisterDto loginRegisterDto) {
		try (Connection connection = getInterfaceConnection()) {
			String sql = "insert into admin4(name_surname,email_address,password) values(?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, loginRegisterDto.getNameSurname());
			preparedStatement.setString(2, loginRegisterDto.getEmailAddress());
			preparedStatement.setString(3, loginRegisterDto.getPassword());
			int rowsAffected = preparedStatement.executeUpdate();
			if (rowsAffected > 0) {
				System.out.println("Ekleme Başarılı");
			} else {
				System.out.println("Ekleme yapılmadı .....");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void update(LoginRegisterDto loginRegisterDto) {
		try (Connection connection = getInterfaceConnection()) {
			String sql = "update  admin4 set name_surname=?,email_address=?,password=? where id=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, loginRegisterDto.getNameSurname());
			preparedStatement.setString(2, loginRegisterDto.getEmailAddress());
			preparedStatement.setString(3, loginRegisterDto.getPassword());
			preparedStatement.setLong(4, loginRegisterDto.getId());
			int rowsAffected = preparedStatement.executeUpdate();
			if (rowsAffected > 0) {
				System.out.println("Güncelleme Başarılı");
			} else {
				System.out.println("Güncelleme yapılmadı .....");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void delete(LoginRegisterDto loginRegisterDto) {
		try (Connection connection = getInterfaceConnection()) {
			String sql = "delete from  admin4  where id=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setLong(1, loginRegisterDto.getId());
			int rowsAffected = preparedStatement.executeUpdate();
			if (rowsAffected > 0) {
				System.out.println("Silme Başarılı");
			} else {
				System.out.println("Silme yapılmadı .....");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public ArrayList<LoginRegisterDto> list() {
		ArrayList<LoginRegisterDto> list44 = new ArrayList<LoginRegisterDto>();
		LoginRegisterDto loginRegisterDto;
		try (Connection connection = getInterfaceConnection()) {
			String sql = "select * from  admin4";

			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				loginRegisterDto = new LoginRegisterDto();
				loginRegisterDto.setId(resultSet.getLong("id"));
				loginRegisterDto.setNameSurname(resultSet.getString("name_surname"));
				loginRegisterDto.setPassword(resultSet.getString("password"));
				loginRegisterDto.setEmailAddress(resultSet.getString("email_address"));
				list44.add(loginRegisterDto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list44;
	}

}
