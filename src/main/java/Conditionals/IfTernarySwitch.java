package Conditionals;

import junit.framework.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class IfTernarySwitch {
    public static void main(String[] args) {
        //multiple coonditions
        int temperature = 25;
        //&& returns true if both conditions are true
        boolean isWarm = temperature > 25 && temperature < 35;
        System.out.println(isWarm);
        //

        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        //with || if just 1 is true- result will be true
        boolean isElligibleForCredit = hasHighIncome || hasGoodCredit;

        boolean hasCriminalRecord = false;
        //is hascriminalrecors is true !hasCriminalRecors
        boolean isElligibleForCreditCondit = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;

//        int income = 120_000;
//        if(income>100_000){
//        boolean hasHighInc = true;
//            System.out.println(hasHighInc);

        //not prof
//            int income1 = 120_000;
//            boolean hasHiIncome;
//            if(income1 > 100_000){
//               hasHiIncome = true;
//            }
//            else
//                hasHiIncome= false;


        //no need for else statement
        int income1 = 120_000;
        boolean hasHiIncome = false;
        if (income1 > 100_000) {
            hasHiIncome = true;
        }

        //professional way
        //insted of hardcoding false, we can remove if statements
        // if it s over 100k- its true, otherwise its false
        boolean hasHInc = (income1 > 100_000);


        //ternary operator
        int a1 = 1;
        int b1 = 2;
        int resultTernary;
// before ? - condition
        //can be used only if we have 1 statement in if block and 1 statement in else block
        //if condition is true- it goes to a1, otherwise to b1 if false

        resultTernary = a1 < b1 ? a1 : b1;
        System.out.println(" resultTernary is " + resultTernary);

        //switch statements= check condition
        //if many options with if else- switch is better
        //works with constant values

        int months = 6;
        String monthString;

        switch (months) {
            case 1:
                monthString = "Jan";
                break;
            //after break jump out of this block of code and move to the next
            case 2:
                monthString = "Feb";
            case 3:
                monthString = "Mar";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + months);
        }
    }

    @Test
    public void switchEx() {
        assertEquals("M", likelyGenderIs("sir"));
    }


    @Test
    public void moreTernary() {
        String url = "www.space.com";
        url = url.startsWith("http") ? url : addHttp(url);
        assertTrue(url.startsWith("http://"));
        assertEquals("http://www,spacex.com", url);
    }

    private String addHttp(String url) {
        return "http://www.gmail.com";
    }
    }


    @Test
    public void ifAddedHttp() {
        String url1 = "www.selenium.com";
        /*if url doesnt start with the url- then go to the method addHttp*/
        if (!url1.startsWith("http")) {
            url1 = addHttp(url1);
        }
        assertTrue(url1.startsWith("http://"));
        Assert.assertEquals("www.selenium.com", url1);
    }

    @Test
    public void ifElseAddHttp() {
        String url2 = "www.facebook.com";
        if (url2.startsWith("hhtp")) {
            //do nothing ifit starts with http
        } else {
            url2 = addHttp(url2);
        }
        assertTrue(url2.startsWith("http://"));
    }


    public Object likelyGenderIs(String title) {
        String likelyGender;
        switch (title.toLowerCase()) {
            case "sir":
                likelyGender = "M";
                break;
            case "mr":
                likelyGender = "M";
                break;
            switch (title.toLowerCase()) {
                case "sir":
                    likelyGender = "M";
                    break;
                case "mr":
                    likelyGender = "M";
                    break;
                default:
                    likelyGender = "F";
                    break;
            }
            return likelyGender;


        }

    }

}
//another way to write switch:


