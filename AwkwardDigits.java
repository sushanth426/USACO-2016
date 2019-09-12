import java.io.*;
import java.util.*;
public class AwkwardDigits {
	
	public static String replace(String s, char r, int index) {
		char[] c = new char[s.length()];
		String x = "";
		for(int i=0; i<c.length; i++) {
			c[i] = s.charAt(i);
		}
		c[index] = r;
		for(int i=0; i<c.length; i++) {
			x += c[i];
		}
		return x;
 	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("ride.in"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String b2 = st.nextToken();
		st = new StringTokenizer(br.readLine());
		String b3 = st.nextToken();
		ArrayList<String> B2 = new ArrayList<String>();
		ArrayList<String> B3 = new ArrayList<String>();
		B2.add(b2);
		B3.add(b3);
		String temp = "";
		
		for(int i=0; i<b2.length(); i++) {
			if(b2.charAt(i) == '0') {
				temp = replace(b2, '1', i);
				B2.add(temp);
			} else {
				temp = replace(b2, '0', i);
				B2.add(temp);
			}
		}
		for(int i=0; i<b3.length(); i++) {
			if(b3.charAt(i) == '0') {
				temp = replace(b3, '2', i);
				B3.add(temp);
				temp = replace(b3, '1', i);
				B3.add(temp);
			} else if(b3.charAt(i) == '1') {
				temp = replace(b3, '2', i);
				B3.add(temp);
				temp = replace(b3, '0', i);
				B3.add(temp);	
			}else {
				temp = replace(b3, '1',i);
				B3.add(temp);
				temp = replace(b3, '0', i);
				B3.add(temp);
			}
		}
		
		int storage = 0;
		String str;
		for(int i=0; i<B3.size(); i++) {
			storage = Integer.parseInt(B3.get(i),3);
			str = Integer.toBinaryString(storage);
			if(B2.contains(str))
				break;
				
		}
		pw.println(storage);
		pw.close();
	}
}