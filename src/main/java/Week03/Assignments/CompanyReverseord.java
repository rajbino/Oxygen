package Week03.Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompanyReverseord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> company = new ArrayList<>();
		company.add("HCL");
		company.add("Aspire Systems");
		company.add("CTS");
	    
		Collections.sort(company);
		Collections.reverse(company);
		System.out.println(company);
	}

}
