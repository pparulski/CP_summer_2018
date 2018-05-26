package pl.waw.sgh.pl.stocks;

public class Company {
    public String open;
    public String close;
    public String name;
    public Double change;

    public Company(String name, String open, String close) {
        this.name = name;
        this.open = open;
        this.close = close;
        this.change = calcChange();
    }


    // calculate change
    public Double calcChange() throws NumberFormatException {
        Double opening = Double.parseDouble(this.open);
        Double closing = Double.parseDouble(this.close);

        change = (closing - opening)/opening;
        return change;


    }

    public Double getChange() {
        return change;
    }



    public void setChange(Double change) {
        this.change = change;
    }

    public String getOpen() {
        return open;
    }
    public void setOpen(String open) {
        this.open = open;
    }
    public String getClose() {
        return close;
    }
    public void setClose(String close) {
        this.close = close;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //change to percentage format
    public static String toPercenteage(Double zmiana){
        return String.format("%.2f", zmiana*100);
    }

    @Override
    public String toString() {
        return "Company:" + name + " Open="
                + open + " Close=" + close  + " Change=" + toPercenteage(change) + "\n";
    }



}
