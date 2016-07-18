import java.util.*;
import java.io.*;

public class MaxPairwiseProduct {
    static long getMaxPairwiseProduct(int[] numbers) {
        long result = 0;
        int n = numbers.length;
	int maxIndex=0, secondMaxIndex=-1;

       
	for(int i=0;i<n; i++) {
		if(numbers[i] > numbers[maxIndex]) {
		 maxIndex = i;
		}
	} 

	for(int i=0;i<n; i++) {
		if( i==maxIndex ) 
		 continue;
		else if( secondMaxIndex == -1 ||  numbers[i] > numbers[secondMaxIndex] ) {
		 secondMaxIndex = i;
		}
	}
	
	result = (long)numbers[maxIndex] * (long)numbers[secondMaxIndex];
	return result;
    }

    public static void main(String[] args) {

        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(getMaxPairwiseProduct(numbers));
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

}
