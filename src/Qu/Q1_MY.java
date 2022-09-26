package Qu;

import java.util.Scanner;

public class Q1_MY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);

		for(;;) {
			System.out.println("대문자를 입력하세요(100글자 미만)");
			
			String Word=in.nextLine();
			int cnt=0;
			String result="";
		if(Word.length()<100) {
			for(int i=0; i<Word.length()-1; i++){
				for(int j=i+1; j<=i+1; j++) {
					if(Word.charAt(i)==Word.charAt(j)) {
						cnt++;
						if(i==Word.length()-2) {
							result=result+Word.charAt(i)+(cnt+1);
						}
					}else {
						if(i==Word.length()-2) {
							if(cnt!=0) {
								result=result+Word.charAt(i)+(cnt+1)+Word.charAt(j);
							}else {
								result=result+Word.charAt(i)+Word.charAt(j);
							}
							
						}else if(cnt!=0) {
							result=result+Word.charAt(i)+(cnt+1);
							cnt=0;
						}else {
							result=result+Word.charAt(i);
						}
					}
					
				}
			}
			System.out.println(result);
		}else {
			System.out.println("100글자 미만으로 입력하세요");
		}


		}
	}

}
