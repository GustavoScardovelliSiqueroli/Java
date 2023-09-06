package com.gssbank.accountpkg;

public class Date {
    private int month;
    private int day;
    private int year;

    public Date(int m,int d,int y){

        this.month = m;
        this.day = d;
        this.year = y;
    }

    public String toStringDate(){

        String s;
        if(month < 10){
            
            s = "0";
            s = s + String.format("%d%d%d",month,day,year);
            return s;
        }
        else{
            s = String.format("%d%d%d",month,day,year);
            return s;
        }

        
    }

    
    public String toIDString(){
        String s1 = "" + toStringDate().charAt(0);
        String s2 = "" + toStringDate().charAt(2);
        String s3 = "" + toStringDate().charAt(4);

        String s = s1+s2+s3;
        return s;
    }

}
