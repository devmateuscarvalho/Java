package br.com.mateus.ClassesUtilitárias.Datas.teste;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        DateFormat[] df = new DateFormat[7];
        df[0] = DateFormat.getInstance();
        df[1] = DateFormat.getDateInstance();
        df[2] = DateFormat.getDateTimeInstance();
        df[3] = DateFormat.getDateInstance(DateFormat.SHORT);


        for (DateFormat dateFormat: df){
            System.out.println(dateFormat.format(calendar));

        }
    }
}
