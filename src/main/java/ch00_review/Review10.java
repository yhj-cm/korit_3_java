package ch00_review;

class Data {
    private int Data;
    private String strData;

    public int getData() {
        return Data;
    }

    public void setData(int data) {
        Data = data;
    }

    public String getStrData() {
        return strData;
    }

    public void setStrData(String strData) {
        this.strData = strData;
    }
}



public class Review10 {


    public static void main(String[] args) {
        Data data1 = new Data();
        data1.setData(1750);
        data1.setStrData("집가는시간!@@!@!@!@!@!@!@!@!@!@!@");
        System.out.println("오늘 " + data1.getData() + "은 " + data1.getStrData() );




    }
}
