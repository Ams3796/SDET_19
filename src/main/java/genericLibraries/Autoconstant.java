package genericLibraries;

public interface Autoconstant {
    
	public static String DirPath=System.getProperty("user.dir");
	String propertyfile=DirPath+"../SDET_19/src/test/resources/CommonData.properties";
	String xml=DirPath+"../SDET_19/src/test/resources/CommonDAta.xml";
	String excel=DirPath+"/SDET_19/src/test/resources/Excel.xlsx";
	long implicitwait=20;
	long explicitwait=15;
	String Org_childwindow="Accounts";
	String Opportunity_name="Opportunity";
	String mainwindow="Potentials";
	String sales1="Prospecting";
	String sales2="Qualification";
	String sales3="Needs Analysis";
	String sales4="Value Proposition";
	String sales5="Id. Decision Makers";
	String sales6="Perception Analysis";
	String sales7="Proposal/Price Quote";
	String sales8="Negotiation/Review";
	String sales9="Closed Won";
	String sales10="Closed Lost";

}
