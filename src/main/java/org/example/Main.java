package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        List<String> list = null;
        System.out.println(list.size());
    }

    public void formatDate() {
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("MM-dd-yyyy");
        System.out.println("Format Date: " + ft.format(date));
    }
}