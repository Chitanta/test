package com.briur;

public class LOopTest {
	public static void main(String[] args) {
		/*
		 * for(int i=1;i<10;i++){ for(int j=1;j<=i;j++){
		 * System.out.print(j+"*"+i+"="+i*j+"\t"); } System.out.println(); }
		 */
		/*
		 * for (int i=1;i<10;i++){ for(int j=1;j<10-i;j++){
		 * System.out.print("\t"); } for(int k=1;k<=i;k++){
		 * System.out.print(k+"*"+i+"="+i*k+"\t"); } System.out.println(); }
		 */
		// for(int i=9;i>0;i--){
		// for(int j=1;j<10-i;j++){
		// System.out.print("\t");
		// }
		// for(int k=1;k<=i;k++){
		// System.out.print(k+"*"+i+"="+i*k+"\t");
		// }
		// System.out.println();
		// }
		for (int i = 9; i > 0; i--) {
			for (int j = 1; j < i + 1; j++) {
				System.out.print(j + "*" + i + "=" + i * j + "\t");
			}
			System.out.println();
		}
	}
}

