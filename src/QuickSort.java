import java.util.Date;

public class QuickSort {

    // quickSortLast sorts the array by last name
    public static Student[] quickSortLast(Student[] students, int low, int high) {
        // exit condition when low is greater than or equal to high
        if (low < high) {
            // partition the array around the pivot calculated by partitionLast (last name)
            int partitionIndex = partitionLast(students, low, high);
            // recursively sort the left and right subarrays
            quickSortLast(students, low, partitionIndex - 1);
            quickSortLast(students, partitionIndex + 1, high);
        }

        // return the sorted array
        return students;
    }

    // quickSortFirst sorts the array by first name
    public static Student[] quickSortFirst(Student[] students, int low, int high) {
        // exit condition when low is greater than or equal to high
        if (low < high) {
            // partition the array around the pivot calculated by partitionFirst (first name)
            int partitionIndex = partitionFirst(students, low, high);
            // recursively sort the left and right subarrays
            quickSortFirst(students, low, partitionIndex - 1);
            quickSortFirst(students, partitionIndex + 1, high);
        }

        // return the sorted array
        return students;
    }

    // quickSortID sorts the array by student ID
    public static Student[] quicksortID(Student[] students, int low, int high) {
        // exit condition when low is greater than or equal to high
        if (low < high) {
            // partition the array around the pivot calculated by partitionID (student ID)
            int partitionIndex = partitionId(students, low, high);
            // recursively sort the left and right subarrays
            quicksortID(students, low, partitionIndex - 1);
            quicksortID(students, partitionIndex + 1, high);
        }

        // return the sorted array
        return students;
    }

    // quickSortWeight sorts the array by weight
    public static Student[] quicksortWeight(Student[] students, int low, int high) {
        // exit condition when low is greater than or equal to high
        if (low < high) {
            // partition the array around the pivot calculated by partitionWeight (weight)
            int partitionIndex = partitionWeight(students, low, high);
            // recursively sort the left and right subarrays
            quicksortWeight(students, low, partitionIndex - 1);
            quicksortWeight(students, partitionIndex + 1, high);
        }

        // return the sorted array
        return students;
    }

    // quickSortBirthday sorts the array by birthday
    public static Student[] quicksortBirthday(Student[] students, int low, int high) {
        // exit condition when low is greater than or equal to high
        if (low < high) {
            // partition the array around the pivot calculated by partitionBirthday (birthday)
            int partitionIndex = partitionBirthday(students, low, high);
            // recursively sort the left and right subarrays
            quicksortBirthday(students, low, partitionIndex - 1);
            quicksortBirthday(students, partitionIndex + 1, high);
        }

        // return the sorted array
        return students;
    }

    // partitionLast partitions the array around the pivot (last name)
    private static int partitionLast(Student[] students, int low, int high) {
        // pivot is the last element in the array (last name is saved as a string)
        String pivot = students[high].getLastname();

        // i is initialized to low - 1
        // (i is the index of the smaller element.
        // At the beginning there are no smaller elements)
        int i = (low - 1);

        // iterate through the array
        for (int j = low; j < high; j++) {
            // if the last name of the current student is less than the pivot
            if (students[j].getLastname().compareTo(pivot) < 0) {
                // increment i only if the last name of the current student is less than the pivot
                i++;
                // swap the current student with the student at index i using a temporary variable
                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
            }
        }

        // swap the student at index i + 1 with the pivot using a temporary variable
        Student temp = students[i + 1];
        students[i + 1] = students[high];
        students[high] = temp;

        // return the index of the pivot (the index of the last name that is in the correct position)
        return i + 1;
    }

    // partitionFirst partitions the array around the pivot (first name)
    private static int partitionFirst(Student[] students, int low, int high) {
        // pivot is the last element in the array (first name is saved as a string)
        String pivot = students[high].getFirstname();

        // i is initialized to low - 1
        // (i is the index of the smaller element.
        // At the beginning there are no smaller elements)
        int i = (low - 1);

        // iterate through the array
        for (int j = low; j < high; j++) {
            // if the first name of the current student is less than the pivot
            if (students[j].getFirstname().compareTo(pivot) < 0) {
                // increment i only if the first name of the current student is less than the pivot
                i++;
                // swap the current student with the student at index i using a temporary variable
                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
            }
        }

        // swap the student at index i + 1 with the pivot using a temporary variable
        Student temp = students[i + 1];
        students[i + 1] = students[high];
        students[high] = temp;

        // return the index of the pivot (the index of the first name that is in the correct position)
        return i + 1;
    }

    // partitionID partitions the array around the pivot (student ID)
    private static int partitionId(Student[] students, int low, int high) {
        // pivot is the last element in the array (student ID is saved as a long)
        long pivot = students[high].getStudentId();

        // i is initialized to low - 1
        // (i is the index of the smaller element.
        // At the beginning there are no smaller elements)
        int i = (low - 1);

        // iterate through the array
        for (int j = low; j < high; j++) {
            // if the student ID of the current student is less than the pivot
            if (students[j].getStudentId() < pivot) {
                // increment i only if the student ID of the current student is less than the pivot
                i++;
                // swap the current student with the student at index i using a temporary variable
                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
            }
        }

        // swap the student at index i + 1 with the pivot using a temporary variable
        Student temp = students[i + 1];
        students[i + 1] = students[high];
        students[high] = temp;

        // return the index of the pivot (the index of the student ID that is in the correct position)
        return i + 1;
    }

    // partitionWeight partitions the array around the pivot (weight)
    private static int partitionWeight(Student[] students, int low, int high) {
        // pivot is the last element in the array (weight is saved as a double)
        double pivot = students[high].getWeight();

        // i is initialized to low - 1
        // (i is the index of the smaller element.
        // At the beginning there are no smaller elements)
        int i = (low - 1);

        // iterate through the array
        for (int j = low; j < high; j++) {
            // if the weight of the current student is less than the pivot
            if (students[j].getWeight() < pivot) {
                // increment i only if the weight of the current student is less than the pivot
                i++;
                // swap the current student with the student at index i using a temporary variable
                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
            }
        }

        // swap the student at index i + 1 with the pivot using a temporary variable
        Student temp = students[i + 1];
        students[i + 1] = students[high];
        students[high] = temp;

        // return the index of the pivot (the index of the weight that is in the correct position)
        return i + 1;
    }

    // partitionBirthday partitions the array around the pivot (birthday)
    private static int partitionBirthday(Student[] students, int low, int high) {
        // pivot is the last element in the array (birthday is saved as a Date)
        Date pivot = students[high].getBirthday();

        // i is initialized to low - 1
        int i = (low - 1);

        // iterate through the array
        for (int j = low; j < high; j++) {
            // if the birthday of the current student is before the pivot
            if (students[j].getBirthday().before(pivot)) {
                // increment i only if the birthday of the current student is before the pivot
                i++;
                // swap the current student with the student at index i using a temporary variable
                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
            }
        }

        // swap the student at index i + 1 with the pivot using a temporary variable
        Student temp = students[i + 1];
        students[i + 1] = students[high];
        students[high] = temp;

        // return the index of the pivot (the index of the birthday that is in the correct position)
        return i + 1;
    }
}
