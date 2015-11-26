package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Service {

	public List<String> getIDs() {
		List<String> listOfIDs = new ArrayList<String>();
		String sqlQuery = "SELECT id FROM jokes";
		try (Connection connect = MyConnection.connectToDb();
				PreparedStatement stmnt = connect.prepareStatement(sqlQuery);
				ResultSet rs = stmnt.executeQuery()) {

			while (rs.next()) {
				String id = rs.getString(1);
				listOfIDs.add(id);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listOfIDs;
	}

	public String getJokeFromDB(String id) {
		String sqlQuery = "SELECT joke FROM jokes WHERE id=?";
		String joke = "";
		try (Connection connect = MyConnection.connectToDb();
				PreparedStatement stmnt = connect.prepareStatement(sqlQuery)) {

			stmnt.setString(1, id);
			try (ResultSet rs = stmnt.executeQuery()) {
				while (rs.next()) {
					joke = rs.getString(1);

				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return joke;
	}

	public boolean isExistingID(String id, List<String> jokeIDs) {
		for (String idFromDB : jokeIDs) {
			if (id.equals(idFromDB)) {
				return true;
			}
		}
		return false;
	}

	public String getRandomJoke() {
		List<String> jokeIDs = this.getIDs();
		String id = "";
		int randomIndex = (int) (Math.random() * jokeIDs.size());
		id = jokeIDs.get(randomIndex);
		String joke = getJokeFromDB(id);
		return joke;
	}
}
