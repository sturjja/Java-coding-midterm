package datastructure;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Iterator;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.sql.Connection;
import java.util.Properties;

import static databases.ConnectToSqlDB.loadProperties;

public class UseMap {


	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		Map<String, List<String>> list = new HashMap<>();

		List<String> sports = new ArrayList<>();
		sports.add("Football");
		sports.add("Basketball");
		sports.add("Baseball");
		list.put("Sports", sports);

		List<String> jobs = new ArrayList<>();
		jobs.add("Doctor");
		jobs.add("Lawyer");
		jobs.add("Engineer");
		list.put("Jobs", jobs);

		// Retrieving elements using a for each loop
		System.out.println("Elements using for each loop:");
		for (Map.Entry<String, List<String>> entry : list.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		// Retrieving elements using a while loop with an Iterator
		System.out.println("Elements using while loop with Iterator:");
		Iterator<Map.Entry<String, List<String>>> iterator = list.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, List<String>> entry = iterator.next();
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}



	}

}
