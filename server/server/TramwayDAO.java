package server;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import common.DeviceAir;
import connection.PropertiesFileReader;
import tramway.Tramway;
/**
 * 
 * this class launch the server with multi port
 *
 */
public class TramwayDAO extends DAO<Tramway> {
public static void main (String[] args) {
		
		
		
	}

@Override
public boolean insert(String obj, Connection connection) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean delete(String obj, Connection connection) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean update(String obj, Connection connection) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public ArrayList<String> select(Connection connection) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public ArrayList<String> selectID(String id, Connection connection) {
	// TODO Auto-generated method stub
	return null;
}

      
}
