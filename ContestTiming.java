import java.util.*;
import java.io.*;
public class ContestTiming {
	
	public static int minConverter(int d,int h, int m) {
		return 24*60*d+60*h+m;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("ride.in"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int day, hour, min;
		day = Integer.parseInt(st.nextToken());
		hour = Integer.parseInt(st.nextToken());
		min = Integer.parseInt(st.nextToken());
		int startTime = minConverter(11,11,11);
		int endTime = minConverter(day, hour, min);
		pw.println(endTime-startTime);
		pw.close();
	}
}
