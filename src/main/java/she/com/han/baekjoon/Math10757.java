package she.com.han.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Math10757 {
	public static void main( String[] args ) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(bf.readLine());
		if (t <= 1000000) {
			bw.write(t+"");

			for (int j = 0; j < t; j++) {
				StringTokenizer st = new StringTokenizer(bf.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				if (a<1000||a>1||b<1000||b>1) {
					bw.write("\n"+(a+b));
				} else {
					t--;
				}
			}
		}

		bw.flush();
		bw.close();
	}
}