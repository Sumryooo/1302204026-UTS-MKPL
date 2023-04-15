public class Employee {

    private final String employeeId;
    private final String firstName;
    private final String lastName;
    private final String idNumber;
    private final String address;
    private final int yearJoined;
    private final int monthJoined;
    private final int dayJoined;
    private final boolean isForeigner;
    private final boolean gender;
    private final int monthlySalary;
    private final int otherMonthlyIncome;
    private final int annualDeductible;
    private final String spouseName;
    private final String spouseIdNumber;
    private final List<String> childNames;
    private final List<String> childIdNumbers;

    public static class EmployeeBuilder {
        private String employeeId;
        private String firstName;
        private String lastName;
        private String idNumber;
        private String address;
        private int yearJoined;
        private int monthJoined;
        private int dayJoined;
        private boolean isForeigner;
        private boolean gender;
        private int monthlySalary;
        private int otherMonthlyIncome;
        private int annualDeductible;
        private String spouseName;
        private String spouseIdNumber;
        private List<String> childNames = new LinkedList<>();
        private List<String> childIdNumbers = new LinkedList<>();

        public EmployeeBuilder(String employeeId, String firstName, String lastName, String idNumber, String address, int yearJoined, int monthJoined, int dayJoined, boolean isForeigner, boolean gender) {
            this.employeeId = employeeId;
            this.firstName = firstName;
            this.lastName = lastName;
            this.idNumber = idNumber;
            this.address = address;
            this.yearJoined = yearJoined;
            this.monthJoined = monthJoined;
            this.dayJoined = dayJoined;
            this.isForeigner = isForeigner;
            this.gender = gender;
        }

        public EmployeeBuilder monthlySalary(int monthlySalary) {
            this.monthlySalary = monthlySalary;
            return this;
        }

        public EmployeeBuilder otherMonthlyIncome(int otherMonthlyIncome) {
            this.otherMonthlyIncome = otherMonthlyIncome;
            return this;
        }

        public EmployeeBuilder annualDeductible(int annualDeductible) {
            this.annualDeductible = annualDeductible;
            return this;
        }

        public EmployeeBuilder spouse(String spouseName, String spouseIdNumber) {
            this.spouseName = spouseName;
            this.spouseIdNumber = spouseIdNumber;
            return this;
        }

        public EmployeeBuilder child(String childName, String childIdNumber) {
            this.childNames.add(childName);
            this.childIdNumbers.add(childIdNumber);
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }

	private Employee(EmployeeBuilder builder) {
		this.employeeId = builder.employeeId;
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.idNumber = builder.idNumber;
		this.address = builder.address;
		this.yearJoined = builder.yearJoined;
		this.monthJoined = builder.monthJoined;
		this.dayJoined = builder.dayJoined;
		this.isForeigner = builder.isForeigner;
		this.gender = builder.gender;
		this.monthlySalary = builder.monthlySalary;
		this.otherMonthlyIncome = builder.otherMonthlyIncome;
		this.annualDeductible = builder.annualDeductible;
		this.spouseName = builder.spouseName;
		this.spouseIdNumber = builder.spouseIdNumber;
		this.childNames = builder.childNames;
		this.childIdNumbers = builder.childIdNumbers;
	}

