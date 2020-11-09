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
public class StationDAO extends DAO<Station> {
	private ConvertJSON converter = new ConvertJSON();
	@Override
	public boolean insert(String device, Connection connection) {

		PreparedStatement preparedStatement = null;
		Station station = converter.StationtoJson(device);

		try {
			preparedStatement = connection.prepareStatement("INSERT INTO Station(id, name, address) VALUES(?, ?, ?)");

			preparedStatement.setInt(1, station.getId());
			preparedStatement.setString(2, station.getName());
			preparedStatement.setString(3, station.getAddress());

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
		Station station = converter.StationtoJson(device);
		try {

			preparedStatement = connection.prepareStatement("DELETE FROM station WHERE id = ?");

			preparedStatement.setInt(1, station.getId());
			preparedStatement.executeUpdate();

			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}}

	@Override
	public boolean update(String device, Connection connection) {
		return true;
		// On update pas une station pour le moment (l'adresse ne change pas, le nom non plus)
	}

	@Override
	public ArrayList<String> select(Connection connection) {
		ArrayList<String> list = new ArrayList<String>();
		try {
			Statement myRequest = connection.createStatement();
			ResultSet result = myRequest.executeQuery("SELECT * FROM station");

			while(result.next()) {
				Station station = new Station();

				station.setId(result.getInt(1));
				station.setName(result.getString(2));
				station.setAddress(result.getString(3));


				String json = converter.JsontoStation(station);
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
