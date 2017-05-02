package reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DataReader {

	public static void main(String[] args) {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */

	
        String fileName = "C:\\Users\\Zahera\\ExamMarch2017\\src\\data\\self-driving-car";

		List<String> list = new ArrayList<>();

		try (BufferedReader br = Files.newBufferedReader(Paths.get(fileName))) {

		//br returns as stream and convert it into a List
		list = br.lines().collect(Collectors.toList());

		} catch (IOException e) {
		e.printStackTrace();
		}

		list.forEach(System.out::println);

		}

		}


