package com.company;

public class PhoneNumber {
    private long number;

    public PhoneNumber(long number){
        this.number = number;
    }

    public PhoneNumber(String number){
        String tempStr = number.replace("(", "")
                               .replace(")", "")
                               .replace(" ", "")
                               .replace("-", "");
        System.out.println(number);
        this.number = Long.parseLong(tempStr);
    }

    public long getNumber() {
        return number;
    }

    public String getNumberAsString() {
        StringBuilder res = new StringBuilder(16);
        res.append(number);
        res.insert(9, '-');
        res.insert(7, '-');
        res.insert(4, ' ');
        res.insert(1, ' ');
        return res.toString();
    }
}
