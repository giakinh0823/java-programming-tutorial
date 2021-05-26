/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyLine;

import java.util.Arrays;

/**
 *
 * @author GIA KINH
 */

class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        return new int[]{this.x, this.y};
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(int x, int y) {
        return (double) Math.sqrt(Math.pow((x - this.x), 2) + Math.pow((y - this.y), 2));
    }

    public double distance(MyPoint another) {
        return (double) Math.sqrt(Math.pow((another.x - this.x), 2) + Math.pow((another.y - this.y), 2));
    }
    
    public double distance() {
        return (double) Math.sqrt(Math.pow((0 - this.x), 2) + Math.pow((0 - this.y), 2));
    }

    @Override
    public String toString() {
        return "(" +x + "," + y + ')';
    }
}

public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    public MyLine(int x1, int y1,int x2,int y2) {
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2,y2);
    }
    
    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    public MyPoint getBegin() {
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }
    
    public void setBeginX(int x){
        this.begin.setX(x);
    }
    
    public int getBeginX(){
        return this.begin.getX();
    }
    
    public void setBeginY(int y){
        this.begin.setY(y);
    }
    
    public int getBeginY(){
        return this.begin.getY();
    }
    
    public void setEndX(int x){
        this.end.setX(x);
    }
    
    public int getEndX(){
        return this.end.getX();
    }
    
    public void setEndY(int y){
        this.end.setY(y);
    }
    
    public int getEndY(){
        return this.end.getY();
    }
    
    public void setBeginXY(int x, int y){
        this.begin.setXY(x, y);
    }
    
    public int[] getBeginXY(){
        return this.begin.getXY();
    }
    
    public void setEndXY(int x, int y){
        this.end.setXY(x, y);
    }
    
    public int[] getEndXY(){
        return this.end.getXY();
    }
    
    public double getLength(){
        return this.begin.distance(this.end);
    }
    
    public double getGradient(){
        return Math.atan2(this.end.getY()-this.begin.getY(), this.end.getX()-this.begin.getX());
    }

    @Override
    public String toString() {
        return "MyLine[" + "begin=" + begin + ",end=" + end + ']';
    }
}


class TestMyLine{
    public static void main(String[] args) {
           MyLine myLine = new MyLine(new MyPoint(0, 1), new MyPoint(3, 4));
           System.out.println(myLine.getLength());
           System.out.println(myLine.getGradient());
           System.out.println(myLine.toString());
           System.out.println(Arrays.toString(myLine.getBeginXY()));
           System.out.println(Arrays.toString(myLine.getEndXY()));
    }
}