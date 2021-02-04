package saem;

import java.util.Scanner; 
import java.util.Stack; 
public class Baekjoon_2493_탑{ 
    
	
//	peek() : Stack 최상단에 있는 top data 반환(Stack에서 꺼내진 않음)
//	pop() : Stack에 있는 데이터 꺼내기
//	push() : Stack에 데이터를 삽입
//	isEmpty() : Stack 비어있는지 확인
//	empty() : Stack을 초기화
//	size() : Stack Size 반환

 
    static int[] array = new int[5000000];  //탑의 수를 나타내는 범위

    public static void main(String[] args){ 
    	
        Scanner sc = new Scanner(System.in); 
        Stack<Integer> stack = new Stack<Integer>(); 
        int N = sc.nextInt();  //탑의 개수 입력받기 

        for (int i=0; i<N; i++) { 
            array[i] = sc.nextInt(); //높이 입력받기 
        } 

        for(int i=0;i<N;i++){ 

            if(stack.empty()){ //stack 초기화 하고 
                System.out.print("0 "); //앞에 걸림돌 없으면 0 하고 푸쉬 
                stack.push(i); 
            }else{ //empty 아니면 !

                while(!stack.empty() && array[stack.peek()] < array[i]){  //비어있지 않고, 꼭대기가 그 다음에 들어온 값보다 작으면 날리기
                    stack.pop(); //날리기 
                } 
                stack.empty();  
                
                if(stack.empty()){ 
                    System.out.print("0 "); 
                }else{ 
                    System.out.printf("%d ", stack.peek() +1); 
                } 
                stack.push(i); 
            } 

        } 

    } 
}
