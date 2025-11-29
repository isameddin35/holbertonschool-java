public class Manager extends Employee321 {

    Manager(double fixedSalary) {
        super(fixedSalary);
    }

    public double calculateBonus(Department department) {
        double bonus = 0;
        if (department.reachedTarget()) {
            bonus = this.getFixedSalary() / 5 + ((department.getAchievedTargetValue() - department.getTargetValue())/100);
        }
        return bonus;
    }
}