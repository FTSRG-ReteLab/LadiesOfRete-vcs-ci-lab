package hu.bme.mit.train_tachograph;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class Train_Tachograph {
    private Table<Integer,Integer,Integer> table = HashBasedTable.create();

    public void addElement()
    {
        table.put(0,0,0);
    }
     public Boolean HasElements(){
        return !table.isEmpty();
     }
}


