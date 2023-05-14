package PreMarcacao;

public class TimeCal {
    
    private String calendar;
    
    public TimeCal(){
    }
    
    public TimeCal(String calendar){
        this.calendar = calendar;
    }

    public String getCalendar() {
        return calendar;
    }

    public void setCalendar(String calendar) {
        this.calendar = calendar;
    }

    @Override
    public String toString() {
        return "TimeCal{" + "calendar=" + calendar + '}';
    }
}
