package br.com.mateus.ClassesUtilitárias.Datas.teste;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(1000000000000L); // long miliseconds
        date.setTime(date.getTime()+3_600_000);
        System.out.println(date);
    }
}
