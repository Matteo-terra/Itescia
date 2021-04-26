package Core.Tools;

public class MyDates {
    
    public MyDates(){}
    
    public String dateFRtoUS(String date){
        String[] dateHash = date.split("/");
        String year = dateHash[2];
        String month = dateHash[1];
        String day = dateHash[0];
        String newDate = year+"-"+month+"-"+day;
        return newDate;
    }
    
    public String dateUStoFR(String date){
        String[] dateHash = date.split("-");
        String year = dateHash[0];
        String month = dateHash[1];
        String day = dateHash[2];
        String newDate = day+"/"+month+"/"+year;
        return newDate;
    }
}