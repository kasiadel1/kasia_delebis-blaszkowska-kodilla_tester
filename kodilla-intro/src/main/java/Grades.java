public class Grades {
    private int[] grades;
    private int size;
    double gradeAverage;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void addGrade(int value) {
        if(this.size == 10) {
            return;
        }

        this.grades[this.size] = value;
        this.size++;

    }

    public int latestGrade() {

        if(this.size == 0) {
            return 0;
        }
        return this.grades[grades.length-1];
    }



    public double averageGrade() {
        if(this.size == 0) {
            return 0;
        }
        double sum = 0;
        for (int value:grades) {
            sum += value;
        }
        this.gradeAverage = sum / this.size;
        return this.gradeAverage;

    }


    public static void main(String[] args) {
        Grades gradesTable = new Grades();
        //1
        gradesTable.addGrade(6);
        gradesTable.latestGrade();
        gradesTable.averageGrade();
        //2
        gradesTable.addGrade(2);
        gradesTable.latestGrade();
        gradesTable.averageGrade();
        //3
        gradesTable.addGrade(3);
        gradesTable.latestGrade();
        gradesTable.averageGrade();
        //4
        gradesTable.addGrade(1);
        gradesTable.latestGrade();
        gradesTable.averageGrade();
        //5
        gradesTable.addGrade(3);
        gradesTable.latestGrade();
        gradesTable.averageGrade();
        //6
        gradesTable.addGrade(5);
        gradesTable.latestGrade();
        gradesTable.averageGrade();
        //7
        gradesTable.addGrade(6);
        gradesTable.latestGrade();
        gradesTable.averageGrade();
        //8
        gradesTable.addGrade(4);
        gradesTable.latestGrade();
        gradesTable.averageGrade();
        //9
        gradesTable.addGrade(5);
        gradesTable.latestGrade();
        gradesTable.averageGrade();
        //10
        gradesTable.addGrade(5);
        gradesTable.latestGrade();
        gradesTable.averageGrade();
        //11
        gradesTable.addGrade(1);
        gradesTable.latestGrade();
        gradesTable.averageGrade();

    }


}