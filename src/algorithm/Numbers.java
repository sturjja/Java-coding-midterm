package algorithm;

import databases.ConnectToSqlDB;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;
import java.util.Random;

public class Numbers {

	/*
	 * Show all the different kind of sorting algorithm by applying into (num array).
	 * Display the execution time for each sorting.Example in below.
	 *
	 * Use any databases[MongoDB, Oracle or MySql] to store data and retrieve data.
	 *
	 * At the end. After running all the sorting algo, come to a conclusion which one is suitable on given data set.
	 *
	 */
	public static Properties loadProperties() throws IOException {
		Properties prop = new Properties();
		InputStream ism = new FileInputStream("C:\\Users\\sturj\\Java Mid\\midterm-coding-exam\\midterm-coding-exam\\src\\secret.properties");
		prop.load(ism);
		ism.close();
		return prop;
	}

	public static Connection connectToSqlDatabase() throws IOException, SQLException, ClassNotFoundException {
		Properties prop = loadProperties();
		String driverClass = prop.getProperty("MYSQLJDBC.driver");
		String url = prop.getProperty("MYSQLJDBC.url");
		String userName = prop.getProperty("MYSQLJDBC.userName");
		String password = prop.getProperty("MYSQLJDBC.password");
		Class.forName(driverClass);
		Connection connect = DriverManager.getConnection(url, userName, password);
		System.out.println("Database is connected");
		return connect;
	}

	public static void main(String[] args) throws Exception {
		
		int [] num = new int[1000000];
		storeRandomNumbers(num);
		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
		//Selection Sort
		Sort algo = new Sort();
		algo.selectionSort(num);
		long selectionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");
        connectToSqlDB.insertDataFromArrayToSqlTable(num, "selection_sort", "SortingNumbers");
        List<String> numbers = connectToSqlDB.readDataBase("selection_sort", "SortingNumbers");
        printValue(numbers);
		int n = num.length;
		randomize (num, n);

		//Insertion Sort
		ConnectToSqlDB connectToSqlDB1 = new ConnectToSqlDB();
		algo.insertionSort(num);
		long insertionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");
		connectToSqlDB1.insertDataFromArrayToSqlTable(num, "insertion_sort", "SortingNumbers");
		List<String> numbersIns = connectToSqlDB1.readDataBase("insertion_sort", "SortingNumbers");
		printValue(numbersIns);

		//By following above, Continue for rest of the Sorting Algorithm....
		//Bubble Sort
		ConnectToSqlDB connectToSqlDB3 = new ConnectToSqlDB();
		algo.bubbleSort(num);
		long bubbleSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Bubble Sort take: " + bubbleSortExecutionTime + " milli sec");
		connectToSqlDB3.insertDataFromArrayToSqlTable(num, "bubble_sort", "SortingNumbers");
		List<String> numbersbub = connectToSqlDB3.readDataBase("bubble_sort", "SortingNumbers");
		printValue(numbersbub);
		// Merge Sort
		ConnectToSqlDB connectToSqlDB4 = new ConnectToSqlDB();
		algo.mergeSort(num);
		long mergeSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Merge Sort take: " + mergeSortExecutionTime + " milli sec");
		connectToSqlDB4.insertDataFromArrayToSqlTable(num, "merge_sort", "SortingNumbers");
		List<String> numbersmrg = connectToSqlDB4.readDataBase("merge_sort", "SortingNumbers");
		printValue(numbersmrg);
		// Quick Sort
		ConnectToSqlDB connectToSqlDB5 = new ConnectToSqlDB();
		algo.quickSort(num);
		long quickSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Quick Sort take: " + quickSortExecutionTime + " milli sec");
		connectToSqlDB5.insertDataFromArrayToSqlTable(num, "quick_sort", "SortingNumbers");
		List<String> numbersQck = connectToSqlDB5.readDataBase("quick_sort", "SortingNumbers");
		printValue(numbersQck);

		//Heap Sort
		ConnectToSqlDB connectToSqlDB6 = new ConnectToSqlDB();
		algo.heapSort(num);
		long heapSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Heap Sort take: " + heapSortExecutionTime + " milli sec");
		connectToSqlDB6.insertDataFromArrayToSqlTable(num, "heap_sort", "SortingNumbers");
		List<String> numbersHeap = connectToSqlDB6.readDataBase("heap_sort", "SortingNumbers");
		printValue(numbersHeap);

		//Bucket Sort
		ConnectToSqlDB connectToSqlDB7 = new ConnectToSqlDB();
		algo.bucketSort(num);
		long bucketSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Bucket Sort take: " + bucketSortExecutionTime + " milli sec");
		connectToSqlDB7.insertDataFromArrayToSqlTable(num, "bucket_sort", "SortingNumbers");
		List<String> numbersBkt = connectToSqlDB7.readDataBase("bucket_sort", "SortingNumbers");
		printValue(numbersBkt);

		//Shell Sort
		ConnectToSqlDB connectToSqlDB8 = new ConnectToSqlDB();
		algo.shellSort(num);
		long shellSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Shell Sort take: " + shellSortExecutionTime + " milli sec");
		connectToSqlDB8.insertDataFromArrayToSqlTable(num, "shell_sort", "SortingNumbers");
		List<String> numbersSll = connectToSqlDB8.readDataBase("shell_sort", "SortingNumbers");
		printValue(numbersSll);


		//Come to conclusion about which Sorting Algo is better in given data set.
//Quick sort is the better sorting algorithm for large data sets.
	}

	public static void storeRandomNumbers(int [] num){
		Random rand = new Random();
		for(int i=0; i<num.length; i++){
			num[i] = rand.nextInt(1000000);
		}
	}

	public static void randomize( int arr[], int n)
	{
		Random r = new Random();
		// Start from the last element and swap one by one. We don't
		// need to run for the first element that's why i > 0
		for (int i = n-1; i > 0; i--) {
			int j = r.nextInt(i);
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	public static void printValue(List<String> array){
		for(String st:array){
			System.out.println(st);
		}
	}
}
