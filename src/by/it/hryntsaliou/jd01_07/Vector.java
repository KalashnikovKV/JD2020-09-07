package by.it.hryntsaliou.jd01_07;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Vector extends Var{

    private static double[] value;

    Vector(double[] value) {
        this.value = value;
    }

    Vector(Vector vector) {
        this.value = vector.value;
    }

    Vector(String strVector) {
        Pattern pattern = Pattern.compile("[{}]");
        Matcher matcher = pattern.matcher(strVector);
        while (matcher.find()) {
            strVector = matcher.replaceAll(" ");
        }
        for (int i = 0; i < strVector.trim().split(",").length; i++) {
            this.value[i] = Double.parseDouble(strVector.trim().split(",")[i]);
        }
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        String separator = "";
        for (double element : value) {
            sb.append(separator).append(element);
            separator = ", ";
        }
        sb.append("}");
        return sb.toString();
    }
}
