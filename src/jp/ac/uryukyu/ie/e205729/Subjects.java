package jp.ac.uryukyu.ie.e205729;

public class Subjects {

    /*name・・・科目名
    *unit_value・・・単位数
    */   
    private String name;
    private int unit_value;

    String getName()
    {return name;}

    int getUnit_value()
    {return unit_value;}

    Subjects(String name,int unit_value){
        this.name = name;
        this.unit_value = unit_value;

    }

    
    void PrintTest() {
        System.out.printf("%s  %d \n",name,unit_value);
    }

    
    
    
}
