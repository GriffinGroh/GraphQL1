package com.advanceamerica.graphqlcustomer.model;

public class IncomeType {
	/*
	 * Holds data for incomes with getter and setter methods for each field.
	 */
	protected String seqNumber; 
	protected IncomeTupleType incomeType; 
	protected CustomerStatusTupleType status; 
	protected PayFrequencyTupleType payFrequency; 
	protected String payOccurrence; 
	protected String payNextDateTime; //dateTime
	protected String secondPayDateTime; //dateTune
	protected String dayOfWeek; //DayOfWeekType
	protected String payStubbDateTime; //dateTime
	protected double netIncomeForPeriod; //DollarType
	protected double grossIncomeForPeriod; //DollarType
	protected double annualGrossIncome; //DollarType
	protected boolean isDirectDeposit; 
	protected DirectDepositAccountTuple directDepositAccount; //TODO BankingAccountType
	protected boolean isJointApplicantFlag; 
	protected boolean hasGarnishmentFlag;
	protected boolean hasGovernmentIncomeFlag;
	protected boolean isVerifiedFlag;
	protected VerifiedMethodTupleType verifiedMethod;
	protected String verifiedDateTime; //DateTimeType
	protected String employerName; //EmployerNameType
	protected String employerTaxId; //EmployerTaxIdType
	protected String employerSupervisorName; //EmployerSupervisorType
	protected String employerPhoneNumber; //EmployerPhoneNumberType
	protected String employerPhoneExt; //EmployerPhoneNumberExtensionType
	protected boolean employerCanContact; 
	protected String employeeJobTitle; //EmployeeJobTitleType
	protected int employeeMonthsOfService; //TODO unspecified in schema: doesn't have a "type=". Probably an int
	protected String employeeWorkShiftHours; //EmployeeWorkShiftHoursType
	protected AddressType employerAddress; //AddressType
	protected String suite; //SuiteNumberType: holds a string
	
	public String getSeqNumber() {
		return seqNumber;
	}
	public IncomeTupleType getIncomeType() {
		return incomeType;
	}
	public CustomerStatusTupleType getStatus() {
		return status;
	}
	public PayFrequencyTupleType getPayFrequency() {
		return payFrequency;
	}
	public String getPayOccurrence() {
		return payOccurrence;
	}
	public String getPayNextDateTime() {
		return payNextDateTime;
	}
	public String getSecondPayDateTime() {
		return secondPayDateTime;
	}
	public String getDayOfWeek() {
		return dayOfWeek;
	}
	public String getPayStubbDateTime() {
		return payStubbDateTime;
	}
	public double getNetIncomeForPeriod() {
		return netIncomeForPeriod;
	}
	public double getGrossIncomeForPeriod() {
		return grossIncomeForPeriod;
	}
	public double getAnnualGrossIncome() {
		return annualGrossIncome;
	}
	public boolean getIsDirectDeposit() {
		return isDirectDeposit;
	}
	public DirectDepositAccountTuple getDirectDepositAccount() {
		return directDepositAccount;
	}
	public boolean getIsJointApplicantFlag() {
		return isJointApplicantFlag;
	}
	public boolean getHasGarnishmentFlag() {
		return hasGarnishmentFlag;
	}
	public boolean hasGovernmentIncomeFlag() {
		return hasGovernmentIncomeFlag;
	}
	public boolean getIsVerifiedFlag() {
		return isVerifiedFlag;
	}
	public VerifiedMethodTupleType getVerifiedMethod() {
		return verifiedMethod;
	}
	public String getVerifiedDateTime() {
		return verifiedDateTime;
	}
	public String getEmployerName() {
		return employerName;
	}
	public String getEmployerTaxId() {
		return employerTaxId;
	}
	public String getEmployerSupervisorName() {
		return employerSupervisorName;
	}
	public String getEmployerPhoneNumber() {
		return employerPhoneNumber;
	}
	public String getEmployerPhoneExt() {
		return employerPhoneExt;
	}
	public boolean getEmployerCanContact() {
		return employerCanContact;
	}
	public String getEmployeeJobTitle() {
		return employeeJobTitle;
	}
	public int getEmployeeMonthsOfService() {
		return employeeMonthsOfService;
	}
	public String getEmployeeWorkShiftHours() {
		return employeeWorkShiftHours;
	}
	public AddressType getEmployerAddress() {
		return employerAddress;
	}
	public String getSuite() {
		return suite;
	}
	public void setSeqNumber(String seqNumber) {
		this.seqNumber = seqNumber;
	}
	public void setIncomeType(IncomeTupleType incomeType) {
		this.incomeType = incomeType;
	}
	public void setStatus(CustomerStatusTupleType status) {
		this.status = status;
	}
	public void setPayFrequency(PayFrequencyTupleType payFrequency) {
		this.payFrequency = payFrequency;
	}
	public void setPayOccurrence(String payOccurrence) {
		this.payOccurrence = payOccurrence;
	}
	public void setPayNextDateTime(String payNextDateTime) {
		this.payNextDateTime = payNextDateTime;
	}
	public void setSecondPayDateTime(String secondPayDateTime) {
		this.secondPayDateTime = secondPayDateTime;
	}
	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}
	public void setPayStubbDateTime(String payStubbDateTime) {
		this.payStubbDateTime = payStubbDateTime;
	}
	public void setNetIncomeForPeriod(double netIncomeForPeriod) {
		this.netIncomeForPeriod = netIncomeForPeriod;
	}
	public void setGrossIncomeForPeriod(double grossIncomeForPeriod) {
		this.grossIncomeForPeriod = grossIncomeForPeriod;
	}
	public void setAnnualGrossIncome(double annualGrossIncome) {
		this.annualGrossIncome = annualGrossIncome;
	}
	public void setIsDirectDeposit(boolean isDirectDeposit) {
		this.isDirectDeposit = isDirectDeposit;
	}
	public void setDirectDepositAccount(DirectDepositAccountTuple directDepositAccount) {
		this.directDepositAccount = directDepositAccount;
	}
	public void setIsJointApplicantFlag(boolean isJointApplicantFlag) {
		this.isJointApplicantFlag = isJointApplicantFlag;
	}
	public void setHasGarnishmentFlag(boolean hasGarnishmentFlag) {
		this.hasGarnishmentFlag = hasGarnishmentFlag;
	}
	public void setHasGovernmentIncomeFlag(boolean hasGovernmentIncomeFlag) {
		this.hasGovernmentIncomeFlag = hasGovernmentIncomeFlag;
	}
	public void setIsVerifiedFlag(boolean isVerifiedFlag) {
		this.isVerifiedFlag = isVerifiedFlag;
	}
	public void setVerifiedMethod(VerifiedMethodTupleType verifiedMethod) {
		this.verifiedMethod = verifiedMethod;
	}
	public void setVerifiedDateTime(String verifiedDateTime) {
		this.verifiedDateTime = verifiedDateTime;
	}
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}
	public void setEmployerTaxId(String employerTaxId) {
		this.employerTaxId = employerTaxId; 
	}
	public void setEmployerSupervisorName(String employerSupervisorName) {
		this.employerSupervisorName = employerSupervisorName;
	}
	public void setEmployerPhoneNumber(String employerPhoneNumber) {
		this.employerPhoneNumber = employerPhoneNumber;
	}
	public void setEmployerPhoneExt(String employerPhoneExt) {
		this.employerPhoneExt = employerPhoneExt;
	}
	public void setEmployerCanContact(boolean employerCanContact) {
		this.employerCanContact = employerCanContact;
	}
	public void setEmployeeJobTitle(String employeeJobTitle) {
		this.employeeJobTitle = employeeJobTitle;
	}
	public void setEmployeeMonthsOfService(int employeeMonthsOfService) {
		this.employeeMonthsOfService = employeeMonthsOfService;
	}
	public void setEmployeeWorkShiftHours(String employeeWorkShiftHours) {
		this.employeeWorkShiftHours = employeeWorkShiftHours;
	}
	public void setEmployerAddress(AddressType employerAddress) {
		this.employerAddress = employerAddress;
	}
	public void setSuite(String suite) {
		this.suite = suite;
	}

}