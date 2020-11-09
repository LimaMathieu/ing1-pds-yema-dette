package server;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import common.Car;
import common.ConvertJSON;
import common.DeviceAir;
import connection.PropertiesFileReader;
import tramway.Station;
import tramway.Tramway;
/**
 * 
 * this class launch the server with multi port
 *
 */
public class TramwayDAO extends DAO<Tramway> {
	private ConvertJSON converter = new ConvertJSON();
	@Override
	public boolean insert(String device, Connection connection) {

		PreparedStatement preparedStatement = null;
		Tramway tramway = converter.TramwaytoJson(device);

		try {
			preparedStatement = connection.prepareStatement("INSERT INTO Tramway(id, maxCapacity, state) VALUES(?, ?, ?)");

			preparedStatement.setInt(1, tramway.getId());
			preparedStatement.setInt(2, tramway.getMaxCapacity());
			preparedStatement.setString(3, tramway.getState());

			preparedStatement.executeUpdate();

			return true; 	
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean delete(String device, Connection connection) {
		PreparedStatement preparedStatement = null;
		Tramway tramway = converter.TramwaytoJson(device);
		try {

			preparedStatement = connection.prepareStatement("DELETE FROM tramway WHERE id = ?");

			preparedStatement.setInt(1, tramway.getId());
			preparedStatement.executeUpdate();

			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}}

	@Override
	public boolean update(String device, Connection connection) {
		PreparedStatement preparedStatement = null;
		Tramway tramway = converter.TramwaytoJson(device);
		try {
			preparedStatement = connection.prepareStatement("UPDATE tramway SET state = ? WHERE id = ?");
			preparedStatement.setInt(1, tramway.getId());

			preparedStatement.setString(2, tramway.getState());



			preparedStatement.executeUpdate();

			return true;
		} catch (SQLException e) {e.printStackTrace();}

		return false;
	}

	@Override
	public ArrayList<String> select(Connection connection) {
		ArrayList<String> list = new ArrayList<String>();
		try {
			Statement myRequest = connection.createStatement();
			ResultSet result = myRequest.executeQuery("SELECT * FROM tramway");

			while(result.next()) {
				Tramway tram = new Tramway();

				tram.setId(result.getInt(1));
				tram.setMaxCapacity(result.getInt(2));
				tram.setState(result.getString(3));


				String json = converter.JsontoTramway(tram);
				list.add(json);
			}

			return list;
		} catch (SQLException e) {
			e.printStackTrace(); }

		return list;
	}

	@Override
	public ArrayList<String> selectID(String id, Connection connection) {
		// TODO Auto-generated method stub
		return null;
	}


}
