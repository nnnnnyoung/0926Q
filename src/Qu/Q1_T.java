package Qu;

import java.util.Scanner;

public class Q1_T {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���ڸ� �Է��ϼ���");
		Scanner in=new Scanner(System.in);
		String newa="";
		String a=in.nextLine();
		int cnt=0;
		for(int i=0; i<a.length(); i++) {
			cnt=0; //������ �ѹ� ������ cnt���� 0���� �ʱ�ȭ
			for(int j=i; j<a.length(); j++) {
				if(a.charAt(i)!=a.charAt(j)) {
					break;
				}else {
					cnt++;
				}
			}
			if(cnt>1) { //������ ���Դ�.
				newa= newa+a.charAt(i)+cnt;
				i=i+cnt-1;
			}else {
				newa= newa+a.charAt(i);
			}
			System.out.print(i+" : "+a.charAt(i)+"/");
			System.out.print(cnt+ "���� �������� �ִ�.");
			System.out.println();	
		}
		System.out.println(newa);	
	}

}
