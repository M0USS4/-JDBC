package fr.isen.java2.db.daos;

import static org.assertj.core.api.Assertions.fail;

import java.sql.Connection;
import java.sql.Statement;

import fr.isen.java2.db.daos.DataSourceFactory;
import org.junit.Before;
import org.junit.Test;

//import fr.isen.java2.db.daos.FilmDao;

public class PersonneDaoTestCase {
	@Before
	public void initDb() throws Exception {
		Connection connection = DataSourceFactory.getDataSource().getConnection();
		Statement stmt = connection.createStatement();
		stmt.executeUpdate("DELETE FROM film");
		stmt.executeUpdate("DELETE FROM genre");
		stmt.executeUpdate("INSERT INTO genre(idgenre,name) VALUES (1,'Drama')");
		stmt.executeUpdate("INSERT INTO genre(idgenre,name) VALUES (2,'Comedy')");
		stmt.executeUpdate("INSERT INTO film(idfilm,title, release_date, genre_id, duration, director, summary) "
				+ "VALUES (1, 'Title 1', '2015-11-26', 1, 120, 'director 1', 'summary of the first film')");
		stmt.executeUpdate("INSERT INTO film(idfilm,title, release_date, genre_id, duration, director, summary) "
				+ "VALUES (2, 'My Title 2', '2015-11-14', 2, 114, 'director 2', 'summary of the second film')");
		stmt.executeUpdate("INSERT INTO film(idfilm,title, release_date, genre_id, duration, director, summary) "
				+ "VALUES (3, 'Third title', '2015-12-12', 2, 176, 'director 3', 'summary of the third film')");
		stmt.close();
		connection.close();
	}
	
	 @Test
	 public void shouldListFilms() {
		 fail("Not yet implemented");
	 }
	
	 @Test
	 public void shouldListFilmsByGenre() {
		 fail("Not yet implemented");
	 }
	
	 @Test
	 public void shouldAddFilm() throws Exception {
		 fail("Not yet implemented");
	 }
}
