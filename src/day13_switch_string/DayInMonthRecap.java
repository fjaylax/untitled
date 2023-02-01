package day13_switch_string;

import java.util.Arrays;

public class DayInMonthRecap {
    public static void main(String[] args) {
         /*
        Write a program that will accept a month name and outputs how many days are in that month
data:
    February: 28 days
    April, June, September, November: 30 days
    January, March, May, July, August, October, December: 31 days
         */
        String month = "September"; //string comparison (assigning)
        switch (month){
            case "February":
                System.out.println("28 days");
                break;
                case "April":
                case  "June":
                case "September":
                case "November":
                    System.out.println("30 days");
                    break;
                case "January":
                case "March":
                case "May":
                case "July":
                case "August":
                case "October":
                case "December":
                System.out.println("31 days");
            break;
            default:
                System.out.println("Invalid month");

        }
        }
        
        
        
        
    }

