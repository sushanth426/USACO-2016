import java.io.*;
import java.util.*;
class square {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new FileReader("square.in"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("square.out")));

    int smallestX = 10;
    int smallestY = 0;
    int largestY = 10;
    int largestX = 0;

    for(int i = 0; i<=2; i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      int xLow = Integer.parseInt(st.nextToken);
      int yLow = Integer.parseInt(st.nextToken);
      int xHigh = Integer.parseInt(st.nextToken);
      int yHigh = Integer.parseInt(st.nextToken);
    }

    if(xLow < smallestX) {
				smallestX = xLow;
			}
			if(xHigh > largestX) {
				largestX = xHigh;
			}
			if(yLow < smallestY) {
				smallestY = yLow;
			}
			if(yHigh > largestY) {
				largestY = yHigh;
			}
      int desiredSideLength = largestX - smallestX;
		  if(largestY - smallestY > largestX - smallestX) {
		  	desiredSideLength = largestY - smallestY; 
		  }
		
		  pw.println(desiredSideLength * desiredSideLength);
	  	pw.close();
  }
}
