import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class SWEA1228_암호문1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st= null;
		List<String> list = null;
		for (int t = 1; t <= 10; t++) {
			
			list = new ArrayList<>();
			int size = 0;
			int N = Integer.parseInt(br.readLine());
			
			st = new StringTokenizer(br.readLine());
			
			//10만 입력 받기! 원본의 크기 = size
			for (int i = 0; i < N; i++) {
				if(i == 10)	break;
				list.add(st.nextToken());
				size++;
			}
			
			int M = Integer.parseInt(br.readLine());
			
			st = new StringTokenizer(br.readLine());
			
			for (int i = 0; i < M; i++) {
				String ch = st.nextToken();
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				
				for (int j = 0; j < y; j++) {
					if(x+j >= 10) {
						st.nextToken();
						continue;
					}
					list.add(x+j, st.nextToken());
				}
				
			}
			
			StringBuilder sb = new StringBuilder();
			
			sb.append("#").append(t);
			
			for (int i = 0; i < 10; i++) {
				sb.append(" ").append(list.get(i));
			}
		
			System.out.println(sb.toString());
		}
		
	}

}
