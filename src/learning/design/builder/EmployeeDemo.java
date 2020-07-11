package learning.design.builder;

public class EmployeeDemo {

	public static void main(String[] args) {
		
		EmploymentBuilder eb = new EmploymentBuilder();
		eb.addName("Mathan").workAs("Developer").worksAt("SAP");	
		System.out.println(eb.build());
	}
}
