package geekbrains.lesson_2;

public class MyArraySize {
    static int getArray(String[][] _myArray) throws MyArraySizeException,MyArrayDataException {
        if(_myArray.length == 4 && _myArray[0].length == 4) {
            System.out.println("Array's length is correct");
        } else {
            throw new MyArraySizeException("Array's length is not correct");
        }

        int sum = 0;
        if(_myArray.length != 4) {
            throw new MyArraySizeException("Array's length is not correct");
        }

        for (int i=0;i<_myArray.length;i++) {
            if(_myArray[i].length != 4) {
                throw new MyArraySizeException("Array's length is not correct");
            }
            for(int j=0;j<_myArray[i].length;j++) {
                try {
                    sum += Integer.parseInt(_myArray[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Unable to convert cell "+ i + "x" + j);
                }
            }
        }

        Integer[][] intArray = new Integer[_myArray.length][_myArray[0].length];
        int res=0;
        for(int i=0;i<_myArray.length;i++) {
            for (int j=0;j<_myArray[0].length;j++) {
                intArray[i][j] = Integer.parseInt(_myArray[i][j]);
                i++;
                res += intArray[i][j];
            }
        }
        return sum;
    }
}



