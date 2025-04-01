package com.test.prototype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataBase implements Cloneable
{
    private int id;
    private List<Integer> datas;

    public int getId() {
        return id;
    }

    public List<Integer> getDatas() {
        return datas;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "DataBase{" +
                "id=" + id +
                ", datas=" + datas +
                '}';
    }

    public void loadData() throws InterruptedException
    {
        Thread.sleep(5000);
        datas = Arrays.asList(9, 11, 3, 10, 23, 41);
    }
    public void setDatas(List<Integer> datas)
    {
        this.datas = datas;
    }

    @Override
    public Object clone() throws CloneNotSupportedException
    {

        DataBase db = (DataBase) super.clone();

        List<Integer> tempList = new ArrayList<>(db.getDatas());

       db.setDatas(tempList);
        return db;

    }


}
