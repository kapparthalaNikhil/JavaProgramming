package com.program;

public class ADD {
				private String name;
				private String branch;
				private int admn;
				private int rank;
			public String getname() {
				return name;
					
				}
			public String getbranch() {
				return branch;
				
			}
			public int getadmn() {
				return admn;
			}
			public int getrank() {
				return rank;
				
			}
			public void setname(String A_name) {
				this.name=A_name;
				
			}
			public void setbranch(String A_branch) {
				this.branch=A_branch;
				
			}
			public void setadmn(int A_admn) {
				this.admn=A_admn;
			}
			public void setrank(int A_rank) {
				this.rank=A_rank;
			}
			public class admn{
				public static void main(String arg[]) {
					ADD A=new ADD();
					A.setname("Ajay");
					A.setbranch("IT-A");
					A.setadmn(2246);
					A.setrank(75234);
					System.out.println(A.getname());
					System.out.println(A.getbranch());
					System.out.println(A.getadmn());
					System.out.println(A.getrank());
					
					
				}

			}
			}







