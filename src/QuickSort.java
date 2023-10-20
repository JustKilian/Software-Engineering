import java.util.Date;

public class QuickSort {

    public static Student[] quickSort(Student[] students, int low, int high, Student.SortKey sortKey) {
        if (low < high) {
            int partitionIndex = partition(students, low, high, sortKey);
            quickSort(students, low, partitionIndex - 1, sortKey);
            quickSort(students, partitionIndex + 1, high, sortKey);
        }
        
        return students;
    }
    
    private static int partition(Student[] students, int low, int high, Student.SortKey sortKey) {

        // i is initialized to low - 1
        // (i is the index of the smaller element.
        // At the beginning there are no smaller elements)
        int i = (low - 1);
        
        // prepare a temporary student
        Student temp = students[high];

        // iterate through the array
        for (int j = low; j < high; j++) {
            // switch on the sort key
            switch (sortKey) {
                // if the sort key is LASTNAME
                case LASTNAME:
                    // pivotLast is the last name of the last element in the array
                    String pivotLast = students[high].getLastname();
                    
                    // if the last name of the current student is less than the pivot
                    if (students[j].getLastname().compareTo(pivotLast) < 0) {
                        // increment i only if the last name of the current student is less than the pivot
                        i++;
                        // swap the current student with the student at index i using a temporary variable
                        temp = students[i];
                        students[i] = students[j];
                        students[j] = temp;
                    }

                    // continue to the next iteration
                    continue;
                // if the sort key is FIRSTNAME
                case FIRSTNAME:
                    // pivotFirst is the last name of the last element in the array
                    String pivotFirst = students[high].getFirstname();

                    // if the first name of the current student is less than the pivot
                    if (students[j].getFirstname().compareTo(pivotFirst) < 0) {
                        // increment i only if the first name of the current student is less than the pivot
                        i++;
                        // swap the current student with the student at index i using a temporary variable
                        temp = students[i];
                        students[i] = students[j];
                        students[j] = temp;
                    }

                    // continue to the next iteration
                    continue;
                // if the sort key is STUDENTID
                case STUDENTID:
                    //pivotId is the student ID of the last student in the array
                    long pivotId = students[high].getStudentId();
                    
                    // if the student ID of the current student is less than the pivot
                    if (students[j].getStudentId() < pivotId) {
                        // increment i only if the student ID of the current student is less than the pivot
                        i++;
                        // swap the current student with the student at index i using a temporary variable
                        temp = students[i];
                        students[i] = students[j];
                        students[j] = temp;
                    }

                    // continue to the next iteration
                    continue;
                // if the sort key is WEIGHT
                case WEIGHT:
                    // pivotWeight is the weight of the last student in the array
                    double pivotWeight = students[high].getWeight();

                    // if the weight of the current student is less than the pivot
                    if (students[j].getWeight() < pivotWeight) {
                        // increment i only if the weight of the current student is less than the pivot
                        i++;
                        // swap the current student with the student at index i using a temporary variable
                        temp = students[i];
                        students[i] = students[j];
                        students[j] = temp;
                    }

                    // continue to the next iteration
                    continue;
                // if the sort key is BIRTHDAY
                case BIRTHDAY:
                    // pivotBirthday is the birthday of the last student in the array
                    Date pivotBirthday = students[high].getBirthday();

                    // if the birthday of the current student is before the pivot
                    if (students[j].getBirthday().before(pivotBirthday)) {
                        // increment i only if the birthday of the current student is before the pivot
                        i++;
                        // swap the current student with the student at index i using a temporary variable
                        temp = students[i];
                        students[i] = students[j];
                        students[j] = temp;
                    }

                    // no continue statement is needed here because this is the last case
            }
        }

        // swap the student at index i + 1 with the pivot using a temporary variable
        temp = students[i + 1];
        students[i + 1] = students[high];
        students[high] = temp;

        // return the index of the pivot (the index of the birthday that is in the correct position)
        return i + 1;
    }
}
