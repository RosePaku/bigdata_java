package stuProject2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;

public class TestFile3 {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("c:/student.txt"));
			while (true) {
				String data = br.readLine();
				if (data == null)
					break; // 데이터가 없으면 종료
				System.out.println(data);
				String[] dataArr = data.split(",");

				int stuNo = Integer.parseInt(dataArr[0]);
				String name = dataArr[1];
				// new Student(dataArr[0], dataArr[1],dataArr[2],dataArr[3);

			} // while (try안에 있는)
			br.close();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();

		}

		// try (BufferedReader br = new BufferedReader(new
		// FileReader("c:/student.txt"))) { // try catch 문 적용하기
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
	}
}