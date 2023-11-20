package lv.javaguru.java1.student_igor_eglit.lesson_7_array_for.homework.level_4_middle;

import static java.lang.Math.pow;

/*
Пошагово вычисление стандартного отклонения:

1. вычисляем среднее арифметическое выборки данных
2. отнимаем это среднее от каждого элемента выборки
3. все полученные разницы возводим в квадрат
4. суммируем все полученные квадраты
5. делим полученную сумму на количество элементов в выборке (или на n-1, если n>30)
6. вычисляем квадратный корень из полученного частного (именуемого дисперсией)
 */
class PayRollStatCalc {
    /*public double[] createSalaryArray() {
        return new double[5];
    }*/

    public double sumTotalSalary(double[] salary) {
        double sum = 0;
        for (int i = 0; i < salary.length; i++) {
            sum = sum + salary[i];
        }
        return sum;
    }

    public double findMinSalary(double[] salary) {
        double minSalary = salary[0];
        for (int i = 1; i < salary.length; i++) {
            if (minSalary > salary[i]) {
                minSalary = salary[i];
            }
        }
        return minSalary;
    }

    public double findMaxSalary(double[] salary) {
        double maxSalary = salary[0];
        for (int i = 1; i < salary.length; i++) {
            if (maxSalary < salary[i]) {
                maxSalary = salary[i];
            }
        }
        return maxSalary;
    }

    public double averageSalary(double[] salary) {
        double sum = 0;
        for (int i = 0; i < salary.length; i++) {
            sum = sum + salary[i];
        }
        return (double) sum / salary.length;
    }

    public short standardDeviation(double[] salary) {
        double average = averageSalary(salary);
        double sum = 0;
        for (int i = 0; i < salary.length; i++) {
            double temp = pow((salary[i] - average), 2);
            sum = sum + temp;
        }
        if (salary.length > 30) {
            return (short) Math.sqrt(sum / (salary.length - 1));
        } else {
            return (short) Math.sqrt(sum / salary.length);
        }
    }
    public double ratioStandDevToAverage(double[]salary){
        return (double) standardDeviation(salary)/averageSalary(salary);
    }
}
