package Qu;

import java.util.Scanner;

public class Q1_T {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("문자를 입력하세요");
		Scanner in=new Scanner(System.in);
		String newa="";
		String a=in.nextLine();
		int cnt=0;
		for(int i=0; i<a.length(); i++) {
			cnt=0; //포문이 한번 끝날시 cnt값은 0으로 초기화
			for(int j=i; j<a.length(); j++) {
				if(a.charAt(i)!=a.charAt(j)) {
					break;
				}else {
					cnt++;
				}
			}
			if(cnt>1) { //여러개 나왔다.
				newa= newa+a.charAt(i)+cnt;
				i=i+cnt-1;
			}else {
				newa= newa+a.charAt(i);
			}
			System.out.print(i+" : "+a.charAt(i)+"/");
			System.out.print(cnt+ "개가 연속으로 있다.");
			System.out.println();	
		}
		System.out.println(newa);	
	}

}
