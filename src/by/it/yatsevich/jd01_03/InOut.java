package by.it.yatsevich.jd01_03;

class InOut {
    static double[ ] getArray(String line){
        String lineWithoutSpaces = line.trim();
        String[] arrayString = lineWithoutSpaces.split(" ");
        double[] array = new double[arrayString.length];
        for (int i = 0; i < array.length; i++) {
            array[i]=Double.parseDouble(arrayString[i]);
        }
        return array;
    }

    static void printArray(double[] arr) {
        for (double element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    static void printArray(double[] arr, String name, int columnCount){
        System.out.println("Array " + name);
        for (int i = 0; i < arr.length; i++) {
            double element= arr[i];
            System.out.printf("%s[% -3d]=%-10.4f ",name,i,element);
            if ((i+1)%  columnCount == 0
                    ||
                    i== arr.length-1)
                System.out.println();
        }
    }
}
