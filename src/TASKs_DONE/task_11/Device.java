package TASKs_DONE.task_11;

public class Device {

    private String company;
    private String name;
    private String type;
    private int price;
    private String status; //todo how to set by default "OFF"

    public Device(String name, int type, int price){
        this.name = name;
        this.type = setType(type);
        this.price = price;
        this.status = "OFF";
        this.company = null;
    }

    public String getType() {
        return type;
    }

    public String setType(int type) {
        if (type == 1){
            return "TV";
        }else {
            return "mobile phone";
        }
    }

    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public String getStatus() {
        return status;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public void on() {
        setStatus("ON");
    }
    public void off() {
        setStatus("OFF");
    }

    /*
    эта функция, после запуска, создает рандомное число, которое в последствии не изменяемо никак
     */
//    public void getSerial(){
//
//    }

}
