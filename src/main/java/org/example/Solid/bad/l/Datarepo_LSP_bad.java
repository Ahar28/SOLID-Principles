package org.example.Solid.bad.l;

import java.util.ArrayList;
public class Datarepo_LSP_bad {
    private ArrayList<Integer> integerArrayList;

    public Datarepo_LSP_bad(){
        integerArrayList = new ArrayList<Integer>();
        initilizeDatarepo();
    }

    public void initilizeDatarepo(){
        integerArrayList.add(5);
        integerArrayList.add(190);
        integerArrayList.add(656);
        integerArrayList.add(54);
        integerArrayList.add(123);
        integerArrayList.add(3);
        integerArrayList.add(7);
        integerArrayList.add(24);
    }

    public void viewNumbers() {
        System.out.println("All the numbers are :");
        for (int i = 0; i < integerArrayList.size(); i++) {
            System.out.println(integerArrayList.get(i));
        }
    }

    public void addNumber(int numberTobeAdded) {
        integerArrayList.add(numberTobeAdded);
    }

    public void Update(int position, int updatedNumber) {
        if(position<integerArrayList.size())
        {
            integerArrayList.set(position-1,updatedNumber);
        }
        else{
            System.out.println("Invalid Position");
        }
    }

    public void deleteAtPosition(int position) {
        integerArrayList.remove(position-1);
    }

    public boolean isEmpty(){
        if (integerArrayList.size()>0){
            return false;
        }
        else return true;
    }

    public int positionedAt(int numbertoFind) {
        if (!isEmpty()) {
            for (int i = 0; i < integerArrayList.size(); i++) {
                if (integerArrayList.get(i) == numbertoFind) {
                    return i+1;
                }
            }
        }
        return -1;
    }

    public int avg() {
        int sum=0;
        for (int i = 0; i <integerArrayList.size() ; i++) {
            sum += integerArrayList.get(i);
        }
        return (sum/integerArrayList.size());
    }

    public int square(int numbertobeSquared) {
        return numbertobeSquared*numbertobeSquared;
    }

    public void addAlltoList(int increment) {
        for (int i = 0; i < integerArrayList.size() ; i++) {
            integerArrayList.set(i,integerArrayList.get(i)+increment);
        }
    }

    public void multiplyAll(int mul) {
        for (int i = 0; i < integerArrayList.size() ; i++) {
            integerArrayList.set(i,integerArrayList.get(i)*mul);
        }
    }
}