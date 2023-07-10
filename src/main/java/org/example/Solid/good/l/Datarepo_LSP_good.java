package org.example.Solid.good.l;

import java.util.List;

public class Datarepo_LSP_good {
    private List<Integer> ListObj;

    public Datarepo_LSP_good(List<Integer> listObj){
        this.ListObj=listObj;
        initilizeDatarepo();
    }

   public void initilizeDatarepo(){
        ListObj.add(5);
        ListObj.add(589);
        ListObj.add(656);
        ListObj.add(569);
        ListObj.add(1888);
        ListObj.add(63);
        ListObj.add(852);
    }

    public void viewNumbers() {
        System.out.println("All the numbers are :");
        for (int i = 0; i < ListObj.size(); i++) {
            System.out.println(ListObj.get(i));
        }
    }

    public void addNumber(int numberTobeAdded) {
        ListObj.add(numberTobeAdded);
    }

    public void Update(int position, int updatedNumber) {
        if(position<ListObj.size())
        {
            ListObj.set(position-1,updatedNumber);
        }
        else{
            System.out.println("Invalid Position");
        }
    }

    public void deleteatPosition(int position) {
        ListObj.remove(position-1);
    }

    public boolean isEmpty(){
        if (ListObj.size()>0){
            return false;
        }
        else return true;
    }

    public int positionedAt(int numbertoFind) {
        if (!isEmpty()) {
            for (int i = 0; i < ListObj.size(); i++) {
                if (ListObj.get(i) == numbertoFind) {
                    return i+1;
                }
            }
        }
        return -1;
    }

    public int avg() {
        int sum=0;
        for (int i = 0; i <ListObj.size() ; i++) {
            sum += ListObj.get(i);
        }
        return (sum/ListObj.size());
    }

    public int square(int numbertobeSquared) {
        return numbertobeSquared*numbertobeSquared;
    }

    public void addAlltoList(int increment) {
        for (int i = 0; i < ListObj.size() ; i++) {
            ListObj.set(i,ListObj.get(i)+increment);
        }
    }

    public void multiplyAll(int mul) {
        for (int i = 0; i < ListObj.size() ; i++) {
            ListObj.set(i,(ListObj.get(i)*mul));
        }
    }
}