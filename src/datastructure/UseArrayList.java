package datastructure;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 *
		 */

		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(123);
		numbers.add(456);
		numbers.add(789);
		numbers.add(101);

		// Peeking the first element
		System.out.println("First element: " + numbers.get(0));

		// Removing an element
		numbers.remove(1);

		// Retrieving elements using for each loop
		System.out.println("Elements using for-each loop:");
		for (int num : numbers) {
			System.out.println(num);
		}

		// Retrieving elements using a while loop with Iterator
		System.out.println("Elements using while loop with Iterator:");
		Iterator<Integer> iterator = numbers.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// Sorting the ArrayList
		Collections.sort(numbers);
		String url = "jdbc:mysql://localhost:3306/midterm";
		String user = "root";
		String password = "abc123";

		try (Connection conn = DriverManager.getConnection(url, user, password)) {
			String sqlCreateTable = "CREATE TABLE IF NOT EXISTS sorted_numbers";
			conn.createStatement().execute(sqlCreateTable);

			// Inserting the sorted data into the table
			String sqlInsert = "INSERT INTO sorted_numbers(number) VALUES(?)";
			PreparedStatement pstmt = conn.prepareStatement(sqlInsert);
			for (int num : numbers) {
				pstmt.setInt(1, num);
				pstmt.executeUpdate();
			}
			System.out.println("Sorted data stored in the database.");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
